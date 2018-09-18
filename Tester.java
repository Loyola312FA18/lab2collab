public class Tester
{
  public static void main(String [] args)
  {
    // Example test case
    // Star s = new Star(Shape.Color.green, 5);
    // System.out.println("star = " + s);

    Shape rt1 = new RightTriangle(Shape.Color.blue, 10, 10, "Right Triangle 1");
    System.out.println("rt1: " + rt1);

    Shape rt2 = new RightTriangle(Shape.Color.red, 20, 5, "Right Triangle 2");
    System.out.println("rt2: " + rt2);
  }
}
