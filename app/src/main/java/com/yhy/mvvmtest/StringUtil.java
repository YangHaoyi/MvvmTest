package com.yhy.mvvmtest;

/**
 * 作者 : YangHaoyi on 2016/7/25.
 * 邮箱 ：yanghaoyi@neusoft.com
 */
public class StringUtil {

    public static String cancelNull(String string) {
        if (string == null || "null".equals(string)) {
            return "";
        } else {
            return string;
        }
    }
}
