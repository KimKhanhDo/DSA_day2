package homework_d2;

import java.util.ArrayList;

public class NumberAppearOddTimes2 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 100, 400, 15, 3, 15, 15 };

		getNumberAppearOddTimes(numbers);

	}
	

	// Time complexity: O(n)
	private static void getNumberAppearOddTimes(int[] numbers) {

		ArrayList<Integer> count = new ArrayList<Integer>();

		for (int number : numbers) {

			int index = count.indexOf(number);

			if (index == -1) {
				count.add(number);
			} else {
				count.remove(index);
			}
		}

		for (int number : count) {
			System.out.print(number + " ");

		}
	}
}
