package com.example.library.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.library.domain.Book;
import com.example.library.domain.BookDetail;
import com.example.library.persistence.BookDetailRepository;


@Controller
public class BookDetailController {

	@Autowired
	private BookDetailRepository bookdetailRepository;
	
	@ResponseBody
	@RequestMapping(value="/BookDetail", method=RequestMethod.GET)
	public List<BookDetail> getAll(){
		return bookdetailRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping (value="/BookDetail", method=RequestMethod.POST)
	public BookDetail saveBook(@RequestBody BookDetail bookdetail) {
		
			return bookdetailRepository.save(bookdetail);		
	}
	@ResponseBody
	@RequestMapping (value="/BookDetail/delete", method=RequestMethod.POST)
	public void delete(@RequestBody BookDetail bookdetail) {
		bookdetailRepository.delete(bookdetail);
}
}


