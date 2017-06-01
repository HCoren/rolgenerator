package com.rolgenerator;

import java.util.HashMap;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rolgenerator.bean.DatosMail;

@Component
public class PhraseRetriever {

	@Autowired
	private JavaMailSender javaMailSender;

	@HystrixCommand(fallbackMethod = "retrieveFallbackMailer")
	public String sendMail(DatosMail datosMail) throws JSONException {
		MimeMessage mail = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mail, true);
			helper.setTo("FakeSMTP@localhost");
			helper.setFrom(datosMail.getMail());
			helper.setSubject("Sugerencia de " + datosMail.getNombre());
			helper.setText(datosMail.getContenido());
		} catch (MessagingException e) {
			e.printStackTrace();
		} finally {
		}
		try {
			javaMailSender.send(mail);
		} catch (MailException e) {
			e.printStackTrace();
		}
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("resultado", "Su mensaje ha quedado registrado");
		return new JSONObject(map).toString();
	}

	public String retrieveFallbackMailer(DatosMail index) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}
}
