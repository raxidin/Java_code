package ºÚµ•º∆À„;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener{
	Window view;
	public void setView(Window view) {
		this.view = view;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==view.btn) {
			int n1=Integer.parseInt(view.textinput.getText());
			view.textS.append("result1="+(int)(n1*2+1)+"\n");
			view.textS.append("result2="+n1*n1+"\n");
			
			
		}
		
	}
}
