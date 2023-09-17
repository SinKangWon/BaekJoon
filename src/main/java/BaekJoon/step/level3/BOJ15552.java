package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseQuantity = Integer.parseInt(reader.readLine());
        int a;
        int b;
        for (int i = 0; i < testCaseQuantity; i++) {
            String testCase = reader.readLine();
            String[] testCaseArray = testCase.split(" ");
            a = Integer.parseInt(testCaseArray[0]);
            b = Integer.parseInt(testCaseArray[1]);
            writer.write(a + b + "\n");

        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
