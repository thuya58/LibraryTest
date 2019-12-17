package com.bestbright.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.bestbright.dto.BookRentdto;
import com.bestbright.models.BookRent;
import com.bestbright.models.Books;

import com.bestbright.models.Customers;
@Repository
public class BookRentdaoImpl implements BookRentdao{
	@Autowired
	SessionFactory sessionFactory;
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void saveBookRent(BookRent bookRent) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(bookRent);
		
	}

	public List<BookRent> getBookRentList() {
		// TODO Auto-generated method stub
		return	getCurrentSession().createCriteria(BookRent.class).list();
	}

	public List<Books> getBookList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Books.class).list();
	}

	public List<Customers> getCustomerList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Customers.class).list();
	}

	public void deleteBookRent(long id) {
		// TODO Auto-generated method stub
		BookRent bookRent = getCurrentSession().get(BookRent.class, id);
		getCurrentSession().delete(bookRent);
	}

	public List<BookRentdto> getBookRentListByCustomerId(long id) {
		// TODO Auto-generated method stub
		Criteria c = getCurrentSession().createCriteria(BookRent.class).
				createAlias("customers", "c",JoinType.LEFT_OUTER_JOIN)
				.createAlias("books", "b", JoinType.LEFT_OUTER_JOIN);
		
		c.setProjection(Projections.projectionList()
		.add(Projections.property("id"), "id")
		.add(Projections.property("rentqty"), "rentQty") /* (class,dto) */
		.add(Projections.property("rentdate"),"rentDate")
		.add(Projections.property("c.id"),"customer_id") 
		.add(Projections.property("b.id"),"book_id")
		.add(Projections.groupProperty("b.name"),"bookrentName")
		);
		

		 
		 
		 c.add(Restrictions.eq("c.id",id)); 
		c.setResultTransformer(Transformers.aliasToBean(BookRentdto.class));
		
		return c.list();
	}




}
