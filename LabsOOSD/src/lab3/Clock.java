package lab3;

import java.util.Calendar;

public class Clock {
    
    public static void main (String args[]) {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
    }

    int count = 0;
   

}
