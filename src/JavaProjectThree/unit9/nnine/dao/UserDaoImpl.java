package JavaProjectThree.unit9.nnine.dao;

import JavaProjectThree.unit9.nnine.domain.User;
import JavaProjectThree.unit9.nnine.util.DateUtils;

import java.util.Date;
import java.util.Scanner;

public class UserDaoImpl implements IUserDao {

    @Override
    public User addUser() {
        //模拟键盘输入一个用户（注册功能）
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("请输入用户名：");
        /*String s = sc.nextLine();
        user.setUserName(s);*/
        user.setUserName(sc.nextLine());
        System.out.println("请输入密码：");
        user.setPsw(sc.nextLine());
        System.out.println("请输入生日：");
        Date date = DateUtils.stringToDate(sc.nextLine(),"yyyy-MM-dd");
        user.setBirthday(date);
        return user;
    }

    @Override
    public boolean loginUser(User loginUser) {
        System.out.println("请输入您的用户名与密码：");
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的新密码：");
        user.setPsw(sc.nextLine());
        return false;
    }
}
