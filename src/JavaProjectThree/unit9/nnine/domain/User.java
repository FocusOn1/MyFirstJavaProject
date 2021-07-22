package JavaProjectThree.unit9.nnine.domain;

import java.util.Date;

/**
 * 用户类：用户名，密码，生日
 */
public class User extends JavaProjectThree.unit10.io.domain.User {
    private String userName;
    private String psw;
    private Date birthday;

    //无参构造方法
    public User(){}
    // 全参构造方法
    public User(String userName, String psw, Date birthday) {
        this.userName = userName;
        this.psw = psw;
        this.birthday = birthday;
    }

    //为属性构造读和写的功能
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPsw() {
        return psw;
    }
    public void setPsw(String psw) {
        this.psw = psw;
    }
    public Date getBirthday(Date date) {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    //把对象转换为字符串-用toString方法
    @Override
    public String toString() {
        return "User{" +
                "用户名='" + userName + '\'' +
                ", 密码='" + psw + '\'' +
                ", 生日=" + birthday +
                '}';
    }


}