package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		System.out.println("solution of find the pattern then implement the logic from this pattern: ");
		pattern();

	}

	public static void pattern() {
		int update = 0;
		int numbers = 100;
		int factor = 1;
		boolean condition = true;

		System.out.print(numbers + ",");

		while (condition) {

			for (int j = 1; j <= 10; j++) {

				update = numbers - (j * factor);

				if (update > 0) {
					System.out.print(update + ",");
				} else if (update == 0) {
					System.out.print(update);
				} else {
					condition = false;
				}

				if (j == 10) {
					numbers = update;
				}
			}
			factor++;
		}

	}

}