package com.example.library.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.domain.BookDetail;

public interface BookDetailRepository extends JpaRepository<BookDetail,Integer>{

	// List<BookDetail> findAll();
}
