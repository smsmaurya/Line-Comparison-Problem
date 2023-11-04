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

    public void checkEquality(float line1, float line2){
        if(line1==line2){
            System.out.println("both lines are equal.");
        }
        else {
            System.out.println("Both lines are not equal.");
        }
    }
}
