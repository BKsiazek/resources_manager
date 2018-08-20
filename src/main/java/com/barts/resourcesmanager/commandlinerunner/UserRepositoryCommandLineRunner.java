package com.barts.resourcesmanager.commandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.barts.resourcesmanager.entity.User;
import com.barts.resourcesmanager.repository.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("ROLE_USER", "john_hyde","John", "Hyde", "johnhyde");
		userRepository.save(user1);
		log.info("New user is created: " + user1);
		
		User user2 = new User("ROLE_ADMIN", "klaudusia","Klaudia", "Chec", "klaudusia");
		userRepository.save(user2);
		log.info("New user is created: " + user2);
		
		User user3 = new User("ROLE_ADMIN", "admin","Bartlomiej", "Ksiazek", "admin");
		userRepository.save(user3);
		log.info("New user is created: " + user3);
		
		User user4 = new User("ROLE_USER", "user","Zwykly", "Uzytkownik", "user");
		userRepository.save(user4);
		log.info("New user is created: " + user4);
	}

}
