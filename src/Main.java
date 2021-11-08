/**
 * 
 * @author chandraveer kunwar
 *
 */
import java.util.Random;
public class Main {
	
	/**
	 * 
	 * @param args The command line arguments
	 */

	public static void main(String[] args) {
		Company myCompany = new Company("Comp. ESIG", "Rouen, Paris boulevard 1", 0, null);
		Employee[] employees = new Employee[] {
				new Employee("First Employee", 25, new BankAccount("LCL", 0) ),
				new Employee("Second Employee", 26, new BankAccount("BNP", 0) ),
				new Employee("Third Employee", 28, new BankAccount("LCL", 0) ),
				new Employee("Fourth Employee", 35, new BankAccount("BNP", 0) ),
				new Employee("Fifth Employee", 50, new BankAccount("LCL", 0) )				
		};
		for (Employee employee : employees) {
            myCompany.recruitEmployee(employee);
       //     myCompany.recruitEmployee(employee)
        }
		
	System.out.println(myCompany.toString());
        
        double rndMin = 1500, rndMax = 2000;
        Random rnd = new Random();
        for (Employee employee : employees) {
            employee.account.setBalance(rndMin + (rndMax-rndMin)*rnd.nextDouble());
        }
        
        myCompany.sortEmployeesAccordingToBankAccount();
        
        System.out.println(myCompany.toString());
    }
		
		

	

}
