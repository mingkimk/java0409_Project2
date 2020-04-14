package manager;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Set extends JFrame {

	public Set(){
	        super( "BoxLayout Test" );
//	        JRadioButton r1,r2;
//	        //박스 레이아웃 매니저를 생성하고 컨테이너에 설정
//	        setLayout(new BorderLayout());
//	        //수직 배치 박스 레이아웃을 생성
//	        Box left = Box.createVerticalBox();
//	        //보기 좋게 배치하기 위래 투명 컴포넌트로 공간 확보
//	        left.add(Box.createVerticalStrut(30)); 
//	        //라디오버튼을 위한 버튼 그룹 생성
//	        ButtonGroup radioGroup = new ButtonGroup();
//	        //버튼 객체를 생성 후 버튼 그룹에 추가
//	        radioGroup.add(r1 = new JRadioButton("치킨")); 
//	        //버튼 객체를 Box객체 left에 추가
//	        left.add(r1);                                  
//	        left.add(Box.createVerticalStrut(30));              
//	        radioGroup.add(r2 = new JRadioButton("피자"));
//	        left.add(r2);
//	        //Box객체 left를 패널에 추가
//	        JPanel leftPanel = new JPanel(new BorderLayout());
//	        //패널의 테두리선을 에칭효과로 지정
//	        leftPanel.setBorder(
//	           new TitledBorder( new EtchedBorder(),"음식"));       
//	        leftPanel.add(left, BorderLayout.CENTER);
	 
	        //수직으로 배치하는 박스레이아웃 생성
	        Box right = Box.createVerticalBox();
	        right.add(Box.createVerticalStrut(30));  
	        //체크박스를 생성해 박스레이아웃에 추가
	        right.add(new JCheckBox("너구리"));
	        right.add(Box.createVerticalStrut(30));             
	        right.add(new JCheckBox("돼지"));
	        right.add(Box.createVerticalStrut(30));             
	        right.add(new JCheckBox("족제비"));
	        right.add(Box.createVerticalStrut(30));             
	        right.add(new JCheckBox("봉이"));
	        JPanel rightPanel = new JPanel(new BorderLayout());
	        rightPanel.setBorder(
	             new TitledBorder(new EtchedBorder(), "동물"));  
	        rightPanel.add(right, BorderLayout.CENTER);
	        
	        //수평으로 배치하는 박스레이아웃을 생성해
	        //패널leftPanel과 rightPanel을 이 박스 레이아웃에 배치
	        Box center = Box.createHorizontalBox();
	      //  center.add(leftPanel);
	        center.add(rightPanel);
	        add(center,  BorderLayout.CENTER);
	        
	        setSize(300,300);
	        setVisible(true);
	    }

	public static void main(String[] args) {
		Set box = new Set();
		box.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

//    JPanel p, p1, p2;
//    // JList 선언
//    JList<String> jl;
//    // ComboBox 선언
//    JComboBox<String> com;
//    String name[] = { "너구리", "돼지", "족제비 ", "봉이", "말" };
//    String count[] = { "1", "2", "3", "4", "5" };
// 
//    public Set() 
//    {
//        super("JComponent연습");
//        Container c = getContentPane();
//        // FlowLayout 생성
//        c.setLayout(new FlowLayout());
//        // JPanel 생성
//        p = new JPanel(new GridLayout(1, 2));
//        // JComboBox에 name 배열 널기
//        com = new JComboBox<String>(count);
//        JScrollPane s = new JScrollPane(com);
//        c.add(s);
//        // JList에 count배
//        jl = new JList<String>(count);
//        JScrollPane s1 = new JScrollPane(jl);
//        jl.setVisibleRowCount(4);
//        c.add(s1);
//        setSize(250, 300);
//        setVisible(true);
//    }
//    
//    public static void main(String args[]) 
//    {
//        Set Obj = new Set();
//        Obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
// 
// 
//}