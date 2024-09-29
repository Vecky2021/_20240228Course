
import javax.swing.*; //导入带有窗口类的包
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame win = new JFrame("我的窗口");
        JButton jbtn = new JButton("按钮");
        JTextField jtf = new JTextField();


        win.setSize(300,200);
        win.setLocation(300,200);
        win.setLayout(null);
        jbtn.setSize(80,20);
        jbtn.setLocation(140,60);
        jtf.setSize(200,30);
        jtf.setLocation(10,10);

        win.add(jbtn);
        win.add(jtf);
        win.setVisible(true);


        //对按钮添加事件监听器
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("....");
            }
        });

        //对窗口添加鼠标监听器
        win.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("按下了鼠标");
            }
        });

        //对文本框添加键盘监听器
        jtf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e)
            {
                System.out.println("输入了"+e.getKeyChar());
            }
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
//                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==10)
                {
                    System.out.println("按下了回车键");
                }
            }
        });
    }
    }
