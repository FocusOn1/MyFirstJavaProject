package JavaProjectThree.unit5.graph;

public class CircleTest {
    public static void main(String[] args) {
        double radius;

        Circle CircleTest1 = new Circle();

        CircleTest1.setRadius(5);
        System.out.println("圆的面积为："+CircleTest1.area());
    }
}
