package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.vo.UserVO;

@RequestMapping("/users")
@RestController
//@Api(value = "User's services", description = "User services to save anget the user information")
public class UserController {

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Autowired
	UserService userService;

	@PostMapping()
	public ResponseEntity<UserVO> save(@RequestBody UserVO userVO) {
		userVO = userService.saveUsers(userVO);
		return ResponseEntity.status(HttpStatus.OK).body(userVO);

	}

}
