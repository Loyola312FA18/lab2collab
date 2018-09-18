
public class Square extends RegularPolygon
{

	private double sideLength;

	public Square(Color color, String name, double s, double s1)
	{
		super(color, name, s, s1);
		sideLength = s1;
		s =  s1;
		name = "square";
	}

	  public void paint(Color newColor)
 	 {	
   		 color = newColor;
 	 }
	@Override
 	 public double area()
	{
		return(sideLength * sideLength);
	}	

 	 @Override	
 	 public double perimeter();
	{
		return(4* sideLength);
	} 
 	 @Override
 	 public String toString()
  	{
  		  return "A " + color + " " + name + " area " + this.area() + " perimeter " + this.perimeter();
 	 }	


