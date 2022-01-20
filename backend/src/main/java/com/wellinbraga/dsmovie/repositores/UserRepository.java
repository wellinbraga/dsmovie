package com.wellinbraga.dsmovie.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellinbraga.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
