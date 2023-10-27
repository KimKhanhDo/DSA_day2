package homework_d1;

import java.util.Scanner;

public class SquareRoot2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Square root of a number is: " + findSquare(number));
		
	}
	
	// Time complexity: O(logN)
	public static double findSquare(int number) {
	    if (number == 0 || number == 1) {
	        return (double) number;
	    }

	    double start = 0;
	    double end = number;
	    double exactResult = 0.01;

	    while (true) {
	        double mid = (start + end) / 2;
	        double square = mid * mid;

	        if (Math.abs(square - number) < exactResult) {
	            return mid;
	        }

	        if (square < number) {
	            start = mid;
	        } else {
	            end = mid;
	        }
	    }
	}

}

