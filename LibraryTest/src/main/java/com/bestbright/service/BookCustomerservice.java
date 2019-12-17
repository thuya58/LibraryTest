package com.bestbright.service;

import java.util.List;

import com.bestbright.models.Books;
import com.bestbright.models.Category;
import com.bestbright.models.Customers;

public interface BookCustomerservice {
	void saveCategory(Category cat);
	List<Category> getCategoryList();
	void saveBook(Books books);
	List<Books> getBookList();
	void saveCustomer(Customers customers);
	List<Customers> getCustomerList();
	

}
