import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
	
	Handler handler;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
	}

	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 38);
		y = Game.clamp(y, 0, Game.HEIGHT - 61);
		
		collision();
	}
	
	private void collision(){
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Powerup){
				
				
			}
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.blue);
		if(id == ID.Player) g.setColor(Color.white);
		//g.fillRect(x, y, 32, 32);
		g.fillOval(x, y, 32, 32);
		
	}

}
