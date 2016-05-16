package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Company.displayLetters("Hello");
        //static int countLetter(String string, char letter)
        long curTime1 = System.currentTimeMillis();

        System.out.println(Company.removeLetter("fgffgfgfgfgfgfgfgfgjtytylfdfdlfoslfdlldskldsjleurnwiuenfiejnfw", 'l'));
        long curTime2 = System.currentTimeMillis();
        System.out.println(Company.removeLetterConcat("fgffgfgfgfgfgfgfgfgjtytylfdfdlfoslfdlldskldsjleurnwiuenfiejnfw", 'l'));
        long curTime3 = System.currentTimeMillis();

        System.out.println(curTime2-curTime1);
        System.out.println(curTime3-curTime2);
    }
}
