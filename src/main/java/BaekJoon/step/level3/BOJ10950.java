package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10950 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            String aPlusB = reader.readLine();
            String[] ab = aPlusB.split(" ");

            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            System.out.println(a+b);
        }
    }
}
