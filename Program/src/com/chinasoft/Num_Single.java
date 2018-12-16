package com.chinasoft;

import java.util.Scanner;

/**
 * 数字去重
 */
public class Num_Single {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String a = str.substring(str.length() - 1);
            for (int i = str.length() - 2; i >= 0; i--) {
                if(!a.contains(str.substring(i, i + 1))){
                    a += str.substring(i, i + 1);
                }
            }
            System.out.println(a);
        }
    }
}
