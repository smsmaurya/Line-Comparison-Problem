package com.bridgeLabz;

public class LineComparisonMain extends LineMethods {
    public static void main(String[] args) {

        System.out.println("**********************Welcome to Line Comparison Computation*************************\n");

        LineMethods methods = new LineMethods();

        // build first line
        System.out.println("Build First Line");
        float newLine1 = methods.createLine();
        String firstLine = String.valueOf(newLine1);
        System.out.println("Length of first line is : "+firstLine);

        // build second line
        System.out.println("\nBuild second Line");
        float newLine2 = methods.createLine();
        String secondLine = String.valueOf(newLine2);
        System.out.println("Length of second line is : "+secondLine);
        System.out.println();

        // check equality of two lines using equals() method
        System.out.println("\nAfter checking the equality of both line the result is :-");
        methods.checkEquality(firstLine,secondLine);

        // compare both lines using compareTo() method
        System.out.println("\nAfter comparing two lines, the result is :-");
        methods.compare2Lines(firstLine,secondLine);
    }
}
