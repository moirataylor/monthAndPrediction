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
        String day;


        System.out.println("What month were you born?(numerical value)");
        m = keyboard.nextInt();
        System.out.println("What day were you born?");
        q = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();

        int k = year%100;
        int j = year/100;
        int h;
        h = (q+(13*(m+1))/5+k+(k/4)+(j/4)+5*j)%7;
        dayOfTheWeek(h);

        switch(m){
            case 3:
                System.out.println("31 days in March");
                break;
            case 4:
                System.out.println("30 days in April");
                break;
            case 5:
                System.out.println("31 days in May");
                break;
            case 6:
                System.out.println("31 days in June");
                break;
            case 7:
                System.out.println("30 days in July");
                break;
            case 8:
                System.out.println("31 days in August");
                break;
            case 9:
                System.out.println("30 days in September");
                break;
            case 10:
                System.out.println("31 days in October");
                break;
            case 11:
                System.out.println("30 days in November");
                break;
            case 12:
                System.out.println("31 days in December");
                break;
            case 13:
            case 1:
                System.out.println("31 days in January");
        }


        }
        public static String dayOfTheWeek(int h){
            String day;
        switch(h) {
                case 1:
                    day = "Sunday";
                    break;
                case 2:
                    day = "Monday";
                    break;
                case 3:
                    day ="Tuesday";
                    break;
                case 4:
                    day ="Wednesday";
                    break;
                case 5:
                    day = "Thursday";
                    break;
                case 6:
                    day = "Friday";
                    break;
                default:
                    day ="Saturday";
            }
            System.out.println("you were born on a " + day);
            return day;
        }




    }

