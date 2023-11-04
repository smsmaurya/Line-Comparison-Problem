package com.bridgeLabz;

public class LineComparisonMain extends LineMethods {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation");
        System.out.println();

        LineMethods methods = new LineMethods();
        System.out.println("Build First Line");
        float newLine1 = methods.createLine();
        System.out.println("Length of first line is : "+newLine1);
        System.out.println();

        System.out.println("Build second Line");
        float newLine2 = methods.createLine();
        System.out.println("Length of second line is : "+newLine2);
        System.out.println();

        System.out.println("\nAfter checking the equality of both line the result is :-");
        methods.checkEquality(newLine1,newLine2);
    }

}
