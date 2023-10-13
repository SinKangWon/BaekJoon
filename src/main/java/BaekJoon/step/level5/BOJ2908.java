package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer AB = new StringTokenizer(reader.readLine());
        reader.close();
        String A = AB.nextToken();
        String B = AB.nextToken();

        int a = reverseNum(A);
        int b = reverseNum(B);

        System.out.println(Math.max(a, b));
        }
        private static int reverseNum(String input) {
            int square = 1;
            int returnNum = 0;
            for (int i = 0; i < input.length(); i++) {
                returnNum += Integer.parseInt(String.valueOf(input.charAt(i))) * square;
                square *= 10;
            }
        return returnNum;
        }
}
