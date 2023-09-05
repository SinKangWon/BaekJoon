package BaekJoon;

import java.util.Scanner;

public class BOJ14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int quadrant1 = 1; // x && y == plus
        int quadrant2 = 2; // x = minus y == plus
        int quadrant3 = 3; // x && y == minus
        int quadrant4 = 4; // x == plus y == minus

        if (x > 0){
            if (y > 0) {
                System.out.println(quadrant1);
            } else {
                System.out.println(quadrant4);
            }
        } else {
            if (y > 0) {
                System.out.println(quadrant2);
            } else {
                System.out.println(quadrant3);
            }
        }

    }
}
