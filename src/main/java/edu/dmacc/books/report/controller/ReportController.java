package edu.dmacc.books.report.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.books.books.data.Books;
import edu.dmacc.books.books.service.BookService;
import edu.dmacc.books.borrowedbooks.BorrowedBooks;
import edu.dmacc.books.borrowedbooks.BorrowedBooksDao;
import edu.dmacc.books.borrower.data.Borrower;


@Controller
public class ReportController {
	
		//=============
		// ReportPages
		//=============
		//@RequestMapping(value = "/viewAll")
		//public ModelAndView viewAll( ){
		////	System.out.println("viewAll 1");
		//	ModelAndView modelAndView = new ModelAndView();
		////	System.out.println("viewAll 2");
		//	List<Books> allUsers = dao.getAllUsers();
		////	System.out.println("viewAll 3");
		//	modelAndView.setViewName("viewAllUsers");
		////	System.out.println("viewAll 4");
		//	modelAndView.addObject("all", allUsers);
		////	System.out.println("viewAll 5");
		//	return modelAndView;
		//}
		@Autowired BookService bookService;
		@Autowired BorrowedBooksDao bdao;
		
		@RequestMapping(value = "/ReportPage")
		public ModelAndView reportPage() {
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("ReportPages/ReportPage");
			return modelAndView;
		}
		
		@RequestMapping(value = "/ReportAll")
		public ModelAndView reportAll() {
			ModelAndView modelAndView = new ModelAndView();
			List<Books> allBooks = bookService.getAllBooks();
			modelAndView.setViewName("ReportPages/ReportAll");
			modelAndView.addObject("all", allBooks);
			return modelAndView;
		}
		
		@RequestMapping(value = "/ReportOut")
		public ModelAndView reportOut() {
			
			ModelAndView modelAndView = new ModelAndView();
			List<BorrowedBooks> outBooks = bdao.getBorrowedBooks();
			modelAndView.setViewName("ReportPages/ReportOut");
			modelAndView.addObject("all", outBooks);
			return modelAndView;
			
		}
		
		@RequestMapping(value = "/ReportPrint")
		public ModelAndView reportPrint() {
			
			ModelAndView modelAndView = new ModelAndView();
			List<Borrower> borrower = bookService.getAllBorrowers();
			modelAndView.setViewName("ReportPages/ReportPrint");
			modelAndView.addObject("all", borrower);
			return modelAndView;
			
		}
}