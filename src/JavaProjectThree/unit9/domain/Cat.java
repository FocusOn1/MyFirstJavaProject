package JavaProjectThree.unit9.domain;

/**
 *  定义具体猫类（Cat），继承动物类，实现跳高接口
 *  成员变量：可爱度;  构造方法：无参、全参；
 * 成员方法：重写吃饭(){…}，重写跳高(){…}
 */

public class Cat extends Animal implements Ijumpping{
    private Integer lovely;
    public Cat(Integer lovely) {
        this.lovely = lovely;
    }
    public Cat() {
    }
    public Cat(String name, Integer age, Integer lovely) {
        super(name, age);
        this.lovely = lovely;
    }
    //
    public Integer getLovely() {
        return lovely;
    }
    public void setLovely(Integer lovely) {
        this.lovely = lovely;
    }
    //
    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }
    @Override
    public void jumpping() {
        System.out.println("给猫训练跳高");
    }
}
