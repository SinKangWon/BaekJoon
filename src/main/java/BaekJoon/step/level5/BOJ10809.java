package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (i + 97);
        }

        char[] S = reader.readLine().toCharArray();
        for (int i = 0; i < S.length; i++) {
            for (int l = 0 ; l < 26; l ++) {
                if (S[i] == alphabet[l]) {
                    arr[l] = i;
                    alphabet[l] = '0';
                }
            }
        }

        StringBuilder makeString = new StringBuilder();
        for (int i : arr) {
            makeString.append(i).append(" ");
        }

        System.out.println(makeString);
    }
}
