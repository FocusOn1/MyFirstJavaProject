package JavaProjectThree.unit5.cpuTest.domain;
/*书P124页第5题（2）小题：
用类描述计算机中CPU的速度和硬盘的容量。
【需求】：
(1) 定义一个包domain,在该包中定义三个类：PC、CPU、HardDisk；
          CPU类：一个属性(int类型speed)，并对该属性进行封装。
          HardDisk类：一个属性（int 类型 amount），并对该属性进行封装。
          PC类：两个属性（CPU类的cpu， HardDisk类的hd）, 并对属性进行封装。
(2) 定义一个包test,在该包中定义一个Test类。对Test类的要求参考P124页。
*/
public class PC {
    //成员变量
    private CPU cpu;
    private HardDisk hd;
    //成员方法
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public CPU getCpu() {
        return cpu;
    }
    public void setHD(HardDisk hd) {
        this.hd = hd;
    }
    public HardDisk getHD() {
        return hd;
    }

    //
    public PC(){

    }
    public PC(CPU cpu,HardDisk hd){
        this.cpu=cpu;
        this.hd=hd;
    }


    //

    @Override
    public String toString() {
        return "PC{" +
                "cpu=" + cpu +
                ", hd=" + hd +
                '}';
    }
}
