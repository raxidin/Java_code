package �򵥼���;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends JFrame{
	JTextField textinput;
	JTextArea textS;
	JLabel labelin,labelout;
	JButton btn;
	Event lit;

	public Window() {
		// TODO Auto-generated constructor stub
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	void init() {
		setLayout(new FlowLayout());
		textinput=new JTextField(5);
		Font font=new Font("����",Font.BOLD,22);
		
		textinput.setFont(font);
		textS=new JTextArea(9,30);
		textS.setFont(font);
		labelin=new JLabel("����");
		labelout=new JLabel("���");
		btn =new JButton("����");
		btn.setFont(font);
		add(btn);
		add(labelin);
		add(textinput);
		add(labelout);
		add(new JScrollPane(textS));
		lit=new Event();
		lit.setView(this);
		btn.addActionListener(lit);
		
		
		
		
		
	}
	
}
