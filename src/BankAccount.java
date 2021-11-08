/**
 * 
 * @author chandraveer kunwar
 * class representing a bank account
 *
 */
public class BankAccount 
{
	private String bank;
	private Double balance;
	
	/**
	 * Constructor of the class BankAccount-
	 * sets the values of private variables
	 * @param bankName the name of the bank
	 * @param balance The balance of the client's account
	 * 
	 */
	public BankAccount(String bankName, double balance) 
	{
		this.bank = bankName;
		this.balance = balance;
	}
	/**
	 * Gets the name of the bank
	 * @return The name of the bank
	 */
	public String getBank()
	{
		return bank;
		
	}
	/**
	 * Sets the value of the client's bank account
	 * @param bank the name of the bank
	 * 
	 */
	public void setBank(String bank)
	{
		this.bank = bank;
		
	}
	/**
	 * Gets the value of the client's bank account
	 * @return The account balance
	 * 
	 *
	 */
	public Double getBalance()
	{
		return balance;
	}
	/**
	 * Sets the balance of the client's account
	 * @param balance The amount to set the account balance
	 * 
	 */
	public void setBalance(double balance) 
	{
		this.balance = balance;
		
	}
	/**
	 * Debits the client's account
	 * @param debit The amount to decrease the account balance
	 */
	public void debitAccount(double debit)
	{
		this.balance -=debit;
	}
	/**
	 * Credit client's account
	 * @param credit The amount to increase the account
	 */
	public void creditAccount(double credit)
	{
		this.balance += credit;
		
	}
	public String toString() {
		return "bank: "+ this.bank +", Balance: "+ this.balance+ " euro";
	}

}
