package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();

        int num;

/* 연습
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(3) + 1;
                arr[0] = num;
            } else {
                while (true) {
                    num = r. nextInt(3) + 1; // 1 ~ 45
                    if (arr[i-1] != num) {
                        arr[i] = num;
                        break;
                    }
                }
            }
        }

 */

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                {
                    i--;
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}