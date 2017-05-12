import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	private JLabel lab = new JLabel("score:");
	private JLabel lab1 = new JLabel("==> ");
	private JPanel pnlE = new JPanel(new GridLayout(3,1,5,5));
	private JPanel pnlC = new JPanel(new GridLayout(1,3,5,5));
	private JTextField tFd = new JTextField();
	private JButton btnClear = new JButton("Clear");
	private JButton btnRun = new JButton("Run");
	private JButton btnExit = new JButton("Exit");
	public MainFrame(){
		itincomp();
	}

	private void itincomp() {
		// TODO Auto-generated method stub
		this.setBounds(100, 100, 400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		pnlE.add(btnClear);
		pnlE.add(btnRun);
		pnlE.add(btnExit);
		pnlC.add(lab);
		pnlC.add(tFd);
		pnlC.add(lab1);
		this.add(pnlE,BorderLayout.EAST);
		this.add(pnlC,BorderLayout.CENTER);
		

	}
	
}
