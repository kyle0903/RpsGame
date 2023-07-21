import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame{
	
	Title title = new Title();
	CpuResLayout cpuResLayout = new CpuResLayout();
	CpuPanel cpuPanel = new CpuPanel();
	ResPanel resPanel = new ResPanel();
	BtnPanel btnPanel = new BtnPanel();
	JButton paper = btnPanel.paper;
	JButton scissor = btnPanel.scissor;
	JButton stone = btnPanel.stone;
	JLabel cpuDecision = cpuPanel.cpuDecision;
	JLabel result = resPanel.result;
	String cpu_paper = new String("Paper!!!");
	String cpu_scissor = new String("Scissor!!!");
	String cpu_stone = new String("stone!!!");
	public GameFrame() {
		this.setSize(new Dimension(350,500));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(title,BorderLayout.NORTH);
		this.add(btnPanel,BorderLayout.SOUTH);
		cpuResLayout.setBackground(Color.GRAY);
		cpuResLayout.add(cpuPanel);
		cpuResLayout.add(resPanel);
		this.add(cpuResLayout);
		this.setVisible(true); 
		addlister();
	}
	public void randomDecision() {
		Random random = new Random();
		int cpuDecision_index = random.nextInt(3);
		if(cpuDecision_index == 0) {
			cpuDecision.setText(cpu_paper);
			revalidate();
		}else if(cpuDecision_index == 1) {
			cpuDecision.setText("Scissor!!!");
			revalidate();
		}else {
			cpuDecision.setText("Stone!!!");
			revalidate();
		}
	}
	public void addlister() {
		paper.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				randomDecision();
				if(cpuDecision.getText().equals(cpu_paper)) {
					result.setText("DRAW!");
				}else if(cpuDecision.getText().equals(cpu_scissor)) {
					result.setText("LOSE!");
				}else {
					result.setText("WIN!");
				}
				revalidate();
			}
		});
		scissor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				randomDecision();
				if(cpuDecision.getText().equals(cpu_paper)) {
					result.setText("WIN!");
				}else if(cpuDecision.getText().equals(cpu_scissor)) {
					result.setText("DRAW!");
				}else {
					result.setText("LOSE!");
				}
				revalidate();
			}
		});
		
		stone.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				randomDecision();
				if(cpuDecision.getText().equals(cpu_paper)) {
					result.setText("LOSE!");
				}else if(cpuDecision.getText().equals(cpu_scissor)) {
					result.setText("WIN!");
				}else {
					result.setText("DRAW!");
				}
				revalidate();
			}
		});
		
	}
}
