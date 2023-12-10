package BaekJoon.step.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        String result = "";
        for (int i = 0; i < T; i++) {
            String input = reader.readLine();
            result += isPalindrome(input) + "\n";
        }
        System.out.println(result);


    }

    public static String recursion(String s, int l, int r) {
        if (l >= r) return "1 " + (l + 1);
        else if (s.charAt(l) != s.charAt(r)) return "0 " + (l + 1);
        else return recursion(s, l + 1, r - 1);
    }

    public static String isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}