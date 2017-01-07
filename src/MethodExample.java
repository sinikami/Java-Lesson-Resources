public class MethodExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result = add(3, 4);// call add method
		System.out.println("Add method result:" + result);
		System.out.println("Add method's Done");
		printCharacter('*', 30, "");
		System.out.println("hello,Java");
		printCharacter('-', 30, "");

		for (String parameter : args) {
			System.out.print(parameter);
			System.out.print("/");
		}
		System.out.println("length:" + args.length);

		SillyExample();
		tryExample();
		BooleanTypeExample();
		LiteralExample();
		LiteralUnicode();
		LiteralLongString();
		LiteralBooleanExample();
	}

	static int add(int num1, int num2) {// sum up
		int sum;
		sum = num1 + num2;
		return sum;
	}

	static void printCharacter(char ch, int num, String msg) {
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println("");
		System.out.println(msg);
		return;
	}

	static void SillyExample() {
		System.out.println("Start SillyExample.");
		int a = 3, b = 0;
		int result;
		try {
			result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("-> something got wrong.");
		}
		System.out.println("SillyExample's done.");
	}

	static void tryExample() {
		printCharacter('=', 30, "Start tryExample.");
		int divisor[] = { 5, 4, 3, 2, 1, 0 };
		for (int cnt = 0; cnt < 10; cnt++) {
			try {
				int share = 100 / divisor[cnt];
				System.out.println(share);
			} catch (ArithmeticException e) {
				System.out.println("->Arithmetic Error.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("->ArrayIndex Error.");
			}
		}
		System.out.println("tryExample's done.");
	}

	static void BooleanTypeExample() {
		printCharacter('=', 30, "BooleanTypeExample.");
		int num = 10 + 20;
		boolean truth;
		truth = num > 10;
		if (truth) {
			System.out.println("the num is greater than 10.");
		}
	}

	static void LiteralExample() {
		printCharacter('=', 30, "Start LiteralExample.");
		float num;
		// double num;
		num = 12.34f;
		System.out.println(num);
		long num2 = 1234567890123L;
		System.out.println(num2);

	}

	static void LiteralUnicode() {
		printCharacter('=', 30, "LiteralUnicode.");
		char arr[] = { 'J', 'a', '\166', '\144' };
		for (char ch : arr) {
			System.out.println(ch);
		}
	}

	static void LiteralLongString() {
		printCharacter('=', 30, "LiteralLongString.");
		String str = "aasdfasdfsadfsadf ";
		str += "wwowowowowwww ";
		str += "sdfasdfasdasf.";
		System.out.println(str);
	}

	static void LiteralBooleanExample() {
		printCharacter('=', 30, "LiteralBooleanExample.");
		int num = 10000;
		boolean isBig;
		if (num > 100) {
			isBig = true;
		} else {
			isBig = false;
		}
		System.out.println(isBig);
 
	}
}



