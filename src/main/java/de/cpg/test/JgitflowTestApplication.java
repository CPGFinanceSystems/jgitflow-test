package de.cpg.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JgitflowTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JgitflowTestApplication.class, args);
	}

	@Override
	public void run(final String... strings) throws Exception {
	}
}
