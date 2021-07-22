package JavaProjectThree.unit10.io.test;
import JavaProjectThree.unit10.io.dao.IUserDao;
import JavaProjectThree.unit10.io.dao.UserDaoImpl;
import JavaProjectThree.unit10.io.domain.User;
import java.text.ParseException;
import java.util.*;


public class TestMap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        //定义一个Map集合
        Map<String, User> userMap = new HashMap<>();
        int i = 0;
        do {
            IUserDao userDao = new UserDaoImpl();
            User user = userDao.addUser();
            userMap.put("00"+(++i), user);
            System.out.print("是否继续输入学生信息？（Y/N）");
        } while (!"N".equalsIgnoreCase(sc.nextLine()));
        //输出Map集合对象
        System.out.println(userMap.get("001"));
        //根据关键字取元素
        System.out.println("----根据关键字取元素----");
        Set<String> keySet = userMap.keySet();
        for (String s: keySet) {
            System.out.println(userMap.get(s));
        }
        //直接获取值的集合
        System.out.println("-----直接获取值的集合-----");
        Collection<User> users = userMap.values();
        for (User user: users) {
            System.out.println(user);
        }

        //键值对对象
        System.out.println("-----键值对对象-----");
        Set<Map.Entry<String, User>> entries = userMap.entrySet();
        for (Map.Entry<String, User>  entry :  entries) {
            System.out.println(entry.getKey());//取键
            System.out.println(entry.getValue());//取值
        }
    }
}
