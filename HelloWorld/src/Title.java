import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Title extends JFrame{
	private JLabel item1;
	public Title(){
		super("VISUAL NOVEL FOR THE WIN");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("sentence here");
		item1.setToolTipText("currently hovering");
		add(item1);
	}
}