package com.bestbright.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestbright.dto.BookRentdto;

import com.bestbright.service.BookRentService;
@Controller
public class BookRentController {
	@Autowired
	BookRentService bookRentService;
	


	@InitBinder
	public void allowEmptyDateBinding( WebDataBinder binder )
		{
		    // Custom String Editor. tell spring to set empty values as null instead of empty string.
		    binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
	
												
	
		    //Custom Date Editor
	
												
		    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		    simpleDateFormat.setLenient(false);
		    binder.registerCustomEditor( Date.class, new CustomDateEditor( simpleDateFormat,false));	   
		}


	@RequestMapping(value = "/save_bookRent.htm")
	public String createBookRent(Model model) {
		model.addAttribute("bookRent",new BookRentdto());
		model.addAttribute("bookList", bookRentService.getBookList());
		model.addAttribute("customerList",bookRentService.getCustomerList());
		return "book_rent";
	}
	
	@RequestMapping(value="/save_bookRent.htm",method=RequestMethod.POST)
	public String saveBookRent(@ModelAttribute(value="bookRent")BookRentdto bookRentdto,BindingResult r) {
		
		if(r.hasErrors()) {
			System.out.println("binding error");
		}
		
		System.out.println(bookRentdto.getRentQty()+" "+bookRentdto.getBook_id());
		bookRentService.saveBookRent(bookRentdto);
		return "main_menu";
	}
	@RequestMapping(value="/bookrent_list.htm", method = RequestMethod.GET)
	public String showBookRent(Model model) {
		model.addAttribute("brent_list", bookRentService.getBookRentList());
		return "book_RentList";
	}
	@RequestMapping(value = "/delete.htm/{id}",method = RequestMethod.GET)
	public String deleteBRent(@PathVariable(value = "id") long id) {
		bookRentService.deleteBookRent(id);
		return "redirect:/bookrent_list.htm";
		
	}

}
