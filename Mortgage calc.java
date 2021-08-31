package com.kamesh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        Scanner scanner=new Scanner(System.in);
        System.out.print("principal");
        int principal=scanner.nextInt();
        System.out.print("Annual Interest Rate");
        float annualInterest = Scanner.nextFloat();
        float monthlyInterest=annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Period(Years):");
        byte years = scanner.nextByte();
        int numberofPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal
                *(monthlyInterest * Math.pow(1+monthlyInterest)
                /(Math.pow(1 + monthlyInterest,numberofPayments)));
        String mortgageFormatted = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage:"+ mortgageFormatted);

    }
}
