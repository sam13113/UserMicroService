/**
 * 
 */
package com.springbootlearning.user.service.VO;

import com.springbootlearning.user.service.entity.User;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A VO class that contains both User and Department details
 * 
 * @author Sarat
 *
 */
@Data
@NoArgsConstructor
public class ResponseTemplateVO {
	private User user;
	private Department department;

}


