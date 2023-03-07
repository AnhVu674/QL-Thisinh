package Test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import View.QLSVView;

public class Client {
public static void main(String[] args) {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new QLSVView();
	} catch (Exception e) {
		e.printStackTrace();
	} 
}
}
