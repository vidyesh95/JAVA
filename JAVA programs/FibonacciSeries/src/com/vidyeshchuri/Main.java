package com.vidyeshchuri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Fibonacci Series
        int a=0,b=1,c,i,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want ?");
        n = scan.nextInt();
        if (n == 0 || n < 0) {
            System.out.print("You dont want fibonacci series");
        } else if (n == 1) {
            System.out.print("Fibonacci series for "+n+" is : "+a + ". ");
        } else if (n == 2) {
            System.out.print("Fibonacci series for "+n+" is : "+a + ", " + b + ". ");
        } else {
            System.out.print("Fibonacci series for "+n+" is : "+a + ", " + b);
            for (i = 2; i < n; ++i) {
                c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
            System.out.print(". ");
        }
    }
}
