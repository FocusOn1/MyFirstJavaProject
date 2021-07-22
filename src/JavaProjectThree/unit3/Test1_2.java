package JavaProjectThree.unit3;
////课本P59的（4）
public class Test1_2 {
    public static void main(String[] args) {
            System.out.println("（4）");
                int m = 0;
                char ch = 'A';
                switch(ch){
                    case 9:
                    case 'a' : m = m+1;;
                        break;
                    case 'A' : m = m + 1;
                    case 66 : m = m + 1;
                    default : m = m + 3;
                }
                System.out.println(m);
    }
}
