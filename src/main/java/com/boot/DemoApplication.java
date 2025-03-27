package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.dao.UserRepo;
import com.boot.entities.Users;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		UserRepo userrepo = (UserRepo) context.getBean("userRepo");
		
		Users user = new Users();
		
		user.setName("rohith");
		user.setPassword("qwerty");
		
		userrepo.save(user);
		
		System.out.print(user);
		
		// automatically done using springboot
		
	}

}
