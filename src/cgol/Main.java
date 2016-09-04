package cgol;
<<<<<<< HEAD
/*
 * MAIN
 */

=======
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275

public class Main {
	static int width;
	static int height;
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
<<<<<<< HEAD
=======
		//f.setUndecorated(true);
>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
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
<<<<<<< HEAD
=======

>>>>>>> 1b465bf8fbde1718594efa8cdbf9eee5e6961275
}
