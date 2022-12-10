package code.refactoring.complex_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	Customer customer;
	Movie movie;
	Rental rental;

	@Before
	public void setUp() throws Exception {
		customer = new Customer("Kim");
	}

	@Test
	public void testStatementRegular() {
		movie = new Movie("Forrest Gump", 0);
		rental = new Rental(movie, 2);
		customer.addRental(rental);
		System.out.println("statement ---> " + customer.statement());
	}
	@Test
	public void testStatementNew() {
		movie = new Movie("Speed", 1);
		rental = new Rental(movie, 2);
		customer.addRental(rental);
		System.out.println("statement ---> " + customer.statement());
	}
	@Test
	public void testStatementChild() {
		movie = new Movie("Disney Miki", 2);
		rental = new Rental(movie, 2);
		customer.addRental(rental);
		System.out.println("statement ---> " + customer.statement());
	}
	
	@Test
	public void testStatementMulti() {
		movie = new Movie("Test Regular", 0);
		rental = new Rental(movie, 3);
		customer.addRental(rental);
		
		movie = new Movie("Test Regular", 0);
		rental = new Rental(movie, 1);
		customer.addRental(rental);
		
		movie = new Movie("New Release", 1);
		rental = new Rental(movie, 3);
		customer.addRental(rental);
		
		movie = new Movie("CHILDERNS", 2);
		rental = new Rental(movie, 4);
		customer.addRental(rental);
		
		movie = new Movie("CHILDERNS", 2);
		rental = new Rental(movie, 3);
		customer.addRental(rental);
		
		System.out.println("statement ---> " + customer.statement());

	}
}
