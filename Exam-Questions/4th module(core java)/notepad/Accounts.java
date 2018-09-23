public class Accounts{
	private int accountNo;
	private String title;
	private double amount;

	
	public void setAccountNo(int accountNo){
	this.accountNo=accountNo;
	}
	public int getAccountNo(){
	return accountNo;
	}	


	public void setTitle(String title){
	this.title=title;
	}
	public String getTitle(){
	return title;
	}


	public void setAmount(double amount){
	this.amount=amount;
	}
	public double getAmount(){
	return amount;
	}

public Accounts()
{
accountNo=1000;
title="TestAccount";
amount=5000.00;
}


public Accounts(int accountNo, String title, double amount)
{
this.accountNo=accountNo;
this.title=title;
this.amount=amount;
}

public void deposite(double amount)
{
setAmount(getAmount()+amount);
}

public void withdrawn(double amount)
{
setAmount(getAmount()-amount);
}

public void getAccountDetail()
{
System.out.println("AccNo:"+getAccountNo()+"Title:"+getTitle()+"Balance:"+getAmount());
}
}