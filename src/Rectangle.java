/**
 * Josh Bauer 
 * Period 7
 * Rectangle
 */
import java.util.Scanner;


public class Rectangle 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the value of the length: ");
		int length = in.nextInt();
		System.out.println("Enter the value of the width: ");
		int width = in.nextInt();
		
		double area = length * width; 
			System.out.printf("\narea: " + "%8.0f" , area);
			
		double perimeter = length + length + width + width;
			System.out.printf("\nperimeter: " + "%5.2f" , perimeter);
		
		double pythag = (length*length) + (width + width);
		double diagonal = Math.sqrt(pythag);
		System.out.printf("\nDiagonal: " + "%6.2f" , diagonal);
		
		

	}

}
