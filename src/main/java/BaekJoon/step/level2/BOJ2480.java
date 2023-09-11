package BaekJoon.step.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2480{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String[] inputDice = input.split(" ");

        int dice1 = Integer.parseInt(inputDice[0]);
        int dice2 = Integer.parseInt(inputDice[1]);
        int dice3 = Integer.parseInt(inputDice[2]);

        if (dice1 == dice2 && dice2 == dice3) {
            System.out.println(dice1 * 1000 + 10000);
        } else if (dice1 == dice2 && dice1 != dice3) {
            System.out.println(dice1 * 100 + 1000);
        } else if (dice1 == dice3 && dice1 != dice2) {
            System.out.println(dice1 * 100 + 1000);
        } else if (dice2 == dice3 && dice2 != dice1) {
            System.out.println(dice2 * 100 + 1000);
        } else if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
            if (dice1 > dice2 && dice1 > dice3) {
                System.out.println(dice1 * 100);
            } else if (dice2 > dice1 && dice2 > dice3) {
                System.out.println(dice2 * 100);
            } else if (dice3 > dice1 && dice3 > dice2) {
                System.out.println(dice3 * 100);
            }
        }

    }
}
