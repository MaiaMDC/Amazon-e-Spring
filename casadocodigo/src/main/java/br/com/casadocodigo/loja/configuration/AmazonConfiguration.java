package br.com.casadocodigo.loja.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfiguration {

	private static final String ACCESS_KEY = "AKIA3LLVEUKQ4LV4QSWH";
	private static final String SECRET_KEY = "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";
	private static final String REGION = "us-east-1";

	@Bean
	public BasicAWSCredentials basicAWSCredentials() {
		return new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
	}

	@Bean
	public AmazonS3 amazonS3() {
		return AmazonS3ClientBuilder.standard().withRegion(REGION)
				.withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials())).build();
	}
}
