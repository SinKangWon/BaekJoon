package BaekJoon.step.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int[] arr = new int[length];
        int sum = 0;
        char[] chars = reader.readLine().toCharArray();

        for (int i = 0; i < length; i++) {
            arr[i] = chars[i]-48;
        }
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
