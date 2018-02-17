import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {
    static String timeConversion(String s) {
        int hour, minute, seconds;
        String ampm;

        hour = Integer.parseInt(s.substring(0, 2));

        minute = Integer.parseInt(s.substring(3, 5));

        seconds = Integer.parseInt(s.substring(6, 8));

        ampm = s.substring(8, 10);

        if(ampm.equals("PM") && hour < 12) hour += 12;
        if(ampm.equals("AM") && hour == 12) hour = 0;

        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

