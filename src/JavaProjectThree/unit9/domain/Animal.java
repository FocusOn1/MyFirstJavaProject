package JavaProjectThree.unit9.domain;

/**
 *  定义抽象动物类（Animal)：
 * 变量：姓名、年龄；构造方法：无参、全参；
 * 成员方法：get/set方法，吃饭（）
 */

public abstract class Animal {
    //
    private String name;
    private Integer age;
    //
    public Animal() {
    }
    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    //
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    //抽象的方法
    // 吃饭（）
    public  abstract  void  eat();

    public abstract void jumpping();
}
