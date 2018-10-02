import java.util.Scanner;

public class Rectangle 
{

	public Rectangle(int sideA, int sideB, int sideC, int sideD) 
	{
		
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of side A: ");
		int sideA = in.nextInt();
		System.out.println("The Length of side A is" + " " + sideA);
		System.out.println("Enter the value of side B: ");
		int sideB = in.nextInt();
		System.out.println("The Length of side B is" + " " + sideB);
		System.out.println("Enter the value of side C: ");
		int sideC = in.nextInt();
		System.out.println("The Length of side C is" + " " + sideC);
		System.out.println("Enter the value of side D: ");
		int sideD = in.nextInt();
		System.out.println("The Length of side D is" + " " + sideD);
		
		Rectangle box = new Rectangle(sideA, sideB, sideC, sideD);
		
		int area = sideC * sideD; 
			System.out.println("\narea: " + area);
			
		int perimeter = sideA + sideB + sideC + sideD;
			System.out.println("\nperimeter: " + perimeter);
		
		double pythag = (sideC*sideC) + (sideD + sideD);
		double diagonal = Math.sqrt(pythag);
		System.out.printf("\nDiagonal: " + "%5.2f" , diagonal);
		
		

	}

}
