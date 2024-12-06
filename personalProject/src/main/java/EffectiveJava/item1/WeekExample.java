package EffectiveJava.item1;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week week = null;

        Calendar cal = Calendar.getInstance();

        int num = cal.get(Calendar.DAY_OF_WEEK);

        switch (num){
            case 1 -> week = Week.SUNDAY;
            case 2 -> week = Week.MONDAY;
            case 3 -> week = Week.TUESDAY;
            case 4 -> week = Week.WEDNESDAY;
            case 5 -> week = Week.THURSDAY;
            case 6 -> week = Week.FRIDAY;
            case 7 -> week = Week.SATURDAY;
        }

        if(num == 6){
            System.out.println("청약 당첨");
        } else {
            System.out.println("안돼");
        }


    }

}
