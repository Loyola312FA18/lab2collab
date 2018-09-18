public class Octagon extends Polygon
{ 
    public Octagon(Shape.Color color, double sl)
    {
        super(color, "Octagon", 8, sl); 
        sideLength = sl;
    }
    
    @Override
    public double area()
    {
        double apothems = sideLength / (2 * Math.tan(Math.PI / sides));
        return .5 * this.perimeter() * apothems;
    }
    
    
}
