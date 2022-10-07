package com.example.library.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book implements Serializable {

	public Book(Integer bookID, String imgurl, String bookname, String author, String year, String description) {
		super();
		this.bookId = bookID;
		this.imgurl = imgurl;
		this.bookname = bookname;
		this.author = author;
		this.year = year;
		this.description = description;
	
	}

	public Integer getBookID() {
		return bookId;
	}

	public void setBookID(Integer bookID) {
		this.bookId = bookID;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	



	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	Book() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer bookId;

	public String imgurl;
	public String bookname;
	public String author;
	public String year;
	public String description;
}
