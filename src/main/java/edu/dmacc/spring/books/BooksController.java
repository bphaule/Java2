package edu.dmacc.spring.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.spring.books.Books;
import edu.dmacc.spring.books.BooksDao;

@Controller
public class BooksController {
		@Autowired BooksDao dao;
		@Autowired BookService bookService;
		
		private static final String[ ] countries = { "United States", "Canada", "Great Britain", "Germany" };

		@RequestMapping(value="/mainForm")
		public ModelAndView mainForm(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("mainForm");
			return modelAndView;
		}
		
		@RequestMapping(value="/form")
		public ModelAndView user(){
			ModelAndView modelAndView = new ModelAndView( );
			
			modelAndView.setViewName("userForm");
			modelAndView.addObject("books", new Books( ));
			modelAndView.addObject("countries", countries);
			
			return modelAndView;
		}
		
		@RequestMapping(value = "/result")
		public ModelAndView processUser(Books books){
			//System.out.println("In processUser");
			ModelAndView modelAndView = new ModelAndView();
			dao.insertUser(books);
			//System.out.println("Value in getName"+ user.getName());
			modelAndView.setViewName("userResult");
			modelAndView.addObject("u", books);
			return modelAndView;
		}
		
		@RequestMapping(value = "/viewAll")
		public ModelAndView viewAll( ){
		//	System.out.println("viewAll 1");
			ModelAndView modelAndView = new ModelAndView();
		//	System.out.println("viewAll 2");
			List<Books> allUsers = dao.getAllUsers();
		//	System.out.println("viewAll 3");
			modelAndView.setViewName("viewAllUsers");
		//	System.out.println("viewAll 4");
			modelAndView.addObject("all", allUsers);
		//	System.out.println("viewAll 5");
			return modelAndView;
		}
		
		@RequestMapping(value = "/checkPage")
		public ModelAndView checkPage() {
			
			ModelAndView modelAndView = new ModelAndView();
			return modelAndView;
			
		}
		
		@RequestMapping(value ="/checkin")
		public ModelAndView checkin(@ModelAttribute("books")Books books)
		{
			ModelAndView modelAndView = new ModelAndView();
			bookService.checkIn(books.getIsbn());
			return modelAndView;
		}
		
		@RequestMapping(value="/addBook")
		public ModelAndView addBook(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("addBook");
			return modelAndView;
		}
		
		@RequestMapping(value="/modBook")
		public ModelAndView modBook(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("modBook");
			return modelAndView;
		}
		
		@RequestMapping(value="/delBook")
		public ModelAndView delBook(){
			ModelAndView modelAndView = new ModelAndView( );
			modelAndView.setViewName("delBook");
			return modelAndView;
		}
		
		
					
}

