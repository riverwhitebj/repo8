package com.chinasoft;

import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;
public class Date_Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            try {
                System.out.println(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()).getDayOfYear());
            } catch (DateTimeException e) {
                System.out.println(-1);

            }
            break;
        }
        sc.close();
    }
}
