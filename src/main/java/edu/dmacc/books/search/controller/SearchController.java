package edu.dmacc.books.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SearchController {

	//=============
	// SearchPages
	//=============
	@RequestMapping(value="/BookSearch")
	public ModelAndView bookSearch()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("SearchPages/BookSearch");
		return modelAndView;
	}

	@RequestMapping(value="/BookSearchResult")
	public ModelAndView bookSearchResult()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("SearchPages/BookSearchResult");
		return mav;
	}
}