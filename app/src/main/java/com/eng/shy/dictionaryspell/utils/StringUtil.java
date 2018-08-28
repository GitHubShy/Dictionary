package com.eng.shy.dictionaryspell.utils;


import java.util.Locale;

/**
 * Created by Scofield on 2018/6/6.
 */

public class StringUtil {

    /**
     * 字符串是否位空
     **/
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 拼接字符串（多个字符串拼接不要直接用“+”，避免产生大量对象）
     **/
    public static String joinStr(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj);
        }
        return sb.toString();
    }

    public static String formatDouble(double price) {
        return String.format(Locale.CHINA, "%1$.2f", price);
    }

    public static String formatDouble(String price) {
        return formatDouble(toDouble(price));
    }

    public static double toDouble(String str) {
        if (isEmpty(str)) {
            return 0;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception e) {
        }
        return 0;
    }


    public static int parseInt(String str) {
        if (isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static long parseLong(String str) {
        if (isEmpty(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
