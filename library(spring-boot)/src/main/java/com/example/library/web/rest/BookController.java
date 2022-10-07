package com.example.library.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.domain.Book;
import com.example.library.persistence.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@ResponseBody
	@RequestMapping(value="/Book", method=RequestMethod.GET)
	public List<Book> getAll(){
		return bookRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping (value="/Book", method=RequestMethod.POST)
	public Book saveBook(@RequestBody Book book) {
		
			return bookRepository.save(book);
		
	}
	
	@ResponseBody
	@RequestMapping (value="/Book/delete", method=RequestMethod.POST)
	public void delete(@RequestBody Book book) {
		bookRepository.delete(book);
}
	@ResponseBody
	@RequestMapping (value="/Book/edit", method=RequestMethod.POST)
	public Book edit(@RequestBody Book book) {
		
			return bookRepository.save(book);
}
}
