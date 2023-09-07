package BaekJoon.step.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader inputInt = new BufferedReader(new InputStreamReader(System.in));
        String inputTime = inputInt.readLine();
        String[] time = inputTime.split(" ");


        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        if (minute < 45) {
            minute += 15;

            if (hour < 1) {
                hour += 23;
            }
            else {
                hour -= 1;
            }
        }
        else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
