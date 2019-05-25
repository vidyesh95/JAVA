package com.vidyeshchuri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Armstrong Number

        int c = 0, a, b, temp;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = scan.nextInt();
        b=n;
        temp=n;
        while (n > 0) {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if (temp == c) {
            System.out.println(b+" is Armstrong Number");
        } else {
            System.out.println(b+" is Not Armstrong Number");
        }

    }
}
