package JavaProjectThree.unit7.demo01.dao;

/**
 * 用户操作类：增删查改
 */
public class UserDao {

    /**
     * 用户惭怍类：增删查改
     * @param userName
     * @param password
     * @return  为真表示查询查询成功，为假则失败
     */
    public boolean loginUser(String userName,String password){
        //定义一个已知的用户名与密码
        String uName = "admin";
        String psw = "123";
        //判断：
        if(uName.equals(userName) && psw.equals(password)){
            return true;
        }
        return false;
    }
}
