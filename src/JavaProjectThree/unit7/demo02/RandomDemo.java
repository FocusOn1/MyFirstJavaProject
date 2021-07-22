package JavaProjectThree.unit7.demo02;
import java.util.Random;

/*
【需求】：随机生成四位数字和字母的组合
 */
public class RandomDemo {

    /**
     *
     */
    private Random random;
    //定义一个生成4位随机数的方法getRandom（）
    public int getRandom(){
        for (int n = 0; n < 4; n++) {
            System.out.print(random.nextInt(9));
        }
        return 0;
    }

    //重载定义一个生成n位随机数的方法getRandom(int number)
    public int getRandom(int number){
        for (int n = 0; n >= 0; n++) {
            System.out.print(random.nextInt(n));
        }
        return 0;
    }
}
