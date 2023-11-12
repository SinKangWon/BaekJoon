package BaekJoon.step.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseLength = Integer.parseInt(reader.readLine());
        int cost[] = new int[testCaseLength];
        for (int i = 0; i < testCaseLength; i++) {
            int testCase = Integer.parseInt(reader.readLine());
            cost[i] = testCase;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cost) {
            int quarter = i/25;
            int dime = (i%25)/10;
            int nickel = ((i%25)%10)/5;
            int penny = (((i%25)%10)%5)/1;
            sb.append(quarter + " ").append(dime + " ").append(nickel + " ").append(penny + "\n");
        }

        System.out.println(sb);
    }
}
