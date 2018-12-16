package com.chinasoft;

import java.util.Scanner;

/**
 * 计算字符个数
 */
public class Char_Count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);
        int count = getCount(str, c);
        System.out.println(count);
    }

    public static int getCount(String str, char c) {

        int count = 0;
        if (str != null && str.length() > 0) {
            String string = c + "";
            for (int i = 0; i < str.length(); i++) {
                if (string.equalsIgnoreCase(str.charAt(i) + "")) {
                    count ++;
                }
            }
        } else {
            count = 0;
        }
        return count;
    }
}
