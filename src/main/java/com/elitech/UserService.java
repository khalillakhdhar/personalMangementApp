package com.elitech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitech.model.entity.User;
import com.elitech.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	public User addOneUser(User user)
	{
		return userRepository.save(user);
		
	}
	public void deleteOneUser(int id)
	{
		if(userRepository.existsById(id))
		{
			userRepository.deleteById(id);
		}
		else
		{
			System.out.println("unfound user with id "+id);
		}
	}
	public User findOneUser(int id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	

}
