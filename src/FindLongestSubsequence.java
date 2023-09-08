import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLongestSubsequence {

	public static int findLongestSubsequence(List<Integer> arr) {
		int maxLength = 0;

		int n = arr.size();
		for (int i = 1; i < (1 << n); i++) {
			List<Integer> subSeq = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					subSeq.add(arr.get(j));
				}
			}

			Collections.sort(subSeq);
			int sum = 0, sumDiff = 0;
			for (int j = 0; j < subSeq.size(); j++) {
				sum += subSeq.get(j);
				if (j > 0) {
					sumDiff += Math.abs(subSeq.get(j) - subSeq.get(j - 1));
				}
			}

			if (sum % 2 == 0 && sumDiff % 2 == 0) {
				maxLength = Math.max(maxLength, subSeq.size());
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(4);
		arr.add(1);
		arr.add(7);

		int result = findLongestSubsequence(arr);
		System.out.println("The length of the longest valid subsequence is: " + result);
	}
}
