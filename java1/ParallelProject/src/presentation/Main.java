package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import bean.Customer;
import bean.Transaction;
import service.ServiceClass;

public class Main {

	public static void main(String[] args) throws Exception{
		  Customer c=null;
	  ServiceClass s=new ServiceClass();
	  Map<Long,Customer> m=new HashMap<Long,Customer>();
	  HashMap<String,String> hs=new HashMap<String,String>();;
	   String custId=null;
	   String pass=null;
	   long acc=10000001l;
	  int loginVariable=0;//login do while loop variable
	  int b=0;
	  int k=0;//main page do while lopp variable
	  do
	  {
	  System.out.println("Welcome to Capgemini Bank Services");
	  System.out.println("Please Select which Service you want to access from our Bank Services");
	  System.out.println("1.Create Account");
	  System.out.println("2.Login");
	  System.out.println("3.Exit");
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  switch(a)
	  {
	  case 1:
		     loginVariable=0;
		   System.out.println("account number:"+acc);
		   System.out.println("Enter name of an accountHolder");
		   String name=br.readLine();  
		   System.out.println("Enter Phone Number");
		   long phoneNumber=sc.nextLong();
		   System.out.println("Enter EmailID");
		   String EmailId=sc.next();
		   System.out.println("Enter Address");
		   String Address=br.readLine();
		   System.out.println("Enter Nominee Details");
		   String nominee=br.readLine();
		   System.out.println("Deposit minimum balance 500 or above");
		   double balance=sc.nextDouble();
		   long rand=(long)((Math.random()*((19999999-10000000)+1))+10000000);
		   String customerId=name.substring(name.length()-3,name.length()).concat(String.valueOf(rand));
		   c=new Customer(acc,name,phoneNumber,EmailId,Address,nominee,balance,customerId);
		   String res=s.createAccount(c);
		   System.out.println(res);
		   System.out.println("welcom to the Capgemini family "+name+ " your account Number is: "+acc);
		   if(res.equals("Successful"))
		   {
		    String password=String.valueOf((long)((Math.random()*((19999999-10000000)+1))+10000000));
		    hs.put(customerId,password);
		    System.out.println(s.updateLoginDetails(hs));
		    System.out.println("Please remember Below login details for login into the bank wallet");
		    System.out.println("Username:  "+customerId);
		    System.out.println("Password:  "+password);
		    ++acc;
		   }
		 m=s.getDeatils();
		Set<Long> t=m.keySet();
		Iterator<Long> it=t.iterator();
		while(it.hasNext())
		{
			System.out.println(m.get(it.next()));
		}
		break;
	  case 2:
		  do {
		  if(loginVariable==0)
		  {
		  System.out.println("Enter CustomerId and password");
		  custId=sc.next();
		  pass=sc.next();
		  hs.put(custId, pass);
		  System.out.println(s.LoginValidation(hs));
		  System.out.println("Select Options");
		  System.out.println("1.Show Balance");
		  System.out.println("2.Deposit");
		  System.out.println("3.Withdraw");
		  System.out.println("4.Send money to Bank");
		  System.out.println("5.Print Transactions");
		  }
		  else
		  {
		  System.out.println("Select Options");
		  System.out.println("1.Show Balance");
		  System.out.println("2.Deposit");
		  System.out.println("3.Withdraw");
		  System.out.println("4.Send money to Bank");
		  System.out.println("5.Print Transactions");
		  }
		  int option=sc.nextInt();
          switch(option)
          {
          case 1:
        	  System.out.println(s.showBalance(custId));
        	  break;
          case 2:
        	  System.out.println("Enter Amount: ");
        	  double d=sc.nextDouble();
        	  System.out.println(s.deposit(custId,d));
              break;
          case 3:
        	  System.out.println("Enter Amount: ");
        	   d=sc.nextDouble();              //i used above variable 
        	   System.out.println(s.withdraw(custId, d));
        	   break;
          case 4:
        	  System.out.println("Enter account number");
        	  long l=sc.nextLong();
        	  System.out.println("Enter account holder's name:");
        	  String fname=br.readLine();
        	  System.out.println("Enter Amount:");
        	  d=sc.nextInt();
        	  System.out.println(s.fundTransfer(custId,l,fname,d));
        	   break;
          case 5:
        	  List<Transaction> transactionList=s.printTransactions(custId);
        	    System.out.println(transactionList.size());
        	 Iterator<Transaction> iterate=transactionList.iterator();
        	  while(iterate.hasNext())
        	  {
        		  System.out.println(iterate.next());
        		  System.out.println("abc");
        	  }
        	  break;
          }
          
	      System.out.println("Do you want to perform another transaction 1.YES|2.Logout");
	      loginVariable=1;
	     b=sc.nextInt();
	      if(b==2)
	      {
		  custId=null;
		  pass=null;
		  loginVariable=0;
	      }
	      }while(b==1);
          break;
	  case 3:
		  System.exit(0);
		  break;
	   }
	    System.out.println("Enter 1.Main Page");
	     k=sc.nextInt();
      }while(k==1);
}
}
