package JavaProjectThree.unit10.io.test;


import org.junit.Test;

import java.io.*;

//测试IO流
public class TestFile {

    @Test
    public void testFileOutputStream() throws IOException {
        //创建一个字节输出流对象
        FileOutputStream fos =
                new FileOutputStream(new File("user.txt"),true);//true是追加的功能

    //写数据
    String str = "Happy Children's Day\r\n儿童节快乐";
    byte[] bys = str.getBytes();
    fos.write(bys);
//D:\Download\JAVA\
    //释放资源
    fos.close();

    }
    @Test
    public void testFileInputStream() throws IOException {
        //创建一个字节输入对象
        FileInputStream fis =
                new FileInputStream(new File("user.txt"));
       /* //写数据
        String str = "123";
        byte[] bys = str.getBytes();

        */
        //读一个字节数据
        System.out.println((char)fis.read());
        //读一个字节数组数据
        byte[] bys = new byte[10];
        int len = fis.read(bys);
        //System.out.println(fis.read(bys));//输出的是长度
        while ((len = fis.read(bys)) != -1){
            String s = new String(bys, 0, len);//把字节数组封装成字符串
            System.out.println(s);
        }
    }

    @Test
    //字节缓冲输出流
    public void testBOS() throws IOException {
        //创建一个字节缓冲输出流对象
        BufferedOutputStream bos =
                new BufferedOutputStream
                        (new FileOutputStream("bos.txt"));


        //写数据
        String str = "Happy Children's Day\r\n儿童节快乐";
        byte[] bys = str.getBytes();
        bos.write(bys);

        //释放资源
        bos.close();
    }

    //写：字符输出流
    @Test
    public void testOSW() throws IOException {
        //创建字符输出流
        OutputStreamWriter osw =
                new OutputStreamWriter(new FileOutputStream("osw.txt"));
        //写数据
        osw.write("中人");
        //释放资源
        osw.close();
    }

    //读：字符输入流
    @Test
    public void testTSR() throws IOException {
        //创建字符输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
        //读一个字符数据:read
        System.out.println((char) isr.read());
        System.out.println((char)isr.read());
        System.out.println(isr.read());

        //读一个字符数组的数据
        char[] chs = new char[1024];
        int len = isr.read(chs);
        while ((len = isr.read(chs)) != -1){
            String s = new String(chs, 0, len);
            System.out.println(s);
        }

        //释放资源
        isr.close();


    }




}
