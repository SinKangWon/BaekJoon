package BaekJoon.step.level2;

import java.util.Scanner;

public class BOJ9498 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int score = scn.nextInt();

        if (score <= 100 && score > 89) {
            System.out.println("A");
        } else if (score <= 89 && score > 79) {
            System.out.println("B");
        } else if (score <= 79 && score > 69) {
            System.out.println("C");
        } else if (score <= 69 && score > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
