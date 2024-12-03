package EffectiveJava.item1;

import java.util.Calendar;
import java.util.Date;

public class CustomDate {
    private Date date;

    // [1] private 생성자
    private CustomDate(Date date){
        this.date = date;
    }

    // [2] 정적 팩토리 메서드: 현재 날짜
    public static CustomDate now(){
        return new CustomDate(new Date());
    }

    // [3] 정적 팩토리 메서드: 특정 날짜
    public static CustomDate of(int year, int month, int day){

        // [3-1] Calendar의 정적 메서드 3가지(getInstance, set, getTime)
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        return new CustomDate(calendar.getTime());
    }

    // [4] 정적 팩토리 메서드: 날짜 문자열로부터 생성
    public static CustomDate fromString(String dateString){
        String[] parts = dateString.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int date = Integer.parseInt(parts[2]);

        return of(year, month, date);
    }

    @Override
    public String toString(){
        return date.toString();
    }

    public static void main(String[] args){
        CustomDate today = CustomDate.now();
        // [5] 결과값1
        System.out.println(today);

        CustomDate specificDate = CustomDate.of(2024, 12, 3);
        // [6] 결과값2
        System.out.println(specificDate);

        CustomDate parsedDate = CustomDate.fromString("2024-12-24");
        // [7] 결과값3
        System.out.println(parsedDate);
    }

}

