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
//	        //�ڽ� ���̾ƿ� �Ŵ����� �����ϰ� �����̳ʿ� ����
//	        setLayout(new BorderLayout());
//	        //���� ��ġ �ڽ� ���̾ƿ��� ����
//	        Box left = Box.createVerticalBox();
//	        //���� ���� ��ġ�ϱ� ���� ���� ������Ʈ�� ���� Ȯ��
//	        left.add(Box.createVerticalStrut(30)); 
//	        //������ư�� ���� ��ư �׷� ����
//	        ButtonGroup radioGroup = new ButtonGroup();
//	        //��ư ��ü�� ���� �� ��ư �׷쿡 �߰�
//	        radioGroup.add(r1 = new JRadioButton("ġŲ")); 
//	        //��ư ��ü�� Box��ü left�� �߰�
//	        left.add(r1);                                  
//	        left.add(Box.createVerticalStrut(30));              
//	        radioGroup.add(r2 = new JRadioButton("����"));
//	        left.add(r2);
//	        //Box��ü left�� �гο� �߰�
//	        JPanel leftPanel = new JPanel(new BorderLayout());
//	        //�г��� �׵θ����� ��Īȿ���� ����
//	        leftPanel.setBorder(
//	           new TitledBorder( new EtchedBorder(),"����"));       
//	        leftPanel.add(left, BorderLayout.CENTER);
	 
	        //�������� ��ġ�ϴ� �ڽ����̾ƿ� ����
	        Box right = Box.createVerticalBox();
	        right.add(Box.createVerticalStrut(30));  
	        //üũ�ڽ��� ������ �ڽ����̾ƿ��� �߰�
	        right.add(new JCheckBox("�ʱ���"));
	        right.add(Box.createVerticalStrut(30));             
	        right.add(new JCheckBox("����"));
	        right.add(Box.createVerticalStrut(30));             
	        right.add(new JCheckBox("������"));
	        right.add(Box.createVerticalStrut(30));             
	        right.add(new JCheckBox("����"));
	        JPanel rightPanel = new JPanel(new BorderLayout());
	        rightPanel.setBorder(
	             new TitledBorder(new EtchedBorder(), "����"));  
	        rightPanel.add(right, BorderLayout.CENTER);
	        
	        //�������� ��ġ�ϴ� �ڽ����̾ƿ��� ������
	        //�г�leftPanel�� rightPanel�� �� �ڽ� ���̾ƿ��� ��ġ
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
//    // JList ����
//    JList<String> jl;
//    // ComboBox ����
//    JComboBox<String> com;
//    String name[] = { "�ʱ���", "����", "������ ", "����", "��" };
//    String count[] = { "1", "2", "3", "4", "5" };
// 
//    public Set() 
//    {
//        super("JComponent����");
//        Container c = getContentPane();
//        // FlowLayout ����
//        c.setLayout(new FlowLayout());
//        // JPanel ����
//        p = new JPanel(new GridLayout(1, 2));
//        // JComboBox�� name �迭 �α�
//        com = new JComboBox<String>(count);
//        JScrollPane s = new JScrollPane(com);
//        c.add(s);
//        // JList�� count��
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