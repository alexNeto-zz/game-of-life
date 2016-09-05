package cgol;

/*
 *CELL
 */

import java.awt.Graphics;
import java.awt.Color;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	private boolean nextround;
	static boolean grid = true;
	static int size = 10;
	public Cell(int x, int y){
		this.x = x;
		this.y = y;
	}
	public boolean isAlive(){
		return alive;
	}
	public void setAlive(boolean alive){
		this.alive = alive;
	}
	public void setNextRound(boolean nextround){
		this.nextround = nextround;
	}
	public void nextround(){
		alive = nextround;
	}
	public void draw(Graphics g){
		if(grid){
			g.setColor(Color.BLACK);
			g.drawRect(x * size, y * size, size, size);
			if(alive) g.setColor(Color.BLACK);
			else g.setColor(Color.WHITE);
			g.fillRect(x * size +1, y * size + 1, size - 1, size - 1);
		}
		else{
			if(alive) g.setColor(Color.BLACK);
			else g.setColor(Color.WHITE);
			g.fillRect(x * size, y * size, size, size);
		}
	}
}
