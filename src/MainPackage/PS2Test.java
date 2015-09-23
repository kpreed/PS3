package MainPackage;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author kreed
 * This class tests the Account object's methods to ensure the work correctly.
 */
public class PS2Test 
{
	static Account acct;

	/**
	 * Creates an account object
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		acct = new Account(1122,(double)20000,4.5,new Date());
	}
	
	/**
	 * Main testing method. Tests the withdraw method to ensure it throws an InsufficientFundsException when too much with withdrawn from the account.
	 */
	@Test
	public void test()
	{
		assertTrue(acct.getID() == 1122);
		assertTrue(acct.getAnnualInterestRate() == 4.5);
		
		try
		{
			acct.withdraw(2500);
		}
		catch(InsufficientFundsException ex)
		{
			System.out.println("You are short $" + ex.getAmount());
			ex.printStackTrace();
		}
		
		assertTrue(acct.getBalance() == (20000-2500));
		acct.deposit(3000);
		assertTrue(acct.getBalance() == (20000-2500+3000));
		
		System.out.println("The balance is: $" + acct.getBalance());
		System.out.println("The monthly interest is: " + acct.getMonthlyInterestRate() + "%");
		System.out.println("The account was created on: " + acct.getDateCreated().toString());
		
		try
		{
			acct.withdraw(25000);
		}
		catch(InsufficientFundsException ex)
		{
			assertTrue(ex.getAmount() == -1*(acct.getBalance()-25000));
			System.out.println("You are short $" + ex.getAmount());
			ex.printStackTrace();
		}
	}
}
