package JavaProjectThree.unit8.testDate;

import JavaProjectThree.unit8.DateUtils;
import org.junit.Test;
import java.text.ParseException;
import java.util.Date;
/**
 * 测试类
 */
public class TestDate {
    @Test
    public void test1(){
        Date date = new Date();
        System.out.println(date);
        String s = DateUtils.dataToString(date,"yyyy-MM-dd HH:mm:ss");
        System.out.println(s);
    }
    @Test
    public void test2() throws ParseException {
        String strDate = "2021-04-27 16:58:22";
        Date date = DateUtils.stringToDate(strDate,"yyyy-MM-dd HH:MM:SS");
        System.out.println(date);
    }
}
