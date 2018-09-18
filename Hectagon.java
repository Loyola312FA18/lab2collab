public class Hectagon extends Polygon 
i{
  public Hectagon(String color, int sideLength)
  {
    super(color, name, numOfSides, sideLength);
    String name = "Hectagon";
    int numOfSides = 100;  	
  }

  public double computeArea()
  {
    double perimeter = Polygon.perimeter();
    double apothems = (sideLength) / (2 * Math.tan(Math.PI/numOfSides));
    double area = 0.5 * perimeter * apothems;
    return area;
  }
}
