package JavaProjectThree.unit6.management;
/*
分析学生类和教师类，找到老师类和学生类当中的共性内容，抽取出一个父类，
用继承的方式编写一个父类(Person),
两个子类:学生类（Student）和教师类（Teacher）；
 */
public class Student extends Person{
    //
    private String classname;
    //
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    //
    public String study(){
        System.out.println(introduce1()+introduce2()+"现在，我在"+getClassname()+"学习。");
        return "==============";

    }
    //
    public Student(){

    }
    public Student(String id,int age,String name,String college,String major,String classname){
        super(id,name,college,major);
        this.getAge();
        this.classname=classname;
    }

    //
    @Override
    public String toString() {
        return "Student{" +
                "classname='" + classname + '\'' +
                '}';
    }
}
