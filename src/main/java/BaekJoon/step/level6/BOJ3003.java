package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = (reader.readLine().split(" "));
        int[] intArray = {
                Integer.parseInt(input[0]),
                Integer.parseInt(input[1]),
                Integer.parseInt(input[2]),
                Integer.parseInt(input[3]),
                Integer.parseInt(input[4]),
                Integer.parseInt(input[5])
        };
        int[] set = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < intArray.length; i++) {
            set[i] -= intArray[i];
            System.out.print(set[i] + " ");
        }

    }
}
