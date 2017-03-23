import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Powerup extends GameObject{
	
	Random r = new Random();

	public Powerup(int x, int y, ID id) {
		super(x, y, id);
	}

	
	public void tick() {
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, 16, 16);
		
	}
}
