import javax.swing.*;
import java.awt.*;


public class Searchbox extends JFrame {

	public Searchbox(){
		
		//Box
		super("Google Searchbox");
		setSize(350, 100);
		setVisible(true);

		//buttons (search & cancel)
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton search = new JButton("search");
		
		add(search);
		
		
		
		//searchbox
		
		JTextField comment = new JTextField(20);
		setLayout(flo);
		add(comment);
		
		}
		
	
	
	public static void main(String[] args) {
		
		Searchbox box = new Searchbox();
		
	}
	
}
