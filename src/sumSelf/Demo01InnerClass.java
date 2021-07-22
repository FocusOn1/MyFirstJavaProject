package sumSelf;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();//外部类的对象
        //通过外部类的对象，调用外部类的方法，里面间接在使用内部类methonHeart
        body.methonBody();
        body.getName();
    }
}
