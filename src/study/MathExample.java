package study;

import java.util.Random;

/**
 * Created by ikocos on 25/02/2017.
 */
public class MathExample {
    public static void main(String[] args) {
/*        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));


        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());*/


        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = lottoNum(lotto);
            System.out.print(lotto[i] + " ");
        }


    }

    public static int lottoNum(int[] lotto) {
        Random random = new Random();
        int number = random.nextInt(45) + 1;
        int cnt = 1;
        while (cnt<lotto.length) {

            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == number) {
                    number = random.nextInt(45) + 1;
                    break;
                }
                cnt++;
            }

        }
        return number;
    }
}
