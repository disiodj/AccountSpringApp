package com.quicktutorials.learnmicroservices.AccountMicroservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*Command Line runner permette di effettuare una serie di operazioni
* prima che l'applicazione si avvii*/
public class AccountMicroservicesApplication implements CommandLineRunner {
public static final Logger log = LoggerFactory.getLogger(AccountMicroservicesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AccountMicroservicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello 1");
	}
}
