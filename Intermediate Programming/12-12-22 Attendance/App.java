import java.util.Scanner;

public class App {

	/*	John Andrew M. Divina
	 * 	Earl Anthony Gamboa
	 * 	BSCS COM221				*/

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 			// Created a scanner object
        
        int[] Array = {15, 30, 19, 25, 30, 45}; 		// Initialized an array
		int sum = 1; 									// Initialized the sum for the size of the array. This is used to identify whether the program should continue or stop
        int validity = 1;

        while (sum > 0) { 								// Initialized a while loop where the condition is if the sum is greater than zero, the program will continue
			sum -= sum; 								// Resets the Sum counter back to zero
            System.out.print("\nEnter a number to delete: ");
            int input = scan.nextInt();
            
			if (input == 15 || input == 19 || input == 25 || input == 30 || input == 45) {

				for (int i = 0; i <= Array.length - 1; i++) {
					if (Array[i] == input) {
						Array[i] -= Array[i];
					}
					sum += Array[i];
				}
				if (sum != 0) {										// An if condition used to print "New List" if the program continues, and "Array is Empty" when the program ends
				System.out.print("New List: ");
				}
				
				for (int i = 0; i <= Array.length - 1; i++) {		// A for loop to loop through the array elements
					if (Array[i] == input) {						// An if condition used to convert to zero the Array element that matched the user's input
						Array[i] -= Array[i];
					}
					if (Array[i] != 0) {							// An if condition used to skip all the Array elements that was converted to zero
						System.out.print(Array[i] + " ");
					}
					sum += Array[i];								// Computes the sum of the size of the array
				}
				if (sum == 0) {
					System.out.println("Array is Empty");
					validity = 0;
				}
			} else {												// An else condition used to print "Error" when the user's input did not matched any Array element
				System.out.println("Error! No element found");
				sum += 1;											// Adds 1 to the sum to prevent the program to stop prematurely
			}
        }
    }

}
