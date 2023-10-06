package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();
        int i = Integer.parseInt(reader.readLine());
        System.out.println(S.charAt(i-1));
    }
}
