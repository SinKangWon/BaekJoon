package BaekJoon;

import java.util.Scanner;

public class BOJ10430 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt(), B = scn.nextInt(), C = scn.nextInt();

        scn.close();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
