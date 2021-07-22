package JavaProjectThree.unit4;
// 书P120页的第3题(3)小题；
public class Test1 {
    public static void main(String[] args) {
        Tom.y = 100;
        Tom cat = new Tom();
        cat.x = 100;
        cat.y = 200;
        Tom.x = 300;//Error:(10, 12) java: 无法从静态上下文中引用非静态 变量 x
        cat.showXY();
        Tom.showY();
    }
}
class Tom {
    static int x;//<-(10, 12)错误的解决方法:加个前缀static
    static int y;
    void showXY() {
      //  System.out.println("%d,%d\n", x, y);
        System.out.println("%d,%d\n"+x+y);//解决方案：添加符号+
    }
    static void showY() {
        System.out.println(y);//Error(23,19)的解决方法：去掉"%d\n",
    }
}
