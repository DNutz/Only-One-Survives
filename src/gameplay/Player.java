package gameplay;

import java.awt.Rectangle;
import java.awt.Graphics;


public class Player extends Rectangle{
	
	public static int PLAYER_WIDTH = GameFrame.WIDTH/50;
	public static int PLAYER_HEIGHT = GameFrame.HEIGHT/50;
	public static int PLAYER_SPEED = 2;
	
	private int dx = 0;
	private int dy = 0;
	
	
	public Player(int x, int y, int width, int height){
		setBounds(x,y,width,height);
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	
	public void tick(){
		if (this.x > 0 && this.x < GameFrame.WIDTH-PLAYER_WIDTH) {
			this.x += dx;
		}
		//prevents player from going off of screen to the left
		else if(this.x <= 0){
			if(this.dx > 0){
				this.x += dx;
			}
		}
		//prevents player from going off of screen to the right
		else if(this.x >= GameFrame.WIDTH-PLAYER_WIDTH){
			if (this.dx < 0) {
				this.x += dx;
			}
		}
		
		if (this.y > 0 && this.y < GameFrame.WIDTH-PLAYER_HEIGHT) {
			this.y += dy;
		}
		//prevents player from going off of screen to the top
		else if(this.y <= 0){
			if(this.dy > 0){
					this.y += dy;
			}
		}
		//prevents player from going off of screen to the bottom
		else if(this.y >= GameFrame.WIDTH-PLAYER_HEIGHT) {
			if (this.dy < 0) {
				this.y += dy;
			}
		}
	}
	
	
	public void draw(Graphics g){
		g.fillRect(this.x, this.y, this.width, this.height);
	}
	
	public void incrementDx(){
		this.dx += PLAYER_SPEED;
	}
	
	public void decrementDx(){
		this.dx -= PLAYER_SPEED;
	}
	
	public void incrementDy(){
		this.dy += PLAYER_SPEED;
	}
	
	public void decrementDy(){
		this.dy -= PLAYER_SPEED;
	}

}
