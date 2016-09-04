package cgol;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
	private Screen s;
	public Frame(){
		setExtendedState(MAXIMIZED_BOTH);
	}
	public void createScreen(){
		s = new Screen();
		s.setBounds(0, 0, Main.width, Main.height);
		add(s);
	}
	public void repaint(){
		s.repaint();
	}
	private class Screen extends JLabel{
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillRect(0, 0, 50, 50);
		}
	}
}
