package JavaProjectThree.unit6.management;
 /*
分析学生类和教师类，找到老师类和学生类当中的共性内容，抽取出一个父类，
用继承的方式编写一个父类(Person),
两个子类:学生类（Student）和教师类（Teacher）；
----> 定义测试类，分别实例化两个子类对象，并调用方法。
  */
public class testManagement {
     public static void main(String[] args) {
         //
         Student student = new Student();
         Teacher teacher = new Teacher();
         //
          student.setName("小红");
          student.setAge(18);
          student.setId("xxxxxxxxxx110");
          student.setMajor("软件工程");
          student.setCollege("xx大学");
          student.setClassname("软工xx班");
          //------------------------------------
          teacher.setName("大红");
          teacher.setAge(25);
          teacher.setId("0x666");
          teacher.setMajor("软件工程");
          teacher.setCollege("xx大学");
          teacher.setDepartment("信息技术与工程学院001教研办公室");
          //
         System.out.println(student.study());
         System.out.println(teacher.teach());

     }
}
