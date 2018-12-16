package com.chinasoft;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 去重、排序
 */
public class Sort_Set {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < num; i++) {
                treeSet.add(sc.nextInt());
            }

            for (Integer i : treeSet) {
                System.out.println(i);
            }
        }
    }
}
