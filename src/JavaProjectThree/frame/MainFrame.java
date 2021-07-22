package JavaProjectThree.frame;

import JavaProjectThree.unit9.nnine.domain.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    public static void main(String[] args) {
        //顶层容器--窗口
        JFrame jFrame = new JFrame();
        jFrame.setTitle("登录");
        jFrame.setSize(400,200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        //中间容器:面板的默认布局是流式布局
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        //基本组件：命名规则：组件简写+用途
        JLabel lblUserName=new JLabel("用户名：");
        lblUserName.setBounds(40,20,80,30);
        JTextField txtUserName = new JTextField();
        txtUserName.setBounds(101,20,150,30);
        JLabel lblpwd = new JLabel("密码：");
        lblpwd.setBounds(50,52,50,30);
        JPasswordField txtPwd = new JPasswordField();
        txtPwd.setBounds(101,52,150,30);

        JButton btnLogin = new JButton("登录");
        JButton btnCancel = new JButton("取消");
        btnLogin.setBounds(55,85,60,30);
        btnCancel.setBounds(155,85,70,30);

        //为按钮添加点击事件
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //登录功能
                //1.获取用户登录对象
                User loginUser = new User();
                loginUser.setUserName(txtUserName.getText());
                loginUser.setPsw(new String (txtPwd.getPassword()));
                //2.从文件中读取集合对象

                //3.用循环的方式判断用户是否存在
            }
        });
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //取消功能
                txtUserName.setText("");
                txtPwd.setText("");
            }
        });

        //添加组件到面板
        jPanel.add(lblUserName);
        jPanel.add(txtUserName);
        jPanel.add(lblpwd);
        jPanel.add(txtPwd);
        jPanel.add(btnLogin);
        jPanel.add(btnCancel);

        //面板添加到窗体
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
