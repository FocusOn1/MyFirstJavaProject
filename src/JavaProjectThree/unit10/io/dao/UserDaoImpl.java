package JavaProjectThree.unit10.io.dao;

import JavaProjectThree.unit10.io.domain.User;
import JavaProjectThree.unit10.io.util.DateUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * 用户操作类---实现接口
 */
public class UserDaoImpl implements IUserDao {

    /**
     * 注册功能(添加一个新的用户：用键盘录入)
     * @return  当前新用户对象
     */
    @Override
    public User addUser() throws ParseException {
        Scanner sc=new Scanner(System.in);
        //实例化一个新的对象
        User user =new User();
        System.out.print("请输入用户名：");
        user.setUserName(sc.nextLine());
        System.out.print("请输入密码：");
        user.setPassword(sc.nextLine());
        System.out.print("请输入出生日期：");
        Date date = DateUtils.stringToDate(sc.nextLine(), "yyyy-MM-dd");
        user.setBirthday(date);
        return user;
    }

    @Override
    public boolean loginUser(String username, String psw) {
        return false;
    }

    @Override
    public boolean loginUser(User user) {
        return false;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
