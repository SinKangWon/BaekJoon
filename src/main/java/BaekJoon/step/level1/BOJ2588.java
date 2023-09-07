package BaekJoon.step.level1;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int num1 = b%10;
        int num2 = (b/10)%10;
        int num3 = b/100;

        System.out.println(a*num1);
        System.out.println(a*num2);
        System.out.println(a*num3);
        System.out.println(a*b);
    }
}
