package com.cg.cars.services;

import com.cg.cars.models.User;

public interface IUserService {
	public User signIn(long userId, String password);
	public User signOut(User user);
	public User changePassword(long id, User user);
	
	
}
