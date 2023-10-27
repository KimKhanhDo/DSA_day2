package homework_d2;

import java.util.ArrayList;

public class NumberAppearOddTimes2 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 100, 400, 15, 3, 15, 15 };

		ArrayList<Integer> oddTimesNumbers = getNumberAppearOddTimes(numbers);

	    System.out.print("Numbers appear odd times: ");
	    for (int number : oddTimesNumbers) {
	        System.out.print(number + " ");
	    }

	}

	// Time complexity: O(n)
	private static ArrayList<Integer> getNumberAppearOddTimes(int[] numbers) {

		ArrayList<Integer> count = new ArrayList<Integer>();

		for (int number : numbers) {

			int index = count.indexOf(number);

			if (index == -1) {
				count.add(number);
			} else {
				count.remove(index);
			}
		}
		return count;

	}
}
