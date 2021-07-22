package JavaProjectThree.unit5.graph;
/*1.  编写矩形类和圆类。
【需求】：定义一个矩形Rectangle类和圆Circle类，定义一个图形测试(TestGrade)类，
        在图形测试类中通过对象完成成员变量和成员方法的使用。
【分析】：
矩形类的属性：长length，宽width；  行为：面积area，周长Perimeter；
圆形类的属性：半径radius；         行为：面积，周长；
*/
public class Circle {
    //成员变量
    double radius;
    //为属性封装
    public void setRadius(double radius){
        if(radius < 0){
            System.out.println("错啦！长度只有正数！");
        }else{
            this.radius=radius;
        }
    }
    public double getRadius(){
        return radius;
    }
    //成员方法
    public double area(){
        return radius*radius*Math.PI;
    }
    public double perimeter(){
        return radius*2*Math.PI;
    }
}
