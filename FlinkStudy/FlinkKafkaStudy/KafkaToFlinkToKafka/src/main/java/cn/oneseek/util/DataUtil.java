package cn.oneseek.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataUtil {
    public static boolean isValidDate(String str) {
        boolean result = true;
        //判断字符串长度是否为8位
        if(str.length() == 8){
            // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
            //SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            try {
                // 设置lenient为false.
                // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
                format.setLenient(false);
                format.parse(str);
            } catch (ParseException e) {
                // e.printStackTrace();
                // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
                result = false;
            }
        }else{
            result = false;
        }

        return result;
    }
}
