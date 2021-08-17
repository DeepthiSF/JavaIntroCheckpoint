package com.statefarm;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int totalSum = 0;

        if (args.length < 1) {
            System.out.println(0);
            // return 0;
        } else {
            for (int i = 0; i < args.length; i++) {
                int x = Integer.parseInt(args[i]);
                if (x > 0) {
                    totalSum += x;
                }
            }
            System.out.println(totalSum);
        }
    }

}
