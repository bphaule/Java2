/*package edu.dmacc.books.search.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.books.books.data.Books;
import edu.dmacc.books.search.searchForm.SearchForm;
import edu.dmacc.books.search.service.SearchService;
@Controller
public class SearchController {
	@Autowired SearchService searchService;
	//=============
	// SearchPages
	//=============
	@RequestMapping(value="/BookSearch")
	public ModelAndView bookSearch()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SearchPages/BookSearch");
		
		return mav;
	}

	@RequestMapping(value="/BookSearchResult", method=RequestMethod.POST)
	public ModelAndView bookSearchResult(@ModelAttribute("SearchForm") SearchForm searchForm,
			BindingResult result)
	{
		System.out.println("In Results\n\n\n");
		ModelAndView mav = new ModelAndView();
		//search for books
		List<Books> bookList = searchService.getBook(searchForm.getSearchText(), searchForm.getSearchType());
		mav.addObject("bookList", bookList);
		System.out.println(bookList);
		for(Books b: bookList)
		{
			System.out.println(b.getName());
		}
		
		mav.setViewName("SearchPages/BookSearchResult");
		return mav;
	}
}
*/