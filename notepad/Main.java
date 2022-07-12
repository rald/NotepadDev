import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;

class Main {

	public static void main(String[] args) {
	
		JFrame frame=new JFrame("Notepad");
		JEditorPane editorPane=new JEditorPane();
		JScrollPane scrollPane=new JScrollPane(editorPane);
		
		JMenuBar menuBar=new JMenuBar();
		
		JMenu menu=new JMenu("File");


		JMenuItem openMenuItem = new JMenuItem("Open");
		JMenuItem closeMenuItem = new JMenuItem("Close");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		JMenuItem saveAsMenuItem = new JMenuItem("Save As");
		JMenuItem exitMenuItem = new JMenuItem("Exit");

		menu.add(openMenuItem);
		
		menu.add(openMenuItem);
		menu.add(closeMenuItem);
		menu.add(saveMenuItem);
		menu.add(saveAsMenuItem);
		menu.add(exitMenuItem);
		
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(320,200);
		
		frame.setLayout(new BorderLayout());
		
		frame.add(scrollPane,BorderLayout.CENTER);

		
		
		frame.setVisible(true);
	
	}

}