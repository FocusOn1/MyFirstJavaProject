package JavaProjectThree.unit9.domain1;
/**
 * 父类
 * 成员变量：姓名name，年龄age
 * 构造方法：无参、全参
 * 成员方法：get/set方法、
 *抽象方法：吃饭（）
 */
public abstract class Animal {
    //
    private String name;
    private Integer age;//自动装箱拆箱
    //
    public Animal() {
    }
    public Animal(String name,Integer age) {
        this.name=name;
        this.age=age;
    }
    //
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * //成员方法
     *     public void eat(){
     *         System.out.println("吃");
     *     }
     */

    //[抽象]成员方法-没有方法体
    void eat(){

    }
}
