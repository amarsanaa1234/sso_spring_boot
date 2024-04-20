package com.alibou.security.tools;

import java.util.List;

public class Tools {
    public static boolean isNullOrEmptyList(List<?> listAny) {
        return listAny == null || listAny.isEmpty();
    }

    public static boolean isNullOrEmpty(Object value) {
        return value == null || convertToStringLower(value) == "" || convertToStringLower(value).equals("null");
    }

    public static String convertToStringLower(Object value) {
        return convertToString(value).toLowerCase();
    }

    public static String convertToString(Object value) {
        return value == null ? "" : value.toString();
    }
    public static boolean compareValue(Object value_first, Object value_second) {
        return convertToStringLower(value_first).equals(convertToStringLower(value_second));
    }

    public static boolean compareValueNoSpace(Object value_first, Object value_second) {
        return convertToStringLower(value_first).trim().equals(convertToStringLower(value_second).trim());
    }

    public static boolean compareNumber(Long value_first, Long value_second) {
        return convertToLong(value_first).equals(convertToLong(value_second));
    }

    public static Long convertToLong(Object value) {
        return Tools.isNullOrEmpty(value) ? 0L : Long.parseLong(convertToStringNoSpace(value));
    }

    public static String convertToStringNoSpace(Object value) {
        return value == null ? "" : value.toString().replace(" ", "");
    }
}
