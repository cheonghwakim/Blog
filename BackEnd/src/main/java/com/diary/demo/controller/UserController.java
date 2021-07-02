package com.diary.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diary.demo.dao.UserDao;
import com.diary.demo.dto.User;

@CrossOrigin
@RestController("/user")
public class UserController {

	@Autowired
	UserDao userDao;

	// 회원가입 & Update
	@PostMapping
	public ResponseEntity<?> Signup(@RequestBody User user){	
		userDao.save(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	// 회원 정보 불러오기
	@GetMapping("/{userId}")
	public ResponseEntity<?> Mypage(@PathVariable String userId){	
		Optional<User> user;
		try {
			user = userDao.findById(userId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("failed", HttpStatus.CONFLICT);
		}
			
		return new ResponseEntity<>(user.get(), HttpStatus.OK);
	}

	// Delete
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> DeleteUser(@PathVariable String userId){	
		userDao.deleteById(userId);
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}

// CRUD