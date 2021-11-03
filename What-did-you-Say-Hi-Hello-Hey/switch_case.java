package com.company.mycaptain;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int choice;
        System.out.println("Pick Choice: 1. Hi\t2. Hello\t3. Hey");
        System.out.print("Enter Choice:");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice)
        {
            case 1 :
                System.out.println("You said Hi");
                break;
            case 2 :
                System.out.println("You said Hello");
                break;
            case 3 :
                System.out.println("You said Hey");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
