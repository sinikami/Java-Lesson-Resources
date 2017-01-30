package homework;

public class homework_01 {

	public void printNumbers() {// print numbers 10 to 1

		int num = 10;
		while (num > 0) {
			System.out.println(num);
			num--;
		}
	}

	public void sumUp() {
		double[] numbers = { 97.5, 100.0, 79.5 };
		System.out.println(numbers[0]+numbers[1]+numbers[2]);
	}

	public void shuffle() {
		int x = 3;
		while (x > 0) {

			if (x == 2) {
				System.out.print("b c");
				x = x - 1;
				System.out.print("-");
			} else if (x > 2) {
				System.out.print("a");
				x = x - 1;
				System.out.print("-");
			} else if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}

		}
	}


}
