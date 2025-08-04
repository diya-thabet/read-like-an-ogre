package com.fenenc.read_like_an_ogre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReadLikeAnOgreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadLikeAnOgreApplication.class, args);
	}

}
