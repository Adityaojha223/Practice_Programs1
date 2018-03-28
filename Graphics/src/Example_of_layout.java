import java.awt.*;
public class Example_of_layout extends Frame 
{
	void GUI()
	{
		//setLayout(new BorderLayout());
		//setLayout(new FlowLayout());
		//setLayout(new GridLayout(3,2));
		setLayout(null);
		
		Button b1 = new Button ("submit1");
		Button b2 = new Button ("submit2");
		Button b3 = new Button ("submit3");
		Button b4 = new Button ("submit4");
		Button b5 = new Button ("submit5");
		
		add(b1 , BorderLayout.NORTH);
		add(b2 , BorderLayout.SOUTH);
		add(b3 , BorderLayout.EAST);
		add(b4 , BorderLayout.WEST);
		add(b5 , BorderLayout.CENTER);
		
		b1.setBounds(30,40,100,30);
		b2.setBounds(140,40,100,30);
		b3.setBounds(140,80,100,30);
		b4.setBounds(250,80,100,30);
		b5.setBounds(250,120,100,30);
		
		setSize(300,300);
		setVisible(true);
	}
		
		public static void main (String args[])
		{
			new Example_of_layout().GUI();
		}
}

