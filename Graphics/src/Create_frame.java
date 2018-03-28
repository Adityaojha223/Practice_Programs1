import java.awt.*;
public class Create_frame {

	public static void main(String[] args) 
	{
		Frame f1 = new Frame();
		f1.setSize(200,300);
		f1.setLocation(300,400);
		f1.setVisible(true);
		f1.setTitle("My frame");
		f1.setBackground(Color.red);
		f1.setResizable(true);
	}

}
