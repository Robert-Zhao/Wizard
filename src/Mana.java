import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Mana extends GameObject{
	
	private BufferedImage mana_image;

	public Mana(int x, int y, ID id, SpriteSheet ss) {
		super(x, y, id, ss);
		
		mana_image = ss.grabImage(6, 2, 32, 32);
	}

	public void tick() {
		  
	}

	
	public void render(Graphics g) {
		g.drawImage(mana_image, x, y, null);
	}

	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

}
