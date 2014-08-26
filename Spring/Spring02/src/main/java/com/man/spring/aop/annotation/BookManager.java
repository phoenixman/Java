package com.man.spring.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class BookManager {
	public void addBook(){
		System.out.println("adding books");
	}
	
	public void getBook(){
		System.out.println("getting book");
	}
	
	
}
