package JavaProjectThree.unit9.domain1;
/**
 * 猫类Cat，继承Animal类
 *  成员属性：可爱度lovely
 * 构造方法：无参、全参；
 * 成员方法：抓老鼠（）
 *           重写吃饭（）{…}
 */
public class Cat extends Animal{
    //成员变量
    private Integer lovely;
    //构造方法
    public Cat() {
    }
    public Cat(String name, Integer age, Integer lovely) {
        super(name, age);
        this.lovely = lovely;
    }

    public int getLovely() {
        return lovely;
    }
    public void setLovely(int lovely) {
        this.lovely = lovely;
    }
    //成员方法
    public void catchMice(){
        System.out.println("猫抓老鼠");
    }
    //父类的方法满足不了子类的需求，子类【重写】父类的方法
    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }
}
