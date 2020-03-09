import java.text.DecimalFormat;

public class PlusMinus {

	public static void main(String[] args) {

		int[] numbers = { -4, 3, -9, 0, 4, 1 };

		String[] result = calculate(numbers);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static String[] calculate(int[] numbers) {
		int size = numbers.length;
		int positive = 0;
		int zeros = 0;
		int negative = 0;

		for (int i = 0; i < size; i++) {
			if (numbers[i] > 0) {
				positive++;
			} else if (numbers[i] < 0) {
				negative++;
			} else {
				zeros++;
			}
		}

		DecimalFormat df = new DecimalFormat("#.######");
		df.setMinimumFractionDigits(6);

		Double positiveFraction = (double) positive / (double) size;
		Double negativeFraction = (double) negative / (double) size;
		Double zeroFraction = (double) zeros / (double) size;

		String[] result = new String[3];
		result[0] = df.format(positiveFraction.doubleValue());
		result[1] = df.format(negativeFraction.doubleValue());
		result[2] = df.format(zeroFraction.doubleValue());

		return result;
	}
}