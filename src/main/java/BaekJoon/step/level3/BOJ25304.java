package BaekJoon.step.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ25304 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(reader.readLine());
        int totalQuantity = Integer.parseInt(reader.readLine());
        int inputTotal = 0;

        for (int i = 0; i < totalQuantity; i++) {
            String item = reader.readLine();
            String[] list = item.split(" ");
            int price = Integer.parseInt(list[0]);
            int quantity = Integer.parseInt(list[1]);
            inputTotal += price*quantity;

        }
        if (inputTotal == total){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }

}
