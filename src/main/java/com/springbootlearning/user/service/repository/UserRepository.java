package com.springbootlearning.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootlearning.user.service.entity.User;

/**
 * A user repository interface.
 * 
 * @author Sarat
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
