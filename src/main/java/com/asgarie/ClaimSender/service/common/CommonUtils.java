package com.asgarie.ClaimSender.service.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonUtils {

    private static final DateConverter dateConverter = new DateConverter();

    public static Integer handleNull(String val) {
        return val == null ? null : Integer.parseInt(val);
    }

    public static Double handleDoubleNull(String val) {
        return val == null ? null : Double.parseDouble(val);
    }

    public static Float handleFloatNull(String val) {
        return val == null ? null : Float.parseFloat(val);
    }

    public static String gregorianToJalali(int year, int month, int day) {
        dateConverter.gregorianToPersian(year, month, day);
        return year + "/" + month + "/" + day;
    }

    public static String jalaliToGregorian(int year, int month, int day) {
        dateConverter.persianToGregorian(year, month, day);
        return year + "/" + month + "/" + day;
    }

    public static String gregorianToJalali(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_YEAR);
        dateConverter.gregorianToPersian(year, month, day);
        return year + "/" + month + "/" + day;
    }

    public static String handleFloat(float number) {
        String str = String.valueOf(number);
        if (str.charAt(str.lastIndexOf(".") + 1) == '0') {
            return String.valueOf(((int) number));
        }
        return str;
    }
    public static String handleString(String  code) {
        if (code.charAt(code.lastIndexOf(".") + 1) == '0') {
            return String.valueOf((int) Float.parseFloat(code));
        }
        return code;
    }
}
