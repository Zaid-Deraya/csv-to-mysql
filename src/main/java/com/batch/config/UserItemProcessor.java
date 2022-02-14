package com.batch.config;

import org.springframework.batch.item.ItemProcessor;
import com.batch.model.User;

public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		// TODO Auto-generated method stub
		return user;
	}

}
