/*Jui Mestry
  Write a program to create user defined exception to display the given no is 
  prime or not use try catch finally throw and throws*/

package Assignment;
import java.util.Scanner;
class NotPrime extends Exception {
    public NotPrime(String message) {
        super(message);
    }
}

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if it's prime or not: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        try {
	            if (isPrime(number)) {
	                System.out.println(number + " is a prime number.");
	            } else {
	                System.out.println(number + " is not a prime number.");
	            }
	        } catch (NotPrime e) {
	            System.out.println(e.getMessage());
	        } finally {
	            System.out.println("Program finished.");
	        }
	    }

	    public static boolean isPrime(int number) throws NotPrime {
	        if (number < 2) {
	            throw new NotPrime(number + " is not a prime number.");
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                throw new NotPrime(number + " is not a prime number.");
	            }
	        }

	        return true;
	    }

	}
