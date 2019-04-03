package TestCase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import bean.Customer;
import service.ServiceClass;

class Test {
	
    static ServiceClass service=null;
	@BeforeAll
	public static void beforeAll()
	{
		service=new ServiceClass();
	}
	
	@org.junit.jupiter.api.Test
	void test1() {
		Customer customer=new Customer(10000001,"kailas reddy",9915129950l,"kailas@gmail.com","D:NO-75 gandhinagar pagwara Punjab India","Father:abdjk",50000,"ddy12995570");
		
	    assertEquals("Successful", service.createAccount(customer));//customer added successfully into Dao class customer details contained hashMap and returns Successful
	}
	
	@org.junit.jupiter.api.Test
	void test2() {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("las12995570","19334864");
	    assertEquals("CustomerId Invalid", service.LoginValidation(map));// CustomerId=las12995570 is not present in Dao class login details contained HashMap 
	}
	@org.junit.jupiter.api.Test
	void test3() {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("las12995570","19334864");
	    assertEquals("Login details updated successfully", service.updateLoginDetails(map));// login details successfully added into the Dao class login details Contained HashMap
	}
	
	@org.junit.jupiter.api.Test
	void test4() {
	  assertEquals(0.0, service.showBalance("las12995570")); // custId we are passing is not present in dao class HashMap customer details so return 0.0
	}
	
	@org.junit.jupiter.api.Test
	void test5() {
		assertEquals("Transaction Cancelled	Depositing Balance exceeded RS.50000 ",service.deposit("las12995570",75000));
	}
	@org.junit.jupiter.api.Test
	void test6() {
		assertEquals("Transaction Cancelled	withdraw Balance exceeded Rs.50000",service.withdraw("ldas12995570", 75000));
	}
	@org.junit.jupiter.api.Test
	void test7() {
		assertEquals("Transaction Cancelled	withdraw Balance exceeded Rs.50000",service.withdraw("ldas12995570", 75000));
	}
	
	@AfterAll
	public static void afterAll()
	{
		service=null;
	}

}
