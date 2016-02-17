package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Press enter amount of number: ");
        try {
            int x = System.in.read() - 48;
            for (int i = 0; i < x; i++){
                System.out.println((int)(Math.random() * 10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
