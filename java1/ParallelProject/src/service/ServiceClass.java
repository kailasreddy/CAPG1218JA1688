package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import bean.Customer;
import bean.Transaction;
import dao.DaoClass;

public class ServiceClass implements ServiceInterface {
	DaoClass d=new DaoClass();
	public String createAccount(Customer c)
	{
		if(c.getName()==null)
		{
			return "Invalid name";
		}
		int NLength=String.valueOf(c.getPhoneNumber()).length();
		if(NLength>10||NLength<10)
        {
			return "Invalid phone Number";
	
         }
		String s=c.getEmail_Id().substring(c.getEmail_Id().length()-10,c.getEmail_Id().length());
		if(!(s.equals("@gmail.com")))
		{
			return "Invalid Email Id";
		}
		if(c.getAddress()==null)
		{
			return "Invalid Address";
		}
		if(c.getNominee()==null)
		{
			return "Invalid details of nominee";
		}
		else
		{
			return d.createAccount(c);
		}
		
		
	}
	
	public Map<Long,Customer> getDeatils()
	{
		return d.getDeatils();
	}
	public String updateLoginDetails(HashMap<String,String> hs)
	{
		return d.updateLoginDetails(hs);
	}
	public String LoginValidation(HashMap<String,String> hs)
	{
       Set<String> s=hs.keySet();
       for(String sm:s)
       {
    	   int len=sm.length();
    	   if(sm.equals(null)||len<11||len>11)
    	   {
    		   System.out.println("Length is correct and length is not null");
    		   return "CustomerId incorrect";
    	   }
    	   else
    	   {
    		   String subString=sm.substring(0,3);
    		   for(int i=0;i<3;i++)
    		   {
    			   if(subString.charAt(i)<'a'||subString.charAt(i)>'z'||subString.charAt(i)<'A'||subString.charAt(i)>'z')
    			   {
    				   System.out.println("no of characters are invalid");
    				   return "CustomerId incorrect";
    			   }
    		   }
    		   
    		   subString=sm.substring(3,len);
    		   int len1=subString.length();
    		   for(int i=0;i<len1;i++)
    		   {
    			   int a=subString.charAt(i);
    			  if(a<48||a>57)
    			  {
    				  System.out.println("no of numbers are invalid"+subString.charAt(i));
    				 return "CustomerId incorrect";
    			}
    			 
    		   }
    		 if(hs.get(sm).length()<6)
    		 {
    			 return "Password Incorrect";
    		 }
    	   }
       }
       return d.LoginValidation(hs);
	}
	public double showBalance(String str)
	{
		return d.showBalance(str);
	}
	public String deposit(String custId,double k)
	{
	  if(k<1)
	  {
		  return "Transaction Cancelled\tEnter valid amount";
	  }
	  if(k>50000)
	  {
		  return "Transaction Cancelled\tDepositing Balance exceeded RS.50000 ";
	  }
	  else
	  {
	  return d.deposit(custId, k);
	  }
	}
	public String withdraw(String custId,double k)
	{
		if(k<1)
		{
			return "Transaction Cancelled\tEnter valid amount"; 
		}
		if(k>50000)
		{
			return "Transaction Cancelled\twithdraw Balance exceeded Rs.50000";
		}
		if(d.showBalance(custId)<k)
		{
			return "Insufficient funds available in your accoount";
		}
		else
		{
			return d.withdraw(custId,k);
		}
		
	}
	public String fundTransfer(String custId,long accountNumber,String name,double amount)
	{
		if(accountNumber<10000001||accountNumber>19999999)
		{
			return "Invalid account number";
		}
		else
		{
			if(name==null)                 //check
			{
				return "Account Holder's name should not be empty";
			}
			else
			{
				 if(amount<1)
				  {
					  return "Enter valid amount";
				  }
				  if(amount>50000)
				  {
					  return "Transffering amount exceeded RS.50000 ";
				  }
				  else
				  { 
					  return d.fundTransfer(custId,accountNumber, name,amount);
				  }
			}
		}
	}
	public ArrayList<Transaction> printTransactions(String custId)
	{
		return d.printTransactions(custId);
	}
}
