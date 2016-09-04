package cgol;

public class Main {
	static int width;
	static int height;
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		//f.setUndecorated(true);
		f.setResizable(false);
		
		width = f.getWidth();
		height = f.getHeight();
		f.createScreen();
		
		while(true){
			f.repaint();
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
