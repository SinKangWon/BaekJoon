package BaekJoon.step.level4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] baskets = new int[N];

        for (int t = 0; t < M; t++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int j = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int k = Integer.parseInt(stringTokenizer.nextToken());

            for (int l = i; l <= j; l++) {
                baskets[l] = k;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < baskets.length; i++) {
            stringBuilder.append(baskets[i]);
            if (i < baskets.length - 1) {
                stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder);

    }
}
