package com.bridgeLabz;

import java.util.Scanner;

public class LineComparisonMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        float newLine = createLine();
        System.out.println(" Length of line is : "+newLine);
    }
    public static float createLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1, y1, x2,y2 ");
        int x1 = sc.nextInt(),y1 = sc.nextInt(), x2 = sc.radix(),y2 = sc.nextInt();
        int x = x2-x1, y = y2-y1;
        return (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
