/**
 * 
 */
package com.springbootlearning.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springbootlearning.user.service.VO.Department;
import com.springbootlearning.user.service.VO.ResponseTemplateVO;
import com.springbootlearning.user.service.entity.User;
import com.springbootlearning.user.service.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Service class for User
 * 
 * @author Sarat
 *
 */
@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;
	@Value("${app.department.service.url}")
	private String departmentServiceUrl;

	public User saveUser(User user) {
		log.info("Inside save method of service class");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserwithDepartment(Long userId) {
		log.info("Inside getter method of service class with department id");
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();

		User user = userRepository.findById(userId).get();

		log.info("fetching the department details from department microservice...");
		ResponseEntity<Department> department = restTemplate
				.getForEntity(departmentServiceUrl + user.getDepartmentId(), Department.class);

		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department.getBody());
		return responseTemplateVO;
	}

}
