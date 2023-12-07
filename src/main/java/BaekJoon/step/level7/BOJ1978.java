package BaekJoon.step.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrN = new int[Integer.parseInt(reader.readLine())];

        StringTokenizer st = new StringTokenizer(reader.readLine());

        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int n : arrN) {
            Boolean divisor = true; // 약수(divisor) true, false
            if (n == 1)
            {
                divisor = true;
            } else if (n == 2)
            {
                divisor = false;
            } else {
                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                    {
                        divisor = true;
                        break;
                    }
                    divisor = false;
                }
            }
            if (divisor == false)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
