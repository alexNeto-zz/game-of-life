package cgol;

import java.util.Random;

public class Simulation {
	private Cell[][] cells;
	private Random random;
	private int width = Main.width/Cell.size;
	private int height = Main.height/Cell.size;
	public Simulation(){
		random = new Random();
		
		cells = new Cell[width][height];
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				cells[x][y] = new Cell(x, y);
				cells[x][y].setAlive(random.nextBoolean());
			}
		}
	}
	
}
