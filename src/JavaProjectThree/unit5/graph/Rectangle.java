package JavaProjectThree.unit5.graph;
/*1.  编写矩形类和圆类。
【需求】：定义一个矩形Rectangle类和圆Circle类，定义一个图形测试(TestGrade)类，
        在图形测试类中通过对象完成成员变量和成员方法的使用。
【分析】：
矩形类的属性：长length，宽width；  行为：面积area，周长Perimeter；
圆形类的属性：半径radius；         行为：面积，周长；
*/
public class Rectangle {
    //成员变量
    double length;
    double width;

    //为属性设置读get写set(封装)
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length < 0){
            System.out.println("错啦！长只有正数！");
        }else{
        this.length = length;
        }
    }

    public void setWidth(double width) {
        if(length < 0) {
            System.out.println("错啦！宽只有正数！");
        }else {
            this.width = width;
        }
    }
    public double getWidth() {
        return width;
    }

  /*  //无参构造方法
    public Rectangle(){}
    //有参构造方法
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   */

    //成员方法
    //计算面积
    public double area(){
        return length*width;
    }
    //计算周长
    public double perimeter(){
        return (length+width)*2;
    }
}
