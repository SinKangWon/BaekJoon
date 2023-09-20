package BaekJoon.step.level3;

import java.io.*;

public class BOJ11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseQuantity = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCaseQuantity; i++) {
            String testCase = reader.readLine();
            String[] testCaseArray = testCase.split(" ");

            int a = Integer.parseInt(testCaseArray[0]);
            int b = Integer.parseInt(testCaseArray[1]);

            writer.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b)+ "\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
