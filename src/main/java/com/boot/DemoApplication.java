package com.boot;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
		
		
	/*	// adding users to database
		
		Users user = new Users();
		
		user.setName("gupta");
		user.setPassword("Asdfg");
		
		Users u2 = new Users();
		
		u2.setName("shivani");
		u2.setPassword("Zxcvb");
		
		List<Users> user1 = List.of(user,u2);
		
		List<Users> result =  (List<Users>) userrepo.saveAll(user1);
		
		System.out.print(result);
------------------------------------------------------------------------------------------- */
		
		// retriving the data from data base
		
		
		/*
		 * try {
		 * 
		 * //Optional<Users> user = userrepo.findById(3); Iterable<Users> userlist =
		 * userrepo.findAll(); for (Users users : userlist) { System.out.println(users);
		 * } } catch (Exception e) {
		 * System.out.println("error while retriving the data"); }
		 */
//--------------------------------------------------------------------------------------------
		
		//deleting data from the database
		
		/*
		 * Iterable<Integer> itr = List.of(2,3);
		 * 
		 * userrepo.deleteAllById(itr);
		 * 
		 * System.out.print("deleted");
---------------------------------------------------------------------------------------------*/
		
		//update
		//to use try catch block here for optional
		/*
		 * Optional<Users> user = userrepo.findById(1);
		 * 
		 * Users u1 = user.get();
		 * 
		 * u1.setName("Rohith Gupta");
		 * 
		 * Users u2 = userrepo.save(u1);
		 * 
		 * System.out.println(u2);
		 
---------------------------------------------------------------------------------------------*/

		
		
		
		
		
	}

}
