package MainPackage;

import java.util.Date;

/**
 * @author kreed
 * This class defines the Account object
 */
public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	/**
	 * No args constructor. Sets the ID to 0, the balance to 0, the annual interest rate to 0%, and the date to December 31st 1969.
	 */
	public Account()
	{
		this.setID(0);
		this.setBalance(0);
		this.setAnnualInterestRate(0);
		this.dateCreated = new Date(0);
	}
	
	/**
	 * Constructs an Account object
	 * @param id Bank account ID number
	 * @param balance Amount of money in the bank
	 * @param annualInterestRate Interest gained per year
	 * @param dateCreated When the bank account was opened
	 */
	public Account(int id,double balance,double annualInterestRate,Date dateCreated)
	{
		this.setID(id);
		this.setBalance(balance);
		this.setAnnualInterestRate(annualInterestRate);
		this.dateCreated = dateCreated;
	}
	
	/**
	 * @return The account's ID number
	 */
	public int getID() 
	{
		return id;
	}
	
	/**
	 * @param id Sets the account's ID number
	 */
	public void setID(int id) 
	{
		this.id = id;
	}

	/**
	 * @return The account's balance
	 */
	public double getBalance() 
	{
		return balance;
	}
	
	/**
	 * @param balance Sets the account's balance
	 */
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	/**
	 * @return The account's annual interest rate
	 */
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	
	/**
	 * @param annualInterestRate Sets the account's the annual interest rate
	 */
	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * @return The date the account was created
	 */
	public Date getDateCreated() 
	{
		return dateCreated;
	}
	
	/**
	 * @return The account's monthly interest rate
	 */
	public double getMonthlyInterestRate()
	{
		return this.getAnnualInterestRate()/12;
	}
	
	/**
	 * @param amount The amount to be taken from the balance
	 * @throws InsufficientFundsException exception thrown when the amount being withdrawn is more than the balance
	 */
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(this.getBalance() - amount >= 0)
			this.setBalance(this.getBalance()-amount);
		else
			throw new InsufficientFundsException(-1*(this.getBalance()-amount));
	}
	
	/**
	 * @param amount The amount to be added to the balance
	 */
	public void deposit(double amount)
	{
		this.setBalance(this.getBalance()+amount);
	}
}
