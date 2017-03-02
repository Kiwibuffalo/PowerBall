import java.awt.Dimension;
import java.awt.Toolkit;


public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		Frame.initMenu(width/4, height/6, 1000, 700);
		
		

	}

}
