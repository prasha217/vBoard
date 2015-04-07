package com.livingoncodes.vBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livingoncodes.vBoard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	public Board findByName(String name);
}