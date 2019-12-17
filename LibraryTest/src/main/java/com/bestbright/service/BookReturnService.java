package com.bestbright.service;

import java.util.List;

import com.bestbright.dto.BookReturndto;
import com.bestbright.models.BookRent;
import com.bestbright.models.BookReturn;
import com.bestbright.models.Customers;

public interface BookReturnService {
	void saveBookReturn(BookReturndto bookReturndto);
	List<BookReturn> getBookReturnList();
	List<Customers> getCustomerList();
	List<BookRent> getBookRentList();
	
	void deleteBookReturn(long id);
}
