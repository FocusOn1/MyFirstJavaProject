package JavaProjectThree.unit7.demo01.test;
import JavaProjectThree.unit7.demo01.dao.UserDao;
import java.util.Scanner;
/**
 * 用户测试类
 */
public class TestUser {
    public static void main(String[] args) {
        //模拟用户输入Scanner
        Scanner sc = new Scanner(System.in);
        //实例化dao对象,调用方法
        UserDao userDao = new UserDao();

        int length = 3;
        for (int i = 0; i < length ; i++) {
            //循环三次，用for
            //登录成功，用break结束循环
            //登录失败，提示次数

            System.out.print("please input userName:");
            String userName = sc.next();
            System.out.print("please input password:");
            String password = sc.next();

            if(userDao.loginUser(userName,password)){
                System.out.println("login success");
                break;
            }else{
                /**
                 *      i       1   2   3
                 * 剩余次数     2   1   0
                 */
                if(i==2){
                    System.out.println("login error!你的账号已被锁定!");
                }else{
                    System.out.println("login error!你还剩余次数:"+(2-i));
                }
            }

        }
    }
}
