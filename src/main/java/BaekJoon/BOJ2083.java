package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2083 {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String inputProfile = inputStr.readLine();
            if (inputProfile.equals("# 0 0")) {
                break;
            }
            String[] strArr = inputProfile.split(" ");

            String name =  strArr[0];

            int age = Integer.parseInt(strArr[1]);
            int weight = Integer.parseInt(strArr[2]);
            String level = "";

            if (age > 17 || weight >= 80) {
                level = " Senior";
            } else {
                level = " Junior";
            }
            System.out.println(name + level);
        }
    }
}
