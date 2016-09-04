package cgol;
<<<<<<< HEAD
/*
 * SIMULATOR
 */

=======
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275

import java.awt.Graphics;
import java.util.Random;

public class Simulation {
	private Cell[][] cells;
	private Random random;
	private int width = Main.width/Cell.size;
	private int height = Main.height/Cell.size;
	public Simulation(){
		random = new Random();
<<<<<<< HEAD
=======
		
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
		cells = new Cell[width][height];
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				cells[x][y] = new Cell(x, y);
				cells[x][y].setAlive(random.nextBoolean());
			}
		}
	}
<<<<<<< HEAD
	public void update(){
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				int mx = x - 1;
				if(mx < 0) mx = width - 1;
				int my = y - 1;
				if(my < 0) my = height - 1;
				int gx = (x + 1) % width;
				int gy = (y + 1) % height;
				int alivecounter = 0;
				if(cells[mx][my].isAlive()) alivecounter++;
				if(cells[mx][y].isAlive()) alivecounter++;
				if(cells[mx][gy].isAlive()) alivecounter++;
				if(cells[x][my].isAlive()) alivecounter++;
				if(cells[x][gy].isAlive()) alivecounter++;
				if(cells[gx][my].isAlive()) alivecounter++;
				if(cells[gx][y].isAlive()) alivecounter++;
				if(cells[gx][gy].isAlive()) alivecounter++;
				if(alivecounter < 2 || alivecounter > 3) cells[x][y].setNextRound(false);
				else if(alivecounter == 3) cells[x][y].setNextRound(true);
			}
	
		}
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				cells[x][y].nextround();
			}
		}
		
	}
=======
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
	public void draw(Graphics g){
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				cells[x][y].draw(g);
<<<<<<< HEAD
			}
		}
	}
=======
				
			}
			
		}
	}
	
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
}
