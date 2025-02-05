package dev.sumantakumar.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumberFormat {
    public static void main(String[] args) throws ParseException {
        //Converting Value from normal number to compact number in short
        NumberFormat shortNumberFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        System.out.println("1000 -> " + shortNumberFormat.format(1000));
        System.out.println("10000 -> " + shortNumberFormat.format(10000));
        System.out.println("100000 -> " + shortNumberFormat.format(100000));
        System.out.println("1000000 -> " + shortNumberFormat.format(1000000));
        System.out.println("10000000 -> " + shortNumberFormat.format(10000000));
        System.out.println("1000000000 -> " + shortNumberFormat.format(1000000000));



        //Converting Value from normal number to compact number in long
        NumberFormat longNumberFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        System.out.println("1K -> " + longNumberFormat.format(1000));
        System.out.println("10K -> " + longNumberFormat.format(10000));
        System.out.println("100K -> " + longNumberFormat.format(100000));
        System.out.println("1000000 -> " + longNumberFormat.format(1000000));
        System.out.println("10000000 -> " + longNumberFormat.format(10000000));
        System.out.println("100000000 -> " + longNumberFormat.format(100000000));


        System.out.println("===================");
        //Converting Value from compact number short to normal number
        System.out.println("1K -> " + shortNumberFormat.parse("1K"));
        System.out.println("10K -> " + shortNumberFormat.parse("10K"));
        System.out.println("100K -> " + shortNumberFormat.parse("100K"));
        System.out.println("1M -> " + shortNumberFormat.parse("1M"));
        System.out.println("10M -> " + shortNumberFormat.parse("10M"));
        System.out.println("1B -> " + shortNumberFormat.parse("1B"));

        //Converting Value from compact number long to normal number
        System.out.println("1 thousand -> " + longNumberFormat.parse("1 thousand"));
        System.out.println("10 thousand  -> " + longNumberFormat.parse("10 thousand"));
        System.out.println("100 thousand  -> " + longNumberFormat.parse("100 thousand"));
        System.out.println("1 million -> " + longNumberFormat.parse("1 million"));
        System.out.println("10 million -> " + longNumberFormat.parse("10 million"));
        System.out.println("1 billion -> " + longNumberFormat.parse("1 billion"));
    }
}
