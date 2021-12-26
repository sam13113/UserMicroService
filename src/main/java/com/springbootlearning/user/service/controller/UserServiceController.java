/**
 * 
 */
package com.springbootlearning.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootlearning.user.service.VO.ResponseTemplateVO;
import com.springbootlearning.user.service.entity.User;
import com.springbootlearning.user.service.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller class for User services.
 * 
 * @author Sarat
 *
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserServiceController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ResponseTemplateVO getUserwithDepartment(@RequestParam Long id) {
		log.info("Inside getUserwithDepartment method of service controller");
		return userService.getUserwithDepartment(id);
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside save user method of service controller");
		return userService.saveUser(user);
	}

}
