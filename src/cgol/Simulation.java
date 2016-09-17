package cgol;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Simulation implements KeyListener{
	private Cell[][] cells;
	private Random random;
	private int width = Main.width/Cell.size;
	private int height = Main.height/Cell.size;
	private int generation;
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
	public void update(){
		generation++;
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				int mx = x - 1;
				if (mx < 0) mx = width - 1;
				int my = y - 1;
				if (my < 0) my = height - 1;
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
				cells[x][y].nextRound();
			}
		}
	}
	public void draw(Graphics g){
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				cells[x][y].draw(g);
			}
		}
		g.setColor(Color.BLUE);
		g.setFont(new Font("SansSerif", Font.BOLD, 25));
		g.drawString("" + generation, 10, 10 + g.getFont().getSize());
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_G){
			if(Cell.grid) Cell.grid = false;
			else Cell.grid = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_R){
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					cells[x][y].setAlive(random.nextBoolean());
				}
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {

	}
}
