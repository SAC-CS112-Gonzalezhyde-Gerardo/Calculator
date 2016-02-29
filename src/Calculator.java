import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		int x; 
		int y;
		int sum;
		int difference;
		int product; 
		int quotent;
		
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		sum = x + y;
		difference = x - y;
		product = x * y;
		quotent = x / y; 
		
		System.out.printf( "Sum is %d\n, difference is %d\n, product is %d\n, quotent is %d\n", sum, difference, product, quotent );
	}
}


		