package bean;

import java.util.Date;

public class Transaction {
	private String custId;
	private long transactionId;
    private String date;
	private String transactionType;
    private double amount;
    private double balance;
    public Transaction()
    {
    }
    public Transaction(String custId,long transactionId,String date, String transactionType, double amount, double balance) {
  		super();
  		this.custId=custId;
  		this.transactionId=transactionId;
  		this.date = date;
  		this.transactionType = transactionType;
  		this.amount = amount;
  		this.balance = balance;
  	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
   public String toString()
   {
	   return this.date+"\t"+this.transactionType+"\t"+this.amount+"\t"+this.balance;
   }

}
