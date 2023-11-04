package com.bridgeLabz;

import java.util.Scanner;

public class LineMethods {
    public float createLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1, y1, x2,y2 ");
        int x1 = sc.nextInt(),y1 = sc.nextInt(), x2 = sc.radix(),y2 = sc.nextInt();
        int x = x2-x1, y = y2-y1;
        return (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public void checkEquality(String line1, String line2){
        if(line1.equals(line2)){
            System.out.println("both lines are equal.");
        }
        else {
            System.out.println("Both lines are not equal.");
        }
    }

    public void compare2Lines(String line1, String line2){
        int compareLines = line2.compareTo(line1);
        if(compareLines>0){
            System.out.println("First line is grater than second line.");
        }
        else {
            System.out.println("Second line is grater than first Line.");
        }
    }
}
