package JavaProjectThree.unit5.cpuTest.test;
import JavaProjectThree.unit5.cpuTest.domain.CPU;
import JavaProjectThree.unit5.cpuTest.domain.HardDisk;
import JavaProjectThree.unit5.cpuTest.domain.PC;
/*书P124页第5题（2）小题：
用类描述计算机中CPU的速度和硬盘的容量。
【需求】：
(1) 定义一个包domain,在该包中定义三个类：PC、CPU、HardDisk；
          CPU类：一个属性(int类型speed)，并对该属性进行封装。
          HardDisk类：一个属性（int 类型 amount），并对该属性进行封装。
          PC类：两个属性（CPU类的cpu， HardDisk类的hd）, 并对属性进行封装。
(2) 定义一个包test,在该包中定义一个Test类。对Test类的要求参考P124页。
*/
public class TestPC {
    public static void main(String[] args) {
        //实例化一台PC
        CPU cpu = new CPU(2200);
        HardDisk hd = new HardDisk(600);
        PC pc = new PC(cpu,hd);
       System.out.println(pc);

    }
}
