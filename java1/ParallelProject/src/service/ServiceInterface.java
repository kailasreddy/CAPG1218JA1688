package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bean.Customer;
import bean.Transaction;

public interface ServiceInterface {
	
		public String createAccount(Customer c);
		public String updateLoginDetails(HashMap<String,String> hs);
	    public String LoginValidation(HashMap<String,String> hs);
		public double showBalance(String str);
		public String deposit(String custId,double d);
		public String withdraw(String custId,double d);
		public String fundTransfer(String custId,long accountNumber,String name,double amount);
		public ArrayList<Transaction> printTransactions(String custId);
		
		public Map<Long,Customer> getDeatils();
}
