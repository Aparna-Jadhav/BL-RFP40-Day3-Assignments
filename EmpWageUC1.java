/*
public class calculateDistanceBetweenPoints(
  double x1, 
  double y1, 
  double x2, 
  double y2) {       
    double length =  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
}
*/

public class EmpWageUC1
{
	public static void main( String args[] )
	{
	 double x1 = 2, y1 = 3;
        double x2 = 6, y2 = 4;

//	calculateDistanceBetweenPoints(x1, x2, y1, y2);

double length= Math.sqrt( ((x2 - x1) * (x2 - x1)) + ((y2- y1) * (y2- y1)) );

	System.out.println("lenth of line : " + length);

double l1=( x2 - x1 );
double l2=( y2 - y1 );

	System.out.println( l1.equals(l2) );

	System.out.println( l1.compareTo(l2) );

	}
}
