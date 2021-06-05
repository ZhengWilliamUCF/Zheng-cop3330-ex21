/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        myApp.switchStatement();
    }

    public void switchStatement(){
        int monthNum;
        String monthName;

        System.out.print("Please enter the number of the month: ");
        monthNum = in.nextInt();

        monthName = switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month Number!";
        };
        if (monthNum >=1 && monthNum<=12) {
            System.out.println("The name of the month is " + monthName + ".");
        }
        else System.out.println(monthName);
    }
}
