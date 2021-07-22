package JavaProjectThree.unit6.management;

public class Teacher extends Person{
    //
    private String department;
    //
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    //
    public String  teach(){
        System.out.println(introduce1()+introduce2()+","+"我的办公室在"+getDepartment()+"。");
        return "===============";
    }
    //
    public Teacher(){

    }
    public  Teacher(String id,int age,String name,String college,String major,String department){
        super(id,name,college,major);
        this.getAge();
        this.department=department;
    }

    //
    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                '}';
    }


}
