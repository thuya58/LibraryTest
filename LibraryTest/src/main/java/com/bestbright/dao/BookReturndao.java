package com.bestbright.dao;

import java.util.List;

import com.bestbright.models.BookRent;
import com.bestbright.models.BookReturn;
import com.bestbright.models.Customers;

public interface BookReturndao {
	void saveBookReturn(BookReturn bookReturn);
	List <BookReturn> getBookReturnList();
	List<Customers> getCustomerList();
	List<BookRent> getBookRentList();
	
	
	void deleteBookReturn(long id);
	
}
