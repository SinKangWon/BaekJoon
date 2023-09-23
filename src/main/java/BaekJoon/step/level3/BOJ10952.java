package BaekJoon.step.level3;

import java.io.*;

public class BOJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String testCase = reader.readLine();
            if (testCase.equals("0 0")) {
                break;
            }
            String[] testCaseArray = testCase.split(" ");
            int a = Integer.parseInt(testCaseArray[0]);
            int b = Integer.parseInt(testCaseArray[1]);
            writer.write((a + b) + "\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
