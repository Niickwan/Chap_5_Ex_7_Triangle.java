package com.company;
import java.util.Scanner;

public class Main {

    // Check if it's possible to make a triangle
    public static void triangle (int a, int b, int c){
        if (a + b > c) {
            System.out.println("Your triangle is possible to make!");
        } else {
            System.err.println("It's not possible to make the triangle!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAandB = 0;
        int maxBandC = 0;
        int max = 0;
        
        // Is it possible to make a triangle given the 3 user inputs
        System.out.print("Input number to make a triangle (a): ");
        int a = scanner.nextInt();
        System.out.print("Input number to make a triangle (b): ");
        int b = scanner.nextInt();
        System.out.print("Input number to make a triangle (c): ");
        int c = scanner.nextInt();

        // Find highest value
        maxAandB = Math.max(a, b);
        maxBandC = Math.max(b, c);
        max = Math.max(maxAandB, maxBandC);

        // Check if it's possible to make a triangle
        if (max == a) {
            triangle(b, c, a);
        } else if (max == b) {
            triangle(a, c, b);
        } else {
            triangle(a, b, c);
        }
    }
}
