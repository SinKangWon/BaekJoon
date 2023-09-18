package BaekJoon.step.level3;

import java.io.*;

public class BOJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseQuantity = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCaseQuantity; i++) {
            String testCase = reader.readLine();
            String[] testCaseSplit = testCase.split(" ");

            int a = Integer.parseInt(testCaseSplit[0]);
            int b = Integer.parseInt(testCaseSplit[1]);

            writer.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
