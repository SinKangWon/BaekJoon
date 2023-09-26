package BaekJoon;

import java.io.*;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String testCase = reader.readLine();
        char[] testCaseCharArray = testCase.toCharArray();

        for (int i = 0; i < testCaseCharArray.length; i++) {
            writer.write(Character.toString(testCaseCharArray[i]));
            if ((i % 10) - 9 == 0) {
                writer.write("\n");
            }
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
