import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class FindShortestSubstring {

	  public static int findShortestSubstring(String s) {
	        HashMap<Character, Integer> charCount = new HashMap<>();
	        HashSet<Character> duplicates = new HashSet<>();
	        
	        // Contar las ocurrencias de cada carácter y encontrar los duplicados
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	            if (charCount.get(c) > 1) {
	                duplicates.add(c);
	            }
	        }

	        if (duplicates.isEmpty()) {
	            return 0; // Todos los caracteres son únicos
	        }
	        
	        HashMap<Character, Integer> windowCounts = new HashMap<>();
	        int minLength = Integer.MAX_VALUE;
	        int left = 0;

	        // Recorre la cadena con una ventana deslizante para encontrar la subcadena más corta que contiene todos los caracteres duplicados
	        for (int right = 0; right < s.length(); ++right) {
	            char cRight = s.charAt(right);
	            windowCounts.put(cRight, windowCounts.getOrDefault(cRight, 0) + 1);
	            
	            while (windowCounts.keySet().containsAll(duplicates)) {
	                minLength = Math.min(minLength, right - left + 1);
	                
	                char cLeft = s.charAt(left);
	                windowCounts.put(cLeft, windowCounts.getOrDefault(cLeft, 0) - 1);
	                if (windowCounts.get(cLeft) == 0) {
	                    windowCounts.remove(cLeft);
	                }
	                
	                left++;
	            }
	        }
	        
	        return minLength == Integer.MAX_VALUE ? 0 : minLength;
	    }
	    
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        int result = FindShortestSubstring.findShortestSubstring(s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}
