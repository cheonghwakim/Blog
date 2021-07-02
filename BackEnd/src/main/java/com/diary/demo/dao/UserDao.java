package com.diary.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diary.demo.dto.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

}
