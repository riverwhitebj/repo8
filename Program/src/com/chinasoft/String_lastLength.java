package com.chinasoft;

import java.util.Scanner;

/**
 * 输出字符串最后一个单词的长度
 */
public class String_lastLength {

    public static void main(String[] args) {
        //输入一个字符串
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            System.out.println(s.length() -1 - s.lastIndexOf(" "));
        }
    }
}
