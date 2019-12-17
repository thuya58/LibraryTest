package com.bestbright.service;

import java.util.List;

import com.bestbright.dto.BookRentdto;
import com.bestbright.models.BookRent;
import com.bestbright.models.Books;
import com.bestbright.models.Customers;

public interface BookRentService {
	void saveBookRent(BookRentdto bookRent);
	List<BookRent> getBookRentList();
	List<Books> getBookList();
	List<Customers> getCustomerList();
	void deleteBookRent(long id);
	List<BookRentdto> getBookRentListByCustomerId(long id);

}
