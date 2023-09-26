package BaekJoon;

import java.io.*;

public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseQuantity = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCaseQuantity; i++) {

            String testCaseString = reader.readLine();
            int sum = 0;
            int total = 0;
            for (int l = 0; l < testCaseString.length(); l++) {
                char[] testCaseArray = testCaseString.toCharArray();
                if (testCaseArray[l] == 'O') {
                    sum += 1;
                    total += sum;
                }else {
                    sum = 0;
                }
            }
            writer.write(Integer.toString(total));
            writer.newLine();
        }
        writer.flush();
        reader.close();
        writer.close();

    }
}
