
public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loopExamples Ex = new loopExamples();
		Ex.DoWhile();
	}

	public void DoWhile() {//Do While example
		int cnt = 0;
		do {
			System.out.println(cnt);
			cnt++;
		} while (cnt < 10);
		System.out.println("Done");
	}

	public void While() {//While example
		int cnt = 0;
		while (cnt < 10) {
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done");
	}

}
