import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public static int POWER = 100;

	public void tick() {
		
		POWER = Game.clamp(POWER, 0, 100);
		
	}

	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 25);
		g.setColor(Color.orange);
		g.fillRect(15, 15, POWER * 2, 25);
		g.setColor(Color.gray);
		g.drawRect(15, 15, 200, 25);
	}
	
}
