package JavaProjectThree.unit7.demo02.util;
import java.util.Random;
/**
 * -----------------------
 * 生成随机数的工具类
 * 1.构造方法私有化
 * 2.成员方法静态化
 */
public class VerCode {
    //1
    private VerCode() {
    }

    //2
    public static String getVerCodeFour() {
        String code = "";
        Random rdm = new Random();
        //4位随机数
        for (int i = 0; i < 4; i++) {
            //随机选择
            int choice = rdm.nextInt(3);//0,1,2
            switch (choice) {
                case 0:
                    code += (char) (65 + rdm.nextInt(26));//强制转换
                    break;
                case 1:
                    code += (char) (97 + rdm.nextInt(26));
                    break;
                case 2:
                    code += (char) (48 + rdm.nextInt(10));//随机生成数字0-9
                    break;
            }
        }
        return code;
    }
}

