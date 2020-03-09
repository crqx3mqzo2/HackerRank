import java.io.*;

public class ArraySum {
	
	static int simpleArraySum(int[] ar) {
		
		int[] array = ar;
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		return sum;

    }
    
    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = 2; //Integer.parseInt(scanner.nextLine().trim());
        int[] ar = new int[arCount];

        String[] arItems = {"1","2"};

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);
        System.out.println(result);
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//        bufferedWriter.close();
    }
}
