package JavaProjectThree.unit3;
//课本P59的（3）
public class Test1_1 {
    public static void main(String[] args) {
            System.out.println("（3）");
            int m = 123;
            int sum = 0, t = 100;
            while (t > 0) {
                sum = sum + m % 10 * t;
                m = m / 10;
                t = t / 10;
            }
              //System.out.println(" %d", sum);
        System.out.printf(" %d", sum);
        System.out.println("=====================");
    }
}

