package com.boot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.entities.Users;

public interface UserRepo extends CrudRepository<Users, Integer>{
	
	public List<Users> findByName(String name);
	public List<Users> findByNameStartingWith(String prefix);
	

}
