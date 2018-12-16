package com.chinasoft;

import java.util.Scanner;

/**
 * 字符串分隔
 */
public class String_8 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = new String(sc.nextLine());
            if(s.length()%8 !=0 )
                s = s + "00000000";

            while(s.length()>=8){
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }
        }
    }
}
