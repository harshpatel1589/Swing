import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	//Constructor
	public MainFrame() {
		
		//Calling parent constructor 
		super("Hello World");
		
		setLayout(new BorderLayout());

		
//		2 components and add to itself
		textPanel = new TextPanel();
		toolbar = new Toolbar();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {

			@Override
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});
		
		add(formPanel,BorderLayout.WEST);
		add(toolbar,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);
		
		setSize(600,500);
		
		//Application will terminate after clicking X on the window.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Making the window visible
		setVisible(true);
	}
}
