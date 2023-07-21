import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ResPanel extends JPanel{
	TitledBorder titledBorder = BorderFactory.createTitledBorder("Result");
	JLabel result = new JLabel("Result");
	public ResPanel() {
		this.setPreferredSize(new Dimension(300,100));
		this.setBackground(new Color(20,35,66));
		titledBorder.setTitleJustification(TitledBorder.CENTER);
		titledBorder.setTitleFont(new Font("Sans-serif",Font.BOLD,22));
		this.setBorder(titledBorder);
		titledBorder.setTitleColor(new Color(195,220,220));
		result.setPreferredSize(new Dimension(300,80));
		result.setVerticalAlignment(JLabel.CENTER);
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setForeground(Color.red);
		result.setFont(new Font("Sans-serif",Font.BOLD,22));
		this.add(result);
	}
}
