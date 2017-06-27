package com.probando.algo.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User , Long> {
	
    List<User> findByLastname (String lastname);
    User findById (Long id);
    User findByUsername (String username);

}
