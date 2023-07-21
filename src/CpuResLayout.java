import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class CpuResLayout extends JPanel{
	public CpuResLayout() {
		// TODO Auto-generated constructor stub
		GridLayout Layout = new GridLayout(2,1);
		Layout.setVgap(5);
		this.setLayout(Layout);
	}
}
