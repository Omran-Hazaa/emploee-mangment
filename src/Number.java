import java.util.Random;
/**
 * 
 * @author chandraveer kunwar
 * This Class represents a number
 *
 */
public class Number 
{
	//number
	private int number;
	
	/**
	 * Constructor of the class Number-
	 * generates value for variable number 
	 * 
	 */
	public Number()
	{
		this.number = new Random().nextInt(10000);
	}
	
	/**
	 * prints the value of the number variable
	 * 
	 */
	public void showNumber()
	{
		System.out.println("the number is: " +number);
	}
	
	public String toString()
	{
		return "The number is: "+this.number;
		
	}
	

}
