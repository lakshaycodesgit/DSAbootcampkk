package com.company;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int num = 0; num <=n; num++) {
            System.out.println(num);
        }
    }
}
