public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(5);
	}

	public static void fizzBuzz(int n) {
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
		}
	}

}
