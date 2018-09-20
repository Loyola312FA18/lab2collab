/**
 *This is our code! Its goal is to represent a Right Triangle
 *@author Matt Kinloch, Jeffrey Umanzor, Thomas Anderson
 *@version 1.0 9/18/2018
 */
public class RightTriangle extends Shape
{
    double base;
    double height;

    public RightTriangle(Color color, double base, double height, String name)
    {
        super(color, name);
        this.base = base;
        this.height = height;
    }
  
    public double area()
    {
        return 0.5 * base * height;
    }  

    public double perimeter()
    {
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return base + height + hypotenuse;
    }
}
