package BaekJoon.step.level3;

import java.io.*;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String testCase;

        while (true) {
            try {
                testCase = reader.readLine();
                String[] testCaseArray = testCase.split(" ");
                int a = Integer.parseInt(testCaseArray[0]);
                int b = Integer.parseInt(testCaseArray[1]);
                writer.write(a + b + "\n");
            } catch (Exception e) {
                break;
            }

        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
