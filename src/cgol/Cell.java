package cgol;

import java.awt.*;

public class Cell {
	
	public static final int SIZE = 10;
	private int x;
	private int y;

	private boolean nextRound;
	private boolean isAlive;

	public Cell(int x, int y, boolean alive) {
		this.x = x;
		this.y = y;
		this.isAlive = alive;
	}

	public void setNextRound(boolean nextRound) {
		this.nextRound = nextRound;
	}

	public void update() {
		isAlive = nextRound;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void draw(Graphics g) {
		if(isAlive) g.fillRect(x * SIZE, y * SIZE, SIZE, SIZE);
	}
}
