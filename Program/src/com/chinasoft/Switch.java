package com.chinasoft;

import java.util.Scanner;

/**
 * 16进制转化为10进制
 */
public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            System.out.println(Integer.parseInt(str, 16));
        }
    }
}
