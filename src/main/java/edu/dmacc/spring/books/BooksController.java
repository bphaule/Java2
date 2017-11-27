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
	@Autowired
	BooksDao dao;
	@Autowired
	BookService bookService;

	private static final String[] countries = { "United States", "Canada", "Great Britain", "Germany" };

	@RequestMapping(value = "/form")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("userForm");
		modelAndView.addObject("books", new Books());
		modelAndView.addObject("countries", countries);

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUser(Books books) {
		// System.out.println("In processUser");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertUser(books);
		// System.out.println("Value in getName"+ user.getName());
		modelAndView.setViewName("userResult");
		modelAndView.addObject("u", books);
		return modelAndView;
	}

	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		// System.out.println("viewAll 1");
		ModelAndView modelAndView = new ModelAndView();
		// System.out.println("viewAll 2");
		List<Books> allUsers = dao.getAllUsers();
		// System.out.println("viewAll 3");
		modelAndView.setViewName("viewAllUsers");
		// System.out.println("viewAll 4");
		modelAndView.addObject("all", allUsers);
		// System.out.println("viewAll 5");
		return modelAndView;
	}

	@RequestMapping(value = "/checkPage")
	public ModelAndView checkPage() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("books", new Books());
		return modelAndView;

	}

	@RequestMapping(value = "/checkin")
	public ModelAndView checkin(@ModelAttribute("books") Books books) {
		ModelAndView modelAndView = new ModelAndView();
		bookService.checkIn(books.getIsbn());
		return modelAndView;
	}

	@RequestMapping(value = "/reportPage")
	public ModelAndView reportPage() {

		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;

	}

	@RequestMapping(value = "/availableBooks")
	public ModelAndView allBooks() {

		ModelAndView modelAndView = new ModelAndView();
		List<Books> inBooks = dao.getAvailableBooks();
		modelAndView.setViewName("availableBooks");
		modelAndView.addObject("all", inBooks);
		return modelAndView;

	}

	@RequestMapping(value = "/outBooks")
	public ModelAndView outBooks() {

		ModelAndView modelAndView = new ModelAndView();
		List<Books> outBooks = dao.getOutBooks();
		modelAndView.setViewName("outBooks");
		modelAndView.addObject("all", outBooks);
		return modelAndView;

	}

	@RequestMapping(value = "/printBooks")
	public ModelAndView printBooks() {

		ModelAndView modelAndView = new ModelAndView();
		List<Books> outBooks = dao.getAllUsers();
		modelAndView.setViewName("printBooks");
		modelAndView.addObject("all", outBooks);
		return modelAndView;

	}

	@RequestMapping(value = "/BookSearch")
	public ModelAndView BookSearch() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	@RequestMapping(value = "/BookSearchResult")
	public ModelAndView BookSearchResult() {
		ModelAndView mav = new ModelAndView();

		return mav;
	}

}
