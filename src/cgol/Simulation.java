package cgol;

import java.awt.*;
import java.util.Random;

public class Simulation {
	private Cell[] [] cells;
	private int width;
	private int height;

	public Simulation() {
		width = Frame.WIDTH/Cell.SIZE;
		height = Frame.HEIGHT/Cell.SIZE;
		cells = new Cell[width][height];

		Random random = new Random();
		for(int x = 0;x < width;x++) {
			for (int y = 0; y < height; y++) {
				cells[x] [y] = new Cell(x, y, random.nextBoolean());
			}
		}
	}

	public void update() {
		for(int x = 0;x < width;x++) {
			for (int y = 0; y < height; y++) {
				int mx = x - 1;
				if(mx < 0) mx = width - 1;
				int my = y - 1;
				if(my < 0) my = height - 1;
				int gx = (x + 1) % width;
				int gy = (y + 1) % height;

				int neighborCounter = 0;
				if(cells[mx] [my].isAlive()) neighborCounter++;
				if(cells[mx] [y].isAlive()) neighborCounter++;
				if(cells[mx] [gy].isAlive()) neighborCounter++;
				if(cells[x] [my].isAlive()) neighborCounter++;
				if(cells[x] [gy].isAlive()) neighborCounter++;
				if(cells[gx] [my].isAlive()) neighborCounter++;
				if(cells[gx] [y].isAlive()) neighborCounter++;
				if(cells[gx] [gy].isAlive()) neighborCounter++;

				if(neighborCounter < 2 || neighborCounter > 3) cells[x] [y].setNextRound(false);
				else if(neighborCounter == 2) cells[x] [y].setNextRound(cells[x] [y].isAlive());
				else cells[x] [y].setNextRound(true);
			}
		}

		for(int x = 0;x < width;x++) {
			for (int y = 0; y < height; y++) {
				cells[x] [y].update();
			}
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		for(int x = 0;x < width;x++) {
			for (int y = 0; y < height; y++) {
				cells[x] [y].draw(g);
			}
		}
	}
}
