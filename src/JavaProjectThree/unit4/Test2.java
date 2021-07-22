package JavaProjectThree.unit4;
//书P120页的第4题(2)小题；
public class Test2 {
    public static void main(String[] args) {
        B b = new B();
        b.setX(-100);
        b.setY(88);
        System.out.println("%d:%d:%d"+b.x+b.y+b.getXYSum());//将,全部替换为+
    }
}
class B {
    int x = 100,y = 200;
    public void setX(int x){
        x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getXYSum(){
        return x + y;
    }
}