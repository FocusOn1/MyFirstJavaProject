package JavaProjectThree.unit6.graph;

/*根据上一节的实验，分析矩形类和长方体类的共性，提取共性生成一个父类。
【分析】：
矩形类的属性：长length，宽width；
行为：面积area()，周长Perimeter()；
长方体类的属性：长length，宽width，高 height；
行为：面积area()，周长Perimeter(),体积volume（）；
*/
public class Rectangle {
    //
    private double length;
    private double width;

    //
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    //
    public double area(){
        return length*width;
    }
    public double Perimeter(){
        return (length+width)*2;
    }

    //
    public Rectangle(){

    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }


    //


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
