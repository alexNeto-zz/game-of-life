package cgol;

import java.awt.Graphics;
import java.awt.Color;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	static int size = 10;
	public Cell(int x, int y){
		this.x = x;
		this.y = y;
	}
	public boolean inAlive(){
		return alive;
	}
	public void setAlive(boolean alive){
		this.alive = alive;
	}
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(x * size, y * size, size, size);
		if(alive) g.setColor(Color.BLACK);
		else g.setColor(Color.WHITE);
		g.fillRect(x * size, y * size, size - 1, size - 1);
	}
}
