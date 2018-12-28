package org.sj.msapprepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MsAppRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAppRepoApplication.class, args);
	}

}

