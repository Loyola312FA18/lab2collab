public class Tester
{
  public static void main(String [] args)
  {
    // Example test case
    // Star s = new Star(Shape.Color.green, 5);
    // System.out.println("star = " + s);
<<<<<<< HEAD
      
      Circle circle1 = new Circle(Shape.Color.blue, "Circle1", 27);
      System.out.println(circle1.toString());
      System.out.println();
      Circle circle2 = new Circle(Shape.Color.green, "Circle2", 13);
      System.out.println(circle2.toString());
      
=======

    Shape rt1 = new RightTriangle(Shape.Color.blue, 10, 10, "Right Triangle 1");
    System.out.println("rt1: " + rt1);

    Shape rt2 = new RightTriangle(Shape.Color.red, 20, 5, "Right Triangle 2");
    System.out.println("rt2: " + rt2);
>>>>>>> d0db3fa9f0d6d5af22d8cb47f953ac2fab91db48
  }
}
