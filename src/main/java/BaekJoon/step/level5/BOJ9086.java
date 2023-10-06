package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseQuantity = Integer.parseInt(reader.readLine());

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < testCaseQuantity; i++) {
            String testCase = reader.readLine();
            char[] testCaseToCharArray = testCase.toUpperCase().toCharArray();

            for (int l = 0; l < testCaseToCharArray.length; l++) {
                if (testCaseToCharArray.length == 1) {
                    string.append(testCaseToCharArray[0]).append(testCaseToCharArray[0]).append("\n");
                } else if (l == 0) {
                    string.append(testCaseToCharArray[0]);
                } else if (l == testCaseToCharArray.length - 1) {
                    string.append(testCaseToCharArray[l]).append("\n");
                }
            }
        }
        System.out.println(string);
    }
}
