package com.asgarie.ClaimSender.service.common;

public class CommonUtils {

    public static Integer handleNull(String val) {
        return val == null ? null : Integer.parseInt(val);
    }
    public static Double handleDoubleNull(String val) {
        return val == null ? null : Double.parseDouble(val);
    }
    public static Float handleFloatNull(String val) {
        return val == null ? null : Float.parseFloat(val);
    }
}
