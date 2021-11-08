/**
 * 
 * @author chandraveer kunwar
 *
 */
public class MyClass {
    private double height;
    private double width;
    private double weight;
    private double length;
    
    /**
     * The constructor of the MyClass class. Sets the main variables.
     * @param h The object's height
     * @param w The object's width
     * @param weight The object's weight
     * @param l The object's length
     */     
    public void MyClass(double h, double w, double weight, double l){
        this.height = h;
        this.width = w;
        this.weight = weight;
        this.length = l;
    }
    
    /**
     * Gets the surface of the object
     * @return The surface of the object
     */
    public double getSourface(){
        return height*width;
    }
}
