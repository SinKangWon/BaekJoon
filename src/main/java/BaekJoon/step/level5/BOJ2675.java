package BaekJoon.step.level5;

import java.io.*;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i ++)
        {

            String[] S = reader.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            String arr = S[1];

            for (int j = 0; j < arr.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(arr.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        reader.close();
    }
}