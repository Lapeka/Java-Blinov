package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Press enter first name: ");
        Scanner scn = new Scanner(System.in);
        String firstName = scn.next();
        Date firstDate = new Date();
        int quntityDay = 7;
        Date finishDate = new Date(firstDate.getTime() + quntityDay * 1000 * 60 * 60 * 24);
        System.out.println("first name: " + firstName);
        System.out.println("start date: " + firstDate);
        System.out.println("finish date: " + finishDate);
        scn.close();
    }
}
