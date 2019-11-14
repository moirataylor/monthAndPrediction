package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //todo need full birthday from user (only in number)
        //todo use Zeller's congruence to figure out the day they were born
        //todo need to include poem & find which line user's input is
        //todo put whole code in loop
        //todo use d.r.y programming fool
        //todo  h=(q+⌊(m+1)2610⌋+K+⌊K4⌋+5−J)mod
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int q;
        int m;
        int year;


        System.out.println("What month were you born?(numerical value)");
        m = keyboard.nextInt();
        System.out.println("What day were you born?");
        q = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();

        int k = year % 100;
        int j = year / 100;
        int h;
        h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        dayOfTheWeek(h);
        daysOfMonth(m, year);
        System.out.println("There is a poem that goes like this");
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
    }



    public static String dayOfTheWeek(int h) {
        String day;
        switch (h) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            default:
                day = "Saturday";
        }
        System.out.println("you were born on a " + day);
        return day;
    }

    public static String daysOfMonth(int m, int year) {
        switch (m) {
            case 3:
                System.out.println("There are 31 days in March");
                break;
            case 4:
                System.out.println("There are 30 days in April");
                break;
            case 5:
                System.out.println("There are 31 days in May");
                break;
            case 6:
                System.out.println("There are 31 days in June");
                break;
            case 7:
                System.out.println("There are 30 days in July");
                break;
            case 8:
                System.out.println("There are 31 days in August");
                break;
            case 9:
                System.out.println("There are 30 days in September");
                break;
            case 10:
                System.out.println("There are 31 days in October");
                break;
            case 11:
                System.out.println("There are 30 days in November");
                break;
            case 12:
                System.out.println("There are 31 days in December");
                break;
            case 13:
            case 1:
                System.out.println("There are 31 days in January");
                break;
            case 14:
            case 2:
                if (year % 4 == 0) {
                    if (!(year % 100 == 0)) {
                    }
                    System.out.println("There are 29 days in February");
                } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                    System.out.println("There are 29 days in February");
                } else {
                    System.out.println("There are 28 days in February");
                }
        }
        return "month";
    }
}

