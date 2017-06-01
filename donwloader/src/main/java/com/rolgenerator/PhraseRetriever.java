package com.rolgenerator;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

// TODO: Auto-generated Javadoc
/**
 * The Class PhraseRetriever.
 */
@Component
public class PhraseRetriever {

	/**
	 * Download.
	 *
	 * @param documento the documento
	 * @return the byte[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@HystrixCommand(fallbackMethod = "retrieveFallbackDownload")
	public byte[] download(int documento) throws IOException {
		ClassPathResource pdfFile = null;
		switch (documento) {
		case 0:
			pdfFile = new ClassPathResource("l5a.pdf");
			break;
		case 1:
			pdfFile = new ClassPathResource("l5a_ficha.pdf");
			break;
		case 2:
			pdfFile = new ClassPathResource("l5a_tierras.pdf");
			break;
		case 3:
			pdfFile = new ClassPathResource("l5a_director.pdf");
			break;
		case 4:
			pdfFile = new ClassPathResource("cthulhu.pdf");
			break;
		case 5:
			pdfFile = new ClassPathResource("cthulhu_ficha.pdf");
			break;
		}

		System.out.println("pdfFile contiene el archivo " + pdfFile.getFilename());
		
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(pdfFile.getFile()));
		long size = pdfFile.getFile().length();

		byte[] resultado = convertStreamToByteArray(stream, size);
		System.out.println("El resultado contiene " + resultado);
		return resultado;
	}

	/**
	 * Retrieve fallback download.
	 *
	 * @param documento the documento
	 * @return the byte[]
	 */
	public byte[] retrieveFallbackDownload(int documento) {
		System.out.println("Algo ha ido mal");
		return null;
	}

	/**
	 * Convert stream to byte array.
	 *
	 * @param stream the stream
	 * @param size the size
	 * @return the byte[]
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public byte[] convertStreamToByteArray(BufferedInputStream stream, long size) throws IOException {

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		// to make it easier to change to 8 or 16 KBs
		// make some tests to determine the best performance for your case
		int FILE_CHUNK_SIZE = 1024 * 4;
		byte[] chunk = new byte[FILE_CHUNK_SIZE];
		int bytesRead = 0;
		while ((bytesRead = stream.read(chunk)) != -1) {
			outStream.write(chunk, 0, bytesRead);
		}
		stream.close();
		outStream.flush();
		outStream.close();
		return outStream.toByteArray();
	}
}
