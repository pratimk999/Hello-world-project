package com.sapient.asde.ui;

public class SumAndAverage {
    public static void main(String[] args) {
        int n = args.length;
        double sum = 0;
        try {
            if (n == 0) throw new Exception("No value present to calculate avg");
            for (String arg : args) sum += Double.parseDouble(arg);
            System.out.println("Average is :: " + sum / n);
        } catch (Exception e) {
            System.out.println("Exception occurred :: " + e);
        }
    }
}
