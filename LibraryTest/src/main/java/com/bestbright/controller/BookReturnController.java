package com.bestbright.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bestbright.dto.BookRentdto;
import com.bestbright.dto.BookReturndto;
import com.bestbright.service.BookRentService;
import com.bestbright.service.BookReturnService;

@Controller
public class BookReturnController {
	@Autowired
	BookReturnService bookReturnService;
	@Autowired
	BookRentService bookRentService;
	@RequestMapping(value = "/save_bookreturn.htm")
	public String saveBookReturn(Model model) {
		model.addAttribute("customerlist", bookReturnService.getCustomerList());
		model.addAttribute("bookrentlist", bookReturnService.getBookRentList());
		model.addAttribute("bookreturndto", new BookReturndto());
		return "book_return";		
	}
	@RequestMapping( value = "/save_bookreturn.htm",method = RequestMethod.POST)
	public String postBookReturn(@ModelAttribute(value = "bookreturndto")BookReturndto bookReturndto) {
		bookReturnService.saveBookReturn(bookReturndto);
		return "redirect:/list_bookreturn.htm";
	}
	@RequestMapping( value = "/list_bookreturn.htm")
	public String listBookReturn( Model model) {
		
		  model.addAttribute("bReturnList", bookReturnService.getBookReturnList());
		return "book_ReturnList";
	}
	@RequestMapping(value = "/getBookRentListByCustomerId/{customersId}", produces = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody List<BookRentdto> getReturnList(@PathVariable(value="customersId")long id){
		List<BookRentdto> returnList = bookRentService.getBookRentListByCustomerId(id); 
		return returnList;
		
	}

	
	

}



