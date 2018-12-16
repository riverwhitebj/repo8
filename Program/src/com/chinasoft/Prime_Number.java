package com.chinasoft;

import java.util.Scanner;

/**
 * 求质因子
 */
public class Prime_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long num = sc.nextLong();

            long t = num;
            for (int i = 2; i <= t; i++) {
                while (num % i == 0) {
                    num = num / i;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
