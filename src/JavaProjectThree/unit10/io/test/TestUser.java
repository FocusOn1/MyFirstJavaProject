package JavaProjectThree.unit10.io.test;
import JavaProjectThree.unit10.io.dao.IUserDao;
import JavaProjectThree.unit10.io.dao.UserDaoImpl;
import JavaProjectThree.unit10.io.domain.User;
//import org.junit.Test;
import java.text.ParseException;
import java.util.*;


public class TestUser {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        //创建一个空的集合对象
        ArrayList<User> userList = new ArrayList<User>();
        Collection<User> userCollection = new ArrayList<>();
        List<User> list = new ArrayList<>();
        Set<User> userSet = new HashSet<>();
        //用循环来控制输入学生
        do {
            IUserDao userDao = new UserDaoImpl();
            User user = userDao.addUser();
            userList.add(user);
            userCollection.add(user);
            userSet.add(user);
            System.out.print("是否继续输入学生信息？（Y/N）");
        } while (!"N".equalsIgnoreCase(sc.nextLine()));


        //for循环遍历集合元素

        System.out.println("-----------------------");
        //增强for循环遍历集合元素
        for (User user:userList) {
            System.out.println(user);
        }
        System.out.println("-----------------------");
        //用迭代器遍历集合元素
        Iterator<User> it = userSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
