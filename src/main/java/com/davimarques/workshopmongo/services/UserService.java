package com.davimarques.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davimarques.workshopmongo.domain.User;
import com.davimarques.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}

}
