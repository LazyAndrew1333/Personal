import java.util.Scanner;

public class combined {
	
	public static long factorial(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	public static int gcd ( int x , int y ) {
	    if ( y == 0 )                        
	        return x;
	    else if ( x >= y && y > 0)
	        return gcd ( y , x % y );
	    else return gcd ( y , x );        // if x < y then go ahead and switch them around.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose: Factorial || Euclid");
		String choice = sc.next();
		
		if (choice.equalsIgnoreCase("factorial")) {
			
			System.out.print("Input: ");
			String input = sc.next();
			sc.close();
			
			int numberOfCharacter = input.length();
			
			long result = factorial(numberOfCharacter);
			
			System.out.println(result);
			
		} else if (choice.equalsIgnoreCase("euclid")) {
			
			System.out.print("Enter first number: ");
			int number1 = sc.nextInt();
			
			System.out.print("Enter second number: ");
			int number2 = sc.nextInt();
			sc.close();
			
			int result = gcd(number1, number2);
			
			System.out.println(result);
			
		}
	}
}
