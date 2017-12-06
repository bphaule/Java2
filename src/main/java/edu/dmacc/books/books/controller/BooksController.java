package edu.dmacc.books.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.books.books.data.Books;
import edu.dmacc.books.books.service.BookService;

@Controller
public class BooksController {
		@Autowired BookService bookService;
		
		private static final String[ ] countries = { "United States", "Canada", "Great Britain", "Germany" };

		@RequestMapping(value="/MainForm")
		public ModelAndView mainForm(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("mainForm");
			return modelAndView;
		}
		
		//============
		// BookPages
		//============
		// Book Menu
		@RequestMapping(value="/Books") 
		public ModelAndView books(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BookPages/Books");
			return modelAndView;
		}
		
		/*
		// Add Books
		@RequestMapping(value="/BookAdd")
		public ModelAndView BookAdd(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BookAdd");
			return modelAndView;
		}
		*/
		
		@RequestMapping(value="/BookAdd")
		public ModelAndView user(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BookPages/BookAdd");
			modelAndView.addObject("books", new Books( ));
			modelAndView.addObject("countries", countries);
			return modelAndView;
		}
		
		@RequestMapping(value = "/BookAddResult")
		public ModelAndView bookAddResult(Books books){
			ModelAndView modelAndView = new ModelAndView();
			// do not want to call data access layer from controller
			//   ==>  	dao.insertUser(books);
			// call service
			Books savebook = bookService.add(books);
						
			modelAndView.setViewName("BookPages/BookAddResult");
			modelAndView.addObject("u", savebook);
			return modelAndView;
		}

		// Modify Books
		@RequestMapping(value="/BookModify")
		public ModelAndView bookModify(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BookPages/BookModify");
			return modelAndView;
		}
		
		// Delete Books
		@RequestMapping(value="/BookDelete")
		public ModelAndView bookDelete(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BookPages/BookDelete");
			return modelAndView;
		}

		//============
		// CheckPages
		//============
		@RequestMapping(value = "/CheckPages")
		public ModelAndView checkPage() {
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("CheckPages/CheckOut");
			return modelAndView;
		}
		
		@RequestMapping(value ="/CheckIn")
		public ModelAndView checkIn(@ModelAttribute("books")Books books)
		{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("CheckPages/CheckIn");
			//bookService.checkIn(books.getIsbn());
			return modelAndView;
		}
}