package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader inputInt = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(inputInt.readLine());

        for (int i = 1; i < number; i++) {
            for (int j = number - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}