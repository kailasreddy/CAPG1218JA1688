package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bean.Customer;
import bean.Transaction;

public class DaoClass implements DaoInterface{
	HashMap<Long,Customer> m=new HashMap<Long,Customer>();
	HashMap<String,String> p=new HashMap<String,String>();
	Set<Long> st=null;
	Set<String> a=null;
	
	long transactionId=0;
	List<Transaction> transactionList=new ArrayList<Transaction>();
	ArrayList<Transaction> oneTransList=new ArrayList<Transaction>();
  Date date = new Date();  
  SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
  String strDate = formatter.format(date);   
	
	public String createAccount(Customer c)
	{
		m.put(c.getAccountNumber(),c);
		return "Successful";
	}
	
	public Map<Long,Customer> getDeatils()
	{
		return m;
	}
	public String updateLoginDetails(HashMap<String,String> hs)
	{
		p.putAll(hs);
		return "Login details updated successfully";
	}
	public String LoginValidation(HashMap<String,String> hs)
	{
		a=hs.keySet();
		Set<String> b=p.keySet();
		String str1=null;
		for(String str:b)
		{
			str1=str;
		}
		for(String str:a)
		{
			if(str.equals(str1))
			{
				if(p.get(str).equals(hs.get(str1)))
				{
				   return "Login Successful";	
				}
				else
				{
					return "Password Invalid";
				}
			}
		}
		return "CustomerId Invalid";
		
	}
	public double showBalance(String str){
		st=m.keySet();
		double d=0.0;
		for(Long s1:st)
		{
			Customer c=m.get(s1);
			if(c.getCustomerId().equals(str))
			{
				d=c.getBalance();
			}
		}
		return d;
	}
	public String deposit(String custId,double d)
	{
		 st=m.keySet();
		String s=null;
		for(Long s1:st)
		{
			Customer c=m.get(s1);
			if(c.getCustomerId().equals(custId))
			{
				c.setBalance(c.getBalance()+d);
				 transactionId=(long) ((Math.random()*((19999999-10000000)+1))+10000000);
				 date=new Date();
				 transactionList.add(new Transaction(custId,transactionId,strDate,"deposit",d,c.getBalance()));
				
				s="Balance Deposited Successfully...!!";
			}
			}
		return s;
		}
	public String withdraw(String custId,double d)
	{
		 st=m.keySet();
		String s=null;
		for(Long s1:st)
		{
			Customer c=m.get(s1);
			if(c.getCustomerId().equals(custId))
			{
				c.setBalance(c.getBalance()-d);
				transactionId=(long) ((Math.random()*((19999999-10000000)+1))+10000000);
				 date=new Date();
				 transactionList.add(new Transaction(custId,transactionId,strDate,"withdraw",d,c.getBalance()));
				s="Balance withdrawn Successfully...!!";
			}
		}
		return s;
	}
	public String fundTransfer(String custId,long accountNumber,String name,double amount)
	{
		st=m.keySet();
		String s=null;
		for(Long s1:st)
		{
			if(accountNumber==s1)
			{
				Customer c=m.get(s1);
				if(c.getName().equals(name))
				{
					c.setBalance(c.getBalance()+amount);
				    Set<Long> ks=m.keySet();
				    for(Long l:ks)
				    {
				       Customer t=m.get(l);
				       if(t.getCustomerId().equals(custId))
				       {
				    	   t.setBalance(t.getBalance()-amount);
				    	   transactionId=(long) ((Math.random()*((19999999-10000000)+1))+10000000);
							 date=new Date();
							 transactionList.add(new Transaction(custId,transactionId,strDate,"fund transfer",amount,c.getBalance()));
				       }
				    }
					
					s="Funds successfully transffered...";
				}
			}
		}
		return s;
	}
	public ArrayList<Transaction> printTransactions(String custId)
	{
		oneTransList=null;
		Iterator<Transaction> it=transactionList.iterator();
		oneTransList=new ArrayList<Transaction>();
		while(it.hasNext())
		{
			Transaction trans=it.next();
			if(trans.getCustId().equals(custId))
			{
				oneTransList.add(trans);
			}
		}
		return oneTransList;
	}
	
}
