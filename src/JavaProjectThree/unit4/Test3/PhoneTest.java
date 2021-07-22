package JavaProjectThree.unit4.Test3;
/*3.  编写手机类。
需求：定义一个手机类，定义一个手机测试类，在手机测试类中通过对象完成成员变量和成员方法的使用
分析：
属性：品牌，价格...
行为：打电话，发短信...
 */
public class PhoneTest {
    public static void main(String[] args) {
        //new一个对象->对象实例化
        Phone phone = new Phone();
        //成员变量
        String brand;
        String name;
        double price;
        //赋值
        phone.brand= "米九";
        phone.name="XXX";
        phone.price=5987;
        //调用
        phone.call();
        phone.send();
    }
}
