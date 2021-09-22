package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of marks in the paper");
        int total = input.nextInt();
        System.out.println("Enter the mark that the student got");
        int mark = input.nextInt();
        float percentage = (float) mark / total * 100;
        if(mark < 0 || mark > total) {
            System.out.println("Invalid mark");
        } else if(percentage < 40) {
            System.out.println("Grade U");
        } else if(percentage < 50) {
            System.out.println("Grade E");
        } else if(percentage < 60) {
            System.out.println("Grade D");
        } else if(percentage < 70) {
            System.out.println("Grade C");
        } else if(percentage < 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade A");
        }
    }
}
