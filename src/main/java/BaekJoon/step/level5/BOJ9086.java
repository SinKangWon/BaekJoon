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
            String testCaseArray = reader.readLine();
            string.append(testCaseArray.charAt(0)).append(testCaseArray.charAt(testCaseArray.length() - 1)).append("\n");
        }
        System.out.println(string);
    }
}
