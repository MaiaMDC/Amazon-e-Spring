package br.com.casadocodigo.loja.infra;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;

@Component
public class FileSaver {

	@Autowired
	private AmazonS3 amazonS3;

	public String write(MultipartFile file) {
		try {
			
			
		} catch (IllegalStateException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}









