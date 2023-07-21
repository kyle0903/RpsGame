import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title extends JPanel{
	public Title() {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(350,80));
		this.setBackground(Color.DARK_GRAY);
		JLabel titleJLabel = new JLabel("PPSGame!!!");
		titleJLabel.setPreferredSize(new Dimension(200,80));
		titleJLabel.setFont(new Font("Sans-serif",Font.BOLD,25));
		titleJLabel.setForeground(new Color(195,220,220));
		titleJLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(titleJLabel);
	}
}
