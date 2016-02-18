/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.control;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author rafa
 */
public class randomDate {

    public static Date getRandomDate(int yearIni, int yearEnd) {

        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(yearIni, yearEnd);

        gc.set(GregorianCalendar.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(GregorianCalendar.DAY_OF_YEAR));

        gc.set(GregorianCalendar.DAY_OF_YEAR, dayOfYear);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, gc.get(GregorianCalendar.YEAR));
        calendar.set(Calendar.MONTH, gc.get(GregorianCalendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, gc.get(GregorianCalendar.DAY_OF_MONTH));
        return calendar.getTime();

    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
