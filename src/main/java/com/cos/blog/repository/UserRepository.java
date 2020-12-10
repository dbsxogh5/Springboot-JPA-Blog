package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cos.blog.model.User;


// DAO
// 자동으로 bean등록이 된다. @Repository 생략가능
public interface UserRepository extends JpaRepository<User, Integer> { // User repository, 기본키가 int
	Optional<User> findByUsername(String username);
}



// JPA Naming 쿼리 전략
// SELECT * FROM user WHERE username = ?1 AND password = ?2;
//User findByUsernameAndPassword(String username,String password);

/*
@Query(value = "SELECT * FROM user WHERE username = ?1 AND password = ?2", nativeQuery = true )
User login(String username, String password);*/