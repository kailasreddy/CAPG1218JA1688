package bean;

public class Customer{
	long accountNumber;
	String name;
	long phoneNumber;
	String email_Id;
	String address;
	String nominee;
	double balance;
	String customerId;
    public Customer()
    {
    	
    }
	public Customer(long accountNumber,String name,long phoneNumber,String email_Id,String address,String nominee,double balance,String customerId)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email_Id=email_Id;
		this.address=address;
		this.nominee=nominee;
		this.balance=balance;
		this.customerId=customerId;		
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNominee()
	{
		return nominee;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setNominee(String nominee)
	{
		this.nominee=nominee;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance= balance;
	}
	@Override
	public String toString()
	{
		return this.accountNumber+" "+this.name+" "+this.phoneNumber+" "+this.email_Id+" "+this.address+" "+this.nominee+" "+this.balance+" "+this.customerId;
	}
}
