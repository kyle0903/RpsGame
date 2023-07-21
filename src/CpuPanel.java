import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CpuPanel extends JPanel{
	JLabel cpuDecision = new JLabel("cpuDecision");
	TitledBorder titledBorder = BorderFactory.createTitledBorder("Computer");
	public CpuPanel() {
		this.setPreferredSize(new Dimension(300,100));
		this.setBackground(new Color(20,35,66));
		titledBorder.setTitleJustification(TitledBorder.CENTER);
		this.setBorder(titledBorder);
		titledBorder.setTitleColor(new Color(195,220,220));
		titledBorder.setTitleFont(new Font("Sans-serif",Font.BOLD,22));
		cpuDecision.setPreferredSize(new Dimension(300,80));
		cpuDecision.setVerticalAlignment(JLabel.CENTER);
		cpuDecision.setHorizontalAlignment(JLabel.CENTER);
		cpuDecision.setForeground(new Color(195,220,220));
		cpuDecision.setFont(new Font("Sans-serif",Font.BOLD,22));
		this.add(cpuDecision);
		
	}
}
