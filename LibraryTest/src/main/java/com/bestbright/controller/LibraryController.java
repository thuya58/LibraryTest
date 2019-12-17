package com.bestbright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bestbright.models.Books;
import com.bestbright.models.Category;
import com.bestbright.models.Customers;
import com.bestbright.service.BookCustomerservice;

@Controller
public class LibraryController {
	@Autowired
	BookCustomerservice bookCustomerservice;
	@RequestMapping(value = "/index.htm")
	public String index() {
		return "main_menu";
	}
	@RequestMapping(value = "/save_category.htm")
	public String createCategory(Model model) {
		model.addAttribute("cat",new Category());
		return "add_category";
	}
	@RequestMapping(value = "/save_category.htm", method = RequestMethod.POST)
	public String postCategory(@ModelAttribute(value="cat") Category cat) {
		System.out.println(cat.getType()+" "+cat.getDue_date());
		bookCustomerservice.saveCategory(cat);
		return "main_menu";
	}
	
	
	@RequestMapping(value = "/save_books.htm")
	public String createBooks(Model model) {
		model.addAttribute("books",new Books());
		model.addAttribute("catlist",bookCustomerservice.getCategoryList());
		return "add_books";
	}
	@RequestMapping(value = "/save_books.htm", method = RequestMethod.POST)
	public String postBooks(@ModelAttribute(value = "books") Books books) {
		//books.getCategory().setId(1);
		bookCustomerservice.saveBook(books);
		return "main_menu";
	}
	@RequestMapping(value = "/save_customers.htm")
	public String createCuatomers(Model model) {
		model.addAttribute("customers",new Customers());
		return "add_customers";
	}
	@RequestMapping(value = "/save_customers.htm", method = RequestMethod.POST)
	public String postCustomers(@ModelAttribute(value = "customers")Customers customers) {
		bookCustomerservice.saveCustomer(customers);
		return "main_menu";
	}
	

	
}
