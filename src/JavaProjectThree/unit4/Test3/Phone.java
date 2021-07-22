package JavaProjectThree.unit4.Test3;
/*3.  编写手机类。
需求：定义一个手机类，定义一个手机测试类，在手机测试类中通过对象完成成员变量和成员方法的使用
分析：
属性：品牌，价格...
行为：打电话，发短信...
 */
public class Phone {
    //成员变量
    String brand;
    String name;
    double price;
    //成员方法
    public void call(){
        System.out.println("用"+price+"元的"+brand+"牌手机"+"给"+name+"打电话");
    }
    public void send(){
        System.out.println("用"+price+"元的"+brand+"牌手机"+"给"+name+"发短信");
    }

}
