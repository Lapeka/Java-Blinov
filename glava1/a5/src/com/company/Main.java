package com.company;

public class Main {

    public static void main(String[] args) {
        long sum = 0;
        long composition = 1;
        for (int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            composition *= Integer.parseInt(args[i]);
        }
        System.out.println("summ: " + sum);
        System.out.println("composition: " + composition);
    }
}
