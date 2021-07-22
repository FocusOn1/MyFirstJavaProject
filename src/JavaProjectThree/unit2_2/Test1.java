package JavaProjectThree.unit2_2;
import java.util.Scanner;
//小明分数奖励
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入小明的成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 95 && score <= 100) {
            System.out.println("小明将获得奖励：【自行车*1】");
        }else if (score >= 90 && score <= 94){
            System.out.println("小明将获得奖励：【游乐园游玩机会*1】");
        }else if (score >= 89 && score <= 80){
            System.out.println("小明将获得奖励：【高达*1】");
        }else{
            System.out.println("小明将获得奖励：【来自爸爸的促学教育一顿*1】");
        }
    }

}
