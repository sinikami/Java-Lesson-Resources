package study;

public class loopExamples {
	public void DoWhile() {// Do While example
		int cnt = 0;
		do {
			System.out.println(cnt);
			cnt++;
		} while (cnt < 10);
		System.out.println("Done DowhileExample");
	}

	// ForExample
	public void ForExample() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
		}
		System.out.println("Done ForExample");
	}

	public void While() {// While example
		int cnt = 0;
		while (cnt < 10) {
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done WhileExample");
	}

	// ForExampleOfArray
	public void ForExampleOfArray() {
		int arr[] = { 10, 20, 30, 40, 50 };
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */

		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println("Done ForExampleOfArray");
	}

	public void SwitchExample() {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("Good morning, Java");
			// break;
		case 2:
			System.out.println("Good afternoon, Java");
			// break;
		case 3:
			System.out.println("Good Evening, Java");
			// break;
		default:
			System.out.println("Hello, Java");
			// break;

		}
		System.out.println("Done. Switch Example");
	}

	public void SwitchExampleOfApple() {
		char num = 'a';
		switch (num) {
		case 'A':
		case 'a':
			System.out.println("Apple");
			break;
		case 'P':
		case 'p':
			System.out.println("p");
			break;
		case 'G':
		case 'g':
			System.out.println("G");
			break;
		default:
			System.out.println("who I am");
			break;

		}
		System.out.println("Done. Switch Example");
	}

	public void BreakForExample() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5)
				break;
		}
		System.out.println("Done. BreakForExample.");
	}

	public void BreakMultipleForExample() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.println(row + "," + col);
				if (row == 1 && col == 3)
					break;
			}
		}
		System.out.println("Done. BreakMultipleForExample.");
	}

	// break outside for statement
	public void BreakMultipleForExample1() {
		outerloop: for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.println(row + "," + col);
				if (row == 1 && col == 3)
					break outerloop;
			}
		}
		System.out.println("Done. BreakMultipleForExample1.");
	}

	// continue for statement example
	public void ContinueForStatementExample() {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);

		}
		System.out.println("Done.ContinueForStatementExample.");
	}

	// continue while statement example
	public void ContinueWhileStatementExample() {
		int cnt = 0;
		while (cnt < 10) {
			if (cnt == 5) {
				cnt++;
				continue;
			}
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.ContinueWhileStatementExample.");
	}
}
 
