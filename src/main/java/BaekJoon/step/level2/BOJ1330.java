package BaekJoon.step.level2;

import java.util.Scanner;

public class BOJ1330 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        int B = scn.nextInt();

        if (A < B){
            System.out.println("<");
        } else if (A > B) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }

    }
}
