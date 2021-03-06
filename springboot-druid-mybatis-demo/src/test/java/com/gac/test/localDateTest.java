package com.gac.test;

import com.gac.utils.LocalDateUtils;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class localDateTest {

    @Test
    public void timeByFormat() {
        String s = "yyyy-MM-dd HH:mm:ss";
        String s1 = LocalDateUtils.timeByFormat(s);
        System.err.println(s1);
    }

    @Test
    public void dateToLocalDateTime() {
        LocalDateTime localDateTime = LocalDateUtils.dateToLocalDateTime(new Date());
        System.err.println(localDateTime);
    }

    @Test
    public void dateToLocalTime() {
        LocalTime localTime = LocalDateUtils.dateToLocalTime(new Date());
        System.err.println(localTime);
    }

    @Test
    public void localDateToDate() {
        Date date = LocalDateUtils.localDateToDate(LocalDate.now());
        System.err.println(date);
    }

    @Test
    public void localDateTimeToDate() {
        Date date = LocalDateUtils.localDateTimeToDate(LocalDate.now().atTime(5, 56, 01));
        System.err.println(date);
    }

    @Test
    public void stringToDate() {
        Date date = LocalDateUtils.stringToDate("2018-05-10 12:30:12", "yyyy-MM-dd HH:mm:ss");
        System.err.println(date);
    }

    @Test
    public void timeFormat() {
        List<String> list = new ArrayList<>();
        list.add("hehe");
        list.add("hehe1");
        list.add("hehe2");
        list.add("hehe3");

        List<String> list1 = new ArrayList<>();
        list1.add("hehe");
        list1.add("hehe1");
        list1.add("hehe2");
        list1.add("hehe322");

        list1.removeAll(list);

        list1.forEach(System.err::println);
    }
}
