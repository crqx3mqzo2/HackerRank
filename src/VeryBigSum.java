
public class VeryBigSum {
	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		long sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum =sum+ar[i];
		}
		return sum;
	}

//    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int arCount = 5; // scanner.nextInt();
		long[] ar = new long[arCount];
		String[] arItems = { "1000000001", "1000000002", "1000000003", "1000000004", "1000000005" };
		for (int i = 0; i < arCount; i++) {
			long arItem = Long.parseLong(arItems[i]);
			ar[i] = arItem;
		}

		long result = aVeryBigSum(ar);

		System.out.println(result);
	}
}