package com.kamesh;

public class Main {

    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n = 5651;
        temp = n;
        {
            while(n >= 0) ;
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        if (temp == sum) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
