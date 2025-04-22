package com.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserRepo;
import com.boot.entities.Users;


@Service
public class MyServices {
	
	@Autowired
	UserRepo userRepo;
	
	public List<Users> getAllData()
	{
		try {

			//Optional<Users> user = userrepo.findById(3);
			Iterable<Users> userlist = userRepo.findAll();
			return (List<Users>)userlist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public Optional<Users> getonedata(int id)
	{
		Optional<Users> user = userRepo.findById(id);
		return user;
	}
	
	public List<Users> getdatabyname(String name)
	{
		List<Users> users = userRepo.findByName(name);
		return users;
	}
	
	public List<Users> getdatabyprefix(String prefix)
	{
		List<Users> users = userRepo.findByNameStartingWith(prefix);
		return users;
	}

}
