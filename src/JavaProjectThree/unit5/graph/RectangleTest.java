package JavaProjectThree.unit5.graph;

public class RectangleTest {
    public static void main(String[] args) {
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
        System.out.println("RectangleTest1.area"+RectangleText1.area());
        System.out.println("RectangleTest1.perimeter()="+RectangleText1.perimeter());
    }
}
