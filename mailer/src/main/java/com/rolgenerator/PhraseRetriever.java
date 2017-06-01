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
import com.rolgenerator.dto.DatosMailDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseRetriever.
 */
@Component
public class PhraseRetriever {

	/** The java mail sender. */
	@Autowired
	private JavaMailSender javaMailSender;

	/**
	 * Send mail.
	 *
	 * @param datosMail the datos mail
	 * @return the string
	 * @throws JSONException the JSON exception
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackMailer")
	public String sendMail(DatosMailDTO datosMail) throws JSONException {
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

	/**
	 * Retrieve fallback mailer.
	 *
	 * @param index the index
	 * @return the string
	 */
	public String retrieveFallbackMailer(DatosMailDTO index) {
		HashMap <String, String> map = new HashMap <String, String>();
		map.put("resultado", "Ha surgido algún error durante el proceso de alta");
		return new JSONObject(map).toString();
	}
}
