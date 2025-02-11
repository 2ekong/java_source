package pack4extend;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex23FrameInterface extends Frame implements WindowListener, MouseListener{
	
	
	public Ex23FrameInterface() {
		super.setTitle("이벤트 처리창");
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		//윈도우 관련 이벤트 처리를 하려면 윈도우 리스너를 Frame 에 장착
		super.addWindowListener(this);
		//마우스 관련 이벤트 처리를 하려면 마우스 리스너를 Frame 에 장착
		addMouseListener(this);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	 @Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 종료 처리 메소드");
		System.exit(0);	//응용프로그램의 강제 종료
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
	//마우스 이벤트 관련
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("mouseClicked 메소드 수행");
		//setBackground(new Color(255, 0, 0));
		//System.out.println((int)(Math.random() *255));
		int r = (int)(Math.random() *255);
		int g = (int)(Math.random() *255);
		int b = (int)(Math.random() *255);
		setBackground(new Color(r, g, b));
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) {
		//Ex23FrameInterface frameInterface = new Ex23FrameInterface();
		new Ex23FrameInterface();
	}
}
