import java.util.ArrayList;
import java.util.List;

public class MinimalOperations {

	 public static List<Integer> minimalOperations(List<String> words) {
		List<Integer> result = new ArrayList<>();

        for (String word : words) {
            int count = 0;
            
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) == word.charAt(j - 1)) {
                    count++;
                    j++;
                }
            }
            result.add(count);
        }
        
        return result;
	}

	public static void main(String[] args) {
		List<String> testWords = List.of("add", "boook", "break");
		List<Integer> result = minimalOperations(testWords);

		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
