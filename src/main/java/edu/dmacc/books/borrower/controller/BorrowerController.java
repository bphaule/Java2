package edu.dmacc.books.borrower.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import edu.dmacc.books.books.service.BookService;

@Controller
public class BorrowerController {
		@Autowired BookService bookService;
		
     	//===============
		// BorrowerPages
		//===============
		// Borrower Menu        
		@RequestMapping(value="/BorrowerMenu")
		public ModelAndView borrowerMenu(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BorrowerPages/Borrowers");
			return modelAndView;
		}
		
		// Borrower - Add
		@RequestMapping(value="/BorrowerAdd")
		public ModelAndView borrowerAdd(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BorrowerPages/BorrowerAdd");
			return modelAndView;
		}
		// Borrower - Modify
		@RequestMapping(value="/BorrowerModify")
		public ModelAndView borrowerModify(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BorrowerPages/BorrowerModify");
			return modelAndView;
		}
		
		// Borrower - Delete
		@RequestMapping(value="/BorrowerDelete")
		public ModelAndView borrowerDelete(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("BorrowerPages/BorrowerDelete");
			return modelAndView;
		}
}
