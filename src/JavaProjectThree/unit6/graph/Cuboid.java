package JavaProjectThree.unit6.graph;
/*根据上一节的实验，分析矩形类和长方体类的共性，提取共性生成一个父类。
【分析】：
矩形类的属性：长length，宽width；
行为：面积area()，周长Perimeter()；
长方体类的属性：长length，宽width，高 height；
行为：面积area()，周长Perimeter(),体积volume（）；
*/
public class Cuboid extends Rectangle{
    //
    private double height;

    //
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    //
    public double Perimeter(){
        return ((getLength()+getWidth())+(getLength()+height)+(getWidth()+height))*2;
    }
    public double area(){
        return (getLength()+getWidth()+height)*2;
    }
    public double volume(){
        return getLength()*getWidth()*height;
    }

    //
    public Cuboid(){

    }
    public Cuboid(double length,double width,double height){
        super(length, width);
        this.height=height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                '}';
    }
}
