package com.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.entities.Users;

public interface UserRepo extends CrudRepository<Users, Integer>{
	

}
