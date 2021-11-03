package com.company;
import java.util.Scanner;

public class Literals {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Subject 1");
        int subject1 = sc.nextInt();
        System.out.println("Enter out of marks for Subject 1");
        int total1 = sc.nextInt();
        System.out.println("Enter marks for Subject 2");
        int subject2 = sc.nextInt();
        System.out.println("Enter out of marks for Subject 2");
        int total2 = sc.nextInt();
        System.out.println("Enter marks for Subject 3");
        int subject3 = sc.nextInt();
        System.out.println("Enter out of marks for Subject 3");
        int total3 = sc.nextInt();
        System.out.println("Enter marks for Subject 4");
        int subject4 = sc.nextInt();
        System.out.println("Enter out of marks for Subject 4");
        int total4 = sc.nextInt();
        System.out.println("Enter marks for Subject 5");
        int subject5 = sc.nextInt();
        System.out.println("Enter out of marks for Subject 5");
        int total5 = sc.nextInt();
        float marksAchieved = subject1 + subject2 + subject3 + subject4 + subject5;
        int totalMarks = total1 + total2 + total3 + total4 + total5;
        float medium = marksAchieved / totalMarks;
        float percentage = medium * 100;
        System.out.print(percentage);
        System.out.println("%");
    }
}
