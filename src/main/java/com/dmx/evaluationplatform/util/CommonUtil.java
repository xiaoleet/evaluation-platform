package com.dmx.evaluationplatform.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommonUtil {
    public static Object getBlankParam(Object... params) {
        for (Object param : params) {
            if (param == null || (param instanceof String && ((String) param).trim().isEmpty())) {
                return param == null ? "null" : param.toString();
            } else if (param instanceof Collection && ((Collection<?>) param).isEmpty()) {
                return "Collection parameter is empty";
            }
        }
        return null;
    }
}
