package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRespository;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRespository userRespository;
	
	@Override
	public UserVO saveUsers(UserVO userVO) {
		Users user = new Users();
		user.setName(userVO.getName());
		user.setEmail(userVO.getEmail());
		user.setActive(userVO.getActive());
		userRespository.saveAndFlush(user);
		return userVO;
	}

}
