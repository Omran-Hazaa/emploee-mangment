import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author chandraveer kunwar
 * Representation of an company
 *
 */
public class Company 
{
	private String name;
	private String address;
	private int numberOfEmployees;
	private Employee[] employees;
	
	/**
	 * The constructor of the company class. Sets up the class, variable.
	 * @param name The name pf the company
	 * @param address the address of the company
	 * @param numberOfEmployees the number of the employees (The length of the employee array)
	 * 
	 */
	public Company(String name, String address, int numberOfEmployees, Employee[] employees)
	{
		this.name = name;
		this.address = address;
		this.numberOfEmployees = numberOfEmployees;
		if(employees != null)
		{
			this.employees = employees;
		} else {
			this.employees = new Employee[0];
			this.numberOfEmployees = 0;
		}
		
		
	}
	
	/**
	 * Gets the name of the company
	 * @return The Company's name
	 * 
	 */
	public String getname()
	{
		return name;
	}
	
	/**
	 * Sets the name of the company
	 * @param name The company's name
	 * 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets the address of the company
	 * @return the company's address
	 */
	
	public String getAddress()
	{
		return address;
		
	}
	
	/**
	 * Sets the address of company
	 * @param address The address of the company
	 * 
	 */
	
	public void setAddress(String address)
	{
		this.address = address;
		
	}
	
	/**
	 * Gets the number of employees in the company
	 * @return The number of employees
	 * 
	 */
	
	public int getNumberOfEmployees()
	{
		return numberOfEmployees;
	}
	
	/**
	 * Sets the number of Employees
	 * @param numberOfEmployees The number of the employees
	 * 
	 */
	
	public void setNumberOfEmployees(int numberOfEmployees)
	{
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	/**
	 * Returns the employees occupied by the company
	 * @return The array of employees
	 * 
	 */
	
	public Employee[] getEmployees()
	{
		return this.employees;
		
	}
	
	/**
	 * Recruit an employee
	 * @param employee - the employee
	 * 
	 */
	public void recruitEmployee(Employee employee)
	{
		Employee[] temp = this.employees;
		this.employees = new Employee[this.employees.length+1];
		
		System.arraycopy(temp, 0, this.employees, 0, temp.length);
		this.employees[temp.length] = employee;
		this.setNumberOfEmployees(this.employees.length);
	}
	/**
	 * Returns the array of the employees ordered based on the account balance
	 * @return The acending sorted array of employee, based on their balances
	 * 
	 */
	public Employee[] sortEmployeesAccordingToBankAccount()
	{
		Arrays.sort(employees, new Comparator<Employee>(){
			public int compare(Employee e1, Employee e2) {
	            return e1.account.getBalance().compareTo(e2.account.getBalance());
	        }
		});
		
		return employees;
	}
	
	/**
	 * Returns the info about the company
	 * @return The info about the company
	 * 
	 */
	public String toString()
	{
		String employeesInfo = "";
		for (int i=0; i<this.employees.length; i++) {
			employeesInfo += this.employees[i].toString() + "\n";
		}
		return "company: " +this.name + ",Address: " + this.address+ "number of employees " 
		+this.numberOfEmployees + "\n" + "Our employees: \n" + employeesInfo;
	}
	

}
