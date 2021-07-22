package JavaProjectThree.unit5.graph;
/*1.  编写矩形类和圆类。
【需求】：定义一个矩形Rectangle类和圆Circle类，定义一个图形测试(TestGrade)类，
        在图形测试类中通过对象完成成员变量和成员方法的使用。
【分析】：
矩形类的属性：长length，宽width；  行为：面积area，周长Perimeter；
圆形类的属性：半径radius；         行为：面积，周长；
*/
public class TestGrade {
    public static void main(String[] args) {
        //RectangleTest
        double length;
        double width;
        //创建一个无参的RectangleTest对象
        Rectangle RectangleText1 = new Rectangle();
        //全参
        //     Rectangle RectangleTest2 = new Rectangle(22,6);
/*
        //测试输出
        System.out.println("全参");
        RectangleTest2.area(11,5);
        RectangleTest2.perimeter(22,6);
 */
        //传参
        RectangleText1.setLength(8);
        RectangleText1.setWidth(22);
        //不用再写参数，因为上边已经获取到参数，直接调用方法即可
        System.out.println("矩形面积RectangleTest1.area="+RectangleText1.area());
        System.out.println("矩形周长RectangleTest1.perimeter()="+RectangleText1.perimeter());
        System.out.println("===========================================");
       //CircleTest
        double radius;
        //创建一个无参的CircleTest1对象
        Circle CircleTest1 = new Circle();
        //传参
        CircleTest1.setRadius(5);
        System.out.println("圆的面积为CircleTest1.area()="+CircleTest1.area());
        System.out.println("圆的周长为CircleTest1.perimeter()="+CircleTest1.perimeter());
    }

}

