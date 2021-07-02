package com.diary.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diary.demo.dto.Board;

@Repository
public interface BoardDao extends JpaRepository<Board, String> {

}
