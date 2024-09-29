import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{
	
	JButton but_y,but_n;
	JLabel jlb_pic;
	
	GUI()
	{
		
		this.setSize(400, 400);
		this.setLocation(400, 200);
		this.setLayout(new FlowLayout());
		but_y = new JButton("喜欢");
		but_n = new JButton("不喜欢");	
		
		
		
		jlb_pic = new JLabel(new ImageIcon("./dudu.jpg"));		
		
		
		
		this.add(jlb_pic);
		this.add(but_y);
		this.add(but_n);	
		myEvent();
		this.setVisible(true);
	}
	
	private void myEvent()
	{
		but_n.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e)
			{
				int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
				int y = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
				
				int locX = (int)(Math.random()*(x-400));
				int locY = (int)(Math.random()*(y-500));
				setLocation(locX, locY);
			}
		});
		
		but_y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				

				System.exit(0);
			}
		});
	}

	public static void main(String[] args)
	{
		new GUI();
	}
}
