package cgol;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 500;

	private final static int REFRESH_RATE = 30; 
	private final static int MILLIS = 1000/REFRESH_RATE;

	private Screen screen;
	private Simulation simulation;

	public Frame() {
		setLayout(new BorderLayout());

		simulation = new Simulation();

		screen = new Screen();
		add(screen, BorderLayout.CENTER);
	}

	public void startUpdate() {
		while(true) {
			long before = System.currentTimeMillis();
			simulation.update();

			screen.repaint();
			long diff = MILLIS - (System.currentTimeMillis() - before);

			try {
				if(diff > 0) Thread.sleep(diff);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public class Screen extends JLabel {
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			simulation.draw(g);
		}
	}

}
