package JavaProjectThree.unit9.domain;

/**定义具体狗类（Dog），继承动物类，实现跳高接口
 成员变量：体重;
 构造方法：无参、全参；
 成员方法：重写吃饭(){…}，重写跳高(){…}
 */

public class Dog extends Animal implements Ijumpping{
    private Integer weight;
    public Dog() {
    }
    public Dog(String name, Integer age, Integer weight) {
        super(name, age);
        this.weight = weight;
    }
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }
    @Override
    public void jumpping(){
        System.out.println("狗跳高");
    }
}
