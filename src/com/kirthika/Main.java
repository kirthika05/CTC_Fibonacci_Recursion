package com.kirthika;

import java.util.*;

public class Main {

    public static int fibonacci(int n) {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return n;
        }
    }


    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));

    }
}
