import java.util.Scanner;

public class ArraySum {

	static int simpleArraySum(int[] ar) {
		int sum = 0;
		for (int num : ar) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int arCount = Integer.parseInt(scanner.nextLine().trim());
			int[] ar = new int[arCount];

			String[] arItems = scanner.nextLine().split(" ");

			for (int i = 0; i < arCount; i++) {
				int arItem = Integer.parseInt(arItems[i].trim());
				ar[i] = arItem;
			}

			int result = simpleArraySum(ar);
			System.out.println(result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}