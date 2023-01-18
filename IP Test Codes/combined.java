import java.util.Scanner;

public class combined {
	
	static boolean choiceCorrect = false;
	
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
	
	static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (choiceCorrect != true) {
			System.out.println("Choose: Factorial || Euclid");
			String choice = sc.next();
			
			if (choice.equalsIgnoreCase("factorial")) {
				
				choiceCorrect = true;
				
				System.out.print("Input: ");
				String input = sc.next();
				sc.close();
				
				int numberOfCharacter = input.length();
				
				long result = factorial(numberOfCharacter);
				
				System.out.println(result);
				
		        printPermutn(input, "");
				
			} else if (choice.equalsIgnoreCase("euclid")) {
				
				choiceCorrect = true;
				
				System.out.print("Enter first number: ");
				int number1 = sc.nextInt();
				
				System.out.print("Enter second number: ");
				int number2 = sc.nextInt();
				sc.close();
				
				int result = gcd(number1, number2);
				
				System.out.println(result);
				
			} else {
				System.out.println("SA DALAWA KA LANG PUMILI!!!");
			}
		}
	}
}
