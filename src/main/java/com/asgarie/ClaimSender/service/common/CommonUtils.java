package com.asgarie.ClaimSender.service.common;

public class CommonUtils {

    public static Integer handleNull(String val) {
        return val == null ? null : Integer.parseInt(val);
    }

}
