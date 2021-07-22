package JavaProjectThree.unit6.management;
/*
分析学生类和教师类，找到老师类和学生类当中的共性内容，抽取出一个父类，
用继承的方式编写一个父类(Person),
两个子类:学生类（Student）和教师类（Teacher）；
 */
public class Person {
    //
    private String id;
    private int age;
    private String name;
    private String college;
    private String major;
    //
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    //
    public int introduce2(){
        System.out.println("今年我"+getAge()+"岁啦！");
        return 0;
    }
    public String introduce1(){
        System.out.println("大家好！我叫做"+getName()+",来自"+getCollege()+"学院"+getMajor()+"专业,"+"ID是"+getId()+",");
        return "";
    }
    //
    public Person(){

    }
    public Person(int age){
        this.age=age;
    }
    public Person(String id,String name,String college,String major){
        this.id=id;
        this.name=name;
        this.college=college;
        this.major=major;
    }

    //
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

}
