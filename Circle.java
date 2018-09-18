/**
 * This is our code! Its purpose is to create a Circle.
 * @driver vrgleklen
 * @copilot vrmatos
 * @version 1.0 09/18/2018
 */

import java.util.*;

public class Circle extends Shape
{
    private double radius;
    
    public Circle(Color c, String n, double r) {
        super(c,n);
        this.radius = r;
    }
    
    @Override
    public double area() {
        return(Math.PI)*this.radius*this.radius;
    }
    
    @Override
    public String toString()
    {
      return "A " + color + " " + name + " area " + this.area();
    }

    @Override
    public double perimeter()
    {
        return 0;
    }

}
