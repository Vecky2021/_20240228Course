import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorDemo extends JFrame{
    ColorDemo()
    {
        this.setSize(800,400);
        this.setLocation(340,200);
        this.setLayout(new GridLayout(1, 10, 5, 5));
        JLabel[] jlb = new JLabel[10];
        int[] rgbValue = new int[3];
        int i;
        for(i=0;i<3;i++)
        {
            rgbValue[i] = (int)(255*Math.random());
        }

        Color lb_cl = new Color(rgbValue[0],rgbValue[1],rgbValue[2]);

        for(i=0;i<10;i++)
        {
            jlb[i] = new JLabel();
            jlb[i].setOpaque(true);
            jlb[i].setBackground(lb_cl);

        }

        int diff_jlb_num = (int)(Math.random()*10);
        System.out.println(diff_jlb_num+1);
        int diff_color = (int)(Math.random()*3);
        if(rgbValue[diff_color]>=20)
        {
            rgbValue[diff_color] -= 20;
        }else{
            rgbValue[diff_color] += 20;
        }


        lb_cl = new Color(rgbValue[0],rgbValue[1],rgbValue[2]);

        jlb[diff_jlb_num].setBackground(lb_cl);

        for(i=0;i<10;i++)
        {
            this.add(jlb[i])	;
        }

        jlb[diff_jlb_num].addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)
            {
                JOptionPane.showMessageDialog(ColorDemo.this, "恭喜！！！", "正确", 0);
                ColorDemo.this.setVisible(false);
                new ColorDemo();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ColorDemo();
    }
}