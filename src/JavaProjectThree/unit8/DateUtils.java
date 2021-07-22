package JavaProjectThree.unit8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具类
 * 1.构造方法私有化
 * 2.成员方法静态化
 */
public class DateUtils {
    private DateUtils(){}
    /**
     * 把日期转换为指定格式的字符串
     * @param date 日期
     * @param format 指定的格式
     * @return 日期字符串
     */
    public static String dataToString(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);//实例化
        String s = sdf.format(date);
        return s;
    }

    /**
     *
     * @param strDate 日期
     * @param format 指定的格式
     * @return 解析后的日期
     * @throws ParseException 把错误扔给方法
     */
    public static Date stringToDate(String strDate,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(strDate);
        return date;
    }
}
