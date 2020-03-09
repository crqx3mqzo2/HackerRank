import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxOfMinSegment {

	public static void main(String[] args) {
		Integer[] lst = new Integer[] { 5, 4, 3, 6, 8 };
		segment(2, Arrays.asList(lst));

	}

	public static int segment(int x, List<Integer> arr) {

		Integer[] array = new Integer[arr.size()];
		array = arr.toArray(array);
		List<Integer> lstMenores = new ArrayList<Integer>();
		List<Integer> lstMenores1 = new ArrayList<Integer>();

		for (int j = 0; j < arr.size(); j++) {
			int init = j;
			int end = j + x;
			Integer[] array2 = Arrays.copyOfRange(array, init, end);
			lstMenores = (Arrays.asList(array2));
			Integer menor = lstMenores.get(0);
			for (int s : lstMenores) {
				if (s < menor) {
					menor = s;
				}
			}
			System.out.println("menores: " + menor);
			lstMenores1.add(menor);
			if (j + x >= arr.size()) {
				break;
			}
		}
		int mayor = lstMenores1.get(0);
		for (int s : lstMenores1) {
			if (s > mayor) {
				mayor = s;
				System.out.println("Mayor: " + mayor);

			}
		}

		return mayor;

	}

}
