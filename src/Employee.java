
public class Employee 
{
	private String name;
	private int age;
	public BankAccount account;
	
	/**
	 * Constructor of the class Employee
	 * Sets the name, age, and the bank account of the employee
	 */
	public Employee(String name, int age, BankAccount account)
	{
		super();
		this.name = name;
		this.age = age;
		this.account = account;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
		
	}
	public void setAge(int age)
	{
		this.age = age;
		
	}
	public String toString()
	{
		return "Employee name: "+ this.name +",age: "+ this.age+ ",account"+this.account.toString();
	}

}
