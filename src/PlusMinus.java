import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String strings = bufferedReader.readLine();
		String strings2 = bufferedReader.readLine();
		
		String[] arrTemp = strings2.replaceAll("\\s+", " ").split(" ");

//		System.out.println(Arrays.toString(arrTemp));

//		int[] numbers = { -4 3 -9 0 4 1 };
		int[] numbers = Stream.of(arrTemp).mapToInt(Integer::parseInt).toArray();
		
//		System.out.println(Arrays.toString(numbers));

		List<Integer> arr = new ArrayList<>();

		String[] result = calculate(numbers);
		for (int i = 0; i < result.length; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
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