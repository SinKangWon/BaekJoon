package BaekJoon.step.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int quantity = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine()) % 42;
        }

        for (int i = 0; i < 10; i++) {
            for (int l = 9; l > i; l--) {

                if (array[i] == array[l]) {
                    array[i] = -1;
                }
            }

            if (array[i] >= 0) {
                quantity += 1;
            }
        }

            result.append(quantity + " ");
            System.out.println(result);
    }
}
