package homework_d2;

import java.util.Scanner;

public class findSquareInterger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number at start point: ");
		int start = scanner.nextInt();
		
		System.out.println("Enter a number at end point: ");
		int end = scanner.nextInt();
		
		perfectSquares(start, end);
		
	}

	
    
// O(n) => n = b - a
	
public static int perfectSquares(int a, int b){
	
	int count = 0;  

    for (int i = a; i <= b; i++) {
    	
        // If the current element is a perfect square
        if (Math.sqrt(i) == (int) Math.sqrt(i)) {
            System.out.print(i + " ");
            count++;  
        }
    }

    System.out.println("\nNumber of perfect squares: " + count);
    
    return count;  
}

}



