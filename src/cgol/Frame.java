package cgol;

/*
 * FRAME
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
	private Screen s;
	private Simulation sim;
	private float PAUSETIME = 1f;
	private float tslu;
	public Frame(){
		setExtendedState(MAXIMIZED_BOTH);
	}
	public void createScreen(){
		sim = new Simulation();
		s = new Screen();
		s.setBounds(0, 0, Main.width, Main.height);
		add(s);
	}
	public void update(float tslf){
		tslu += tslf;
		if(tslu > PAUSETIME){
			sim.update();
			tslu = 0;
		}
	}
	public void repaint(){
		s.repaint();
	}
	private class Screen extends JLabel{
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			sim.draw(g);
		}
	}
}
