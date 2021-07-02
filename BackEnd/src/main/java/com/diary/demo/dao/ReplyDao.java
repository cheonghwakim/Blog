package com.diary.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diary.demo.dto.Reply;

@Repository
public interface ReplyDao extends JpaRepository<Reply, String> {

}
