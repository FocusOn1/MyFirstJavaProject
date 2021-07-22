package JavaProjectThree.unit6.graph;

/*根据上一节的实验，分析矩形类和长方体类的共性，提取共性生成一个父类。
【分析】：
矩形类的属性：长length，宽width；
行为：面积area()，周长Perimeter()；
长方体类的属性：长length，宽width，高 height；
行为：面积area()，周长Perimeter(),体积volume（）；
*/
public class TestGraph {
    public static void main(String[] args) {
        //实例化父类对象Rectangle和子类对象Cuboid
        Rectangle rectangle = new Rectangle(20,50);
        Cuboid cuboid = new Cuboid(500,62,40);

        //
        System.out.println("rectangle="+rectangle);
        System.out.println("cuboid="+cuboid);
        rectangle.area();
        rectangle.Perimeter();
        cuboid.area();
        cuboid.Perimeter();
        cuboid.volume();
        System.out.println("rectangle.area()="+rectangle.area());
        System.out.println("rectangle.Perimeter()="+rectangle.Perimeter());
        System.out.println("cuboid.area()="+cuboid.area());
        System.out.println("cuboid.volume()="+cuboid.volume());
    }
}
