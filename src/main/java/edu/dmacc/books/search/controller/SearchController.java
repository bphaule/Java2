package edu.dmacc.books.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import edu.dmacc.books.search.searchForm.SearchForm;
@Controller
public class SearchController {

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
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("SearchPages/BookSearchResult");
		return mav;
	}
}