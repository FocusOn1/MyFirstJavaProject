package JavaProjectThree.unit9.nnine.test;

import JavaProjectThree.unit9.nnine.dao.IUserDao;
import JavaProjectThree.unit9.nnine.dao.UserDaoImpl;
import JavaProjectThree.unit9.nnine.domain.User;

import java.util.ArrayList;
import java.util.Scanner;


public class TestUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接口多态
        IUserDao userDao = new UserDaoImpl();
        //定义一个用户集合
        ArrayList<User> users = new ArrayList<User>();
        do{
            User user = userDao.addUser();
            users.add(user);
            System.out.println("是否继续输入学生信息？（Y/N）");
        }while(!"N".equalsIgnoreCase(sc.nextLine()));
        //遍历集合
        System.out.println(users.size());
        for (int i = 0; i < users.size(); i++) {
            System.out.println("第"+(i+1)+"用户信息：");
            System.out.println(users.get(i));
        }
        //System.out.println(userList);
        //[User{用户名='c', 密码='z', 生日=Thu Mar 08 00:00:00 CST 2001}]
        //定义一个密码集合
        ArrayList<User> pwses = new ArrayList<User>();
        do {
            //?
            System.out.println("是否修改密码？（Y/N）");
            int password = sc.nextInt();
        }while(!"N".equalsIgnoreCase(sc.nextLine()));
        System.out.println("修改密码成功！");
        for (int i = 0; i < users.size() ; i++) {
            System.out.println("第"+(i+1)+"用户信息：");
            System.out.println(users.get(i));
        }
    }


}