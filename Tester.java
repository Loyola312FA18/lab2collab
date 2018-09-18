public class Tester
{
  public static void main(String [] args)
  {
    // Example test case
    // Star s = new Star(Shape.Color.green, 5);
    // System.out.println("star = " + s);
      
      Circle circle1 = new Circle(Shape.Color.blue, "Circle1", 27);
      System.out.println(circle1.toString());
      System.out.println();
      Circle circle2 = new Circle(Shape.Color.green, "Circle2", 13);
      System.out.println(circle2.toString());
      
  }
}
