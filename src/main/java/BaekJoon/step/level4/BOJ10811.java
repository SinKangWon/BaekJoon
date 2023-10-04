package BaekJoon.step.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        int bowl;
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int end = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int a = start;

            for (int l = end; l > start; l--) {
                if (a >= l) {
                    break;
                } else {
                    bowl = basket[l];
                    basket[l] = basket[a];
                    basket[a] = bowl;
                    a = a + 1;

                }

            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < basket.length; i++) {
            result.append(basket[i]).append(" ");
        }
        System.out.println(result);
    }

}