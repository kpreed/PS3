package MainPackage;

/**
 * @author kreed
 *This class defines the InsufficientFundsException object which extends the Exception object.
 *This exception is thrown when a method tries to withdraw more than the balance in the account
 */
public class InsufficientFundsException extends Exception
{
	/**
	 * 
	 */
	private double amount;
	
	/**
	 * Constructs an InsufficeientFundsException Exception
	 * @param amount The funds required to make the withdrawal
	 */
	public InsufficientFundsException(double amount)
	{
		this.setAmount(amount);
	}
	
	/**
	 * @param amount The funds required to make the withdrawal
	 */
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	/**
	 * @return The funds required to make the withdrawal
	 */
	public double getAmount()
	{
		return this.amount;
	}
}
