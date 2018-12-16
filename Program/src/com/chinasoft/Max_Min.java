package com.chinasoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 连续输出最大值和最小值
 */
public class Max_Min {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNext()) {
            for (int i = 0; i < num; i++) {
                int x = sc.nextInt();
                list.add(x);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }




}
