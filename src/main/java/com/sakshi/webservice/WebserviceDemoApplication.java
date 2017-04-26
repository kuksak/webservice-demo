package com.sakshi.webservice;

import com.sakshi.webservice.domain.Design;
import com.sakshi.webservice.repository.DesignRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sun.tools.jar.CommandLine;

import java.util.Arrays;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class WebserviceDemoApplication {

	@Bean
	CommandLineRunner init(DesignRepository designRepository){

        return (event) -> Arrays.asList("Amit", "Sakshi").stream().map(s -> {
            Design d = new Design();
            d.setAuthor(s);
            d.setDesignNumber(UUID.randomUUID().toString());
            return d;
        })
        .forEach(design -> designRepository.save(design));

	}

	public static void main(String[] args) {
		SpringApplication.run(WebserviceDemoApplication.class, args);
	}
}
