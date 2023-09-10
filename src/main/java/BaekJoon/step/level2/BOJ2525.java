package BaekJoon.step.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2525 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String[] currentTime = input.split(" ");

        int hour = Integer.parseInt(currentTime[0]);
        int minute = Integer.parseInt(currentTime[1]);
        int cookingTime = Integer.parseInt(reader.readLine());

        if (minute + cookingTime >= 60) {
            if (hour + (minute + cookingTime)/ 60 >= 24) {
                hour += (minute + cookingTime) / 60 - 24;
                minute = (minute + cookingTime) % 60;
                System.out.println(hour + " " + minute);
            }
            else {
            hour += (minute + cookingTime)/ 60;
            minute = (minute + cookingTime) % 60;
                System.out.println(hour + " " + minute);
            }

        } else {
            minute = minute + cookingTime;
            System.out.println(hour + " " + minute);
        }
    }
}

