package JavaProjectThree.unit2_3.Demo01;
import java.util.Scanner;
class Text2_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        */
        int[] club = new int[5];    //  动态初始化数组club
        int sum = 0;    //定义求和变量

        for ( int i = 0; i < 5; i++ )
        {
        club[i] = sc.nextInt ();
        }


//        int[] arr = new int[]{1, 2, 3};
        /*
        for (int x : arr) {
            System.out.println(x);//逐个输出数组元素的值-->遍历数组

        }
    }
}
        ---------------------------------------------------
        for (int i = 1; i <= club.length; i++) {
            if (a % 2 == 0) {
                System.out.println(a + "是偶数");
                sum += a;
            }
        }

*/
        System.out.println("club.length是" + club.length);
        System.out.println("-----------------------------------");
        for (int i = 0; i < club.length; i++) {
            System.out.println(club[i]);
            if (club[i] % 2 == 0) {
                System.out.println(club[i] + "是偶数");
                sum += club[i];
                System.out.println("sum是" + sum);
            }
        }
    }
}
