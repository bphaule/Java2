package edu.dmacc.books.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.books.books.dao.BooksDao;
import edu.dmacc.books.books.data.Books;

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
		@RequestMapping(value = "/ReportPage")
		public ModelAndView reportPage() {
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("ReportPages/ReportPage");
			return modelAndView;
		}
		
		@RequestMapping(value = "/ReportAll")
		public ModelAndView reportAll() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("ReportPages/ReportAll");
			return modelAndView;
		}
		
		@RequestMapping(value = "/ReportOut")
		public ModelAndView reportOut() {
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("ReportPages/ReportOut");
			return modelAndView;
			
		}
		
		@RequestMapping(value = "/ReportPrintBooks")
		public ModelAndView reportPrint() {
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("ReportPages/ReportPrint");
			return modelAndView;
			
		}
}