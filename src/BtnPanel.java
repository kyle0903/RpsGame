import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel{
	JButton paper = new JButton("paper");
	JButton scissor = new JButton("scissor");
	JButton stone = new JButton("stone");
 	public BtnPanel() {
		this.setPreferredSize(new Dimension(350,100));
		this.setBackground(Color.green);
		paper.setFont(new Font("Sans-serif",Font.BOLD,20));
		scissor.setFont(new Font("Sans-serif",Font.BOLD,20));
		stone.setFont(new Font("Sans-serif",Font.BOLD,20));
		this.add(Box.createHorizontalStrut(10));
		this.add(paper);
		this.add(scissor);
		this.add(stone);
	}
}
