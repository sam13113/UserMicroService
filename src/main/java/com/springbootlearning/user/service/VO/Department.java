package com.springbootlearning.user.service.VO;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This is the POJO for Department entity which we will get from department microservice.
 * 
 * @author Sarat
 *
 */
@Data
@NoArgsConstructor
public class Department{
	private Long id;
	private String departmentName;
	private String departmentAddress;
	
}