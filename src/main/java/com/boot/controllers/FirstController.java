package com.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entities.Users;
import com.boot.services.MyServices;

@RestController
public class FirstController {
	
	@Autowired
	MyServices myServices;
	
	@GetMapping("/users")
	public List<Users> allusers()
	{
		try {
			
			List<Users> ulist = myServices.getAllData();
			return ulist;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	@GetMapping("/users/{id}")
	public Optional<Users> oneuser(@PathVariable("id") int id)
	{
		Optional<Users> result = myServices.getonedata(id);
		return result;
	}
	
	
	@GetMapping("/users/name/{name}")
	public List<Users> userbyname(@PathVariable("name") String name)
	{
		List<Users> result = myServices.getdatabyname(name);
		return result;
	}
	
	@GetMapping("/users/names/prefix/{prefix}")
	public List<Users> userwithprefix(@PathVariable("prefix") String prefix)
	{
		List<Users> result = myServices.getdatabyprefix(prefix);
		return result;
	}
	
	@PostMapping("/users")
	public String saveuser(@RequestBody Users u)
	{
		String result = myServices.setuserentry(u);
		return result;
		
	}
		

}
