package com.chinasoft;

import java.util.Scanner;

/**
 * 四舍五入取近似值
 */
public class Test_Round {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Float num = sc.nextFloat();

        int x = Math.round(num);

        System.out.println(x);

    }
}
