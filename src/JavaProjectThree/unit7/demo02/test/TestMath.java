package JavaProjectThree.unit7.demo02.test;
import JavaProjectThree.unit7.demo02.util.VerCode;
import org.junit.Test;
import java.util.Random;
import java.util.Scanner;
/*
测试数学类
 */
public class TestMath {
    @Test
    public void test1(){
        //
    }

    @Test
    public void test2(){
        //调用静态方法：直接用类名.方法名（）
        System.out.println(Math.ceil((3.46)));
        System.out.println(Math.floor(3.46));
        System.out.println(Math.random());//大于0小于1
        System.out.println(((int)Math.random()*100));//强制转换->[0,99]
    }

    @Test
    public void  testRandom(){
        //实例化对象
        Random rdm = new Random();//ctrl+alt+v
        System.out.println(rdm.nextInt());
        System.out.println(rdm.nextInt(100));//[0,99]

        //随机生成大写字母A-Z：它对应Ascii码是65-90
        int upper = 65 + rdm.nextInt(26);
        System.out.println(upper);//随机数值
        char upperC = (char) (65 + rdm.nextInt(26));//强制转换
        System.out.println("随机生成大写字母A-Z："+upperC);//随机大写字母A-Z

        //随机生成小写字母a-z:它对应的Ascii码是97-122
        char dow = (char) (97+rdm.nextInt(26));
        System.out.println("随机生成小写字母a-z:"+dow);//随机小写字母a-z

        //随机生成数字0-9：它对应的Ascii码是48-57
        char digit = (char) (48+rdm.nextInt(10));//随机生成数字0-9
        System.out.println("随机生成数字0-9:"+digit);
        String digit1 = String.valueOf(rdm.nextInt(10));//随机生成数字0-9//第二种方法
    }

    @Test
    public void testVerCode(){
        System.out.println(VerCode.getVerCodeFour());
    }

    @Test
    // //输入与生成进行验证匹配
    public void testTof() {
        String code = VerCode.getVerCodeFour();
        System.out.println("生成随机数="+code);
        Scanner sc = new Scanner(System.in);
        String scCode = sc.nextLine();
        if (code.equalsIgnoreCase(scCode)){
            System.out.println("正确");
        }else{
            System.out.println("错误");
        }
    }

}
