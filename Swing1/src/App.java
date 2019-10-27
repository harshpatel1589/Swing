import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		//Class with method and runnable interface as parameter
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new MainFrame();
			}
			
		});

	}

}
 