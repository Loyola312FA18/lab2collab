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
