package za.ac.cput.util;

import org.apache.commons.lang3.StringUtils;

public class Helper {
    public static boolean isEmptyOrNull(String str) {
        return StringUtils.isEmpty(str);
    }
    public static void CheckStringParm(String ParamName, String paramValue) {
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for Param: %s", ParamName));
    }
}
