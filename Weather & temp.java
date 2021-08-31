package com.kamesh;

public class Main {
    public static void main(String[] args) {
        int temp=35;
        if(temp>30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if(temp>20 && temp<=30) {
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day");
        }
    }
}
