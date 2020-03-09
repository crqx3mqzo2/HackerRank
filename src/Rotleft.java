import java.util.Arrays;

public class Rotleft {
	public static void main(String[] args) {

		int[] vector = { 1, 2, 3, 4, 5 };

		int[] result = rotleft(vector, 4);
		System.out.println(Arrays.toString(result));

		StringBuffer cadena = new StringBuffer();

		for (int i = 0; i < result.length; i++) {
			cadena = cadena.append(result[i]).append("a");
		}
		String cadena1 = cadena.toString();
		String x = cadena1.replace("a", " ");
		System.out.println(x);

	}

	public static int[] rotleft(int[] a, int d) {

		int[] vector = a;
		for (int j = 0; j < d; j++) {
			int aux = vector[0];
			for (int i = 0; i < vector.length - 1; i++) {
				vector[i] = vector[i + 1];
			}
			vector[vector.length - 1] = aux;
		}
		return vector;

	}

}
