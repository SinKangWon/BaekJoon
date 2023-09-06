package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1264 {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = inputStr.readLine();
            if (str.equals("#")) {
                break;
            }
            str = str.toLowerCase();
            int gatherCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char gather = str.charAt(i);
                if (gather == 'a' || gather == 'e' || gather == 'i' || gather == 'o' || gather == 'u') {
                    gatherCount ++;
                }

            }
            System.out.println(gatherCount);

        }
    }
}
