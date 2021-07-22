package JavaProjectThree.unit9.domain;

import org.junit.Test;
/**
 * 定义测试类（TestAnimal）：
 * 编写单元测试分别来实例化猫和狗来测试功能
 */

public class TestAnimal {
    @Test
    public void test1(){
        //实例化一个猫的对象
        Cat cat = new Cat("大橘",2,10000);
        cat.eat();//猫吃老鼠
        cat.jumpping();//给猫训练跳高
        //抽象多态
        Animal animal = new Cat("a,",10,22);
        animal.eat();//猫吃老鼠
        // animal.jumpping();
        //接口多态
        Ijumpping ijumpping = new Cat("。。",15,21);
        ijumpping.jumpping();//给猫训练跳高
    }
}
