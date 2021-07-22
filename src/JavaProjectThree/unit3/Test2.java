package JavaProjectThree.unit3;
//求1!+2!+3!+...+n!
public class Test2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int p = 1;
        for(i = 1;i <= 20;i++){
           p *= i;
           sum = sum + p;
        }

        System.out.println(sum);
    }
}
