package cgol;
<<<<<<< HEAD
/*
 *CELL
 */

=======
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275

import java.awt.Graphics;
import java.awt.Color;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
<<<<<<< HEAD
	private boolean nextround;
=======
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
	static int size = 10;
	public Cell(int x, int y){
		this.x = x;
		this.y = y;
	}
<<<<<<< HEAD
	public boolean isAlive(){
=======
	public boolean inAlive(){
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
		return alive;
	}
	public void setAlive(boolean alive){
		this.alive = alive;
	}
<<<<<<< HEAD
	public void setNextRound(boolean alive){
		this.alive = alive;
	}
	public void nextround(){
		alive = nextround;
	}
=======
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(x * size, y * size, size, size);
		if(alive) g.setColor(Color.BLACK);
		else g.setColor(Color.WHITE);
		g.fillRect(x * size +1, y * size + 1, size - 1, size - 1);
	}
}
