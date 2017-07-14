package cgol;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setSize(Frame.WIDTH + frame.getInsets().left +  + frame.getInsets().right, Frame.HEIGHT + frame.getInsets().bottom +  + frame.getInsets().top);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.startUpdate();
	}
}
