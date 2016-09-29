package de.cpg.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class JgitflowTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JgitflowTestApplication.class, args);
	}

	@Override
	public void run(final String... strings) throws Exception {
        log.info("First release");
	}
}
