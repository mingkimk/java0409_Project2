package manager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test extends JFrame{
	JTabbedPane tabpane = new JTabbedPane();
	String header[] = { "상품코드", "상품이름", "수량", "가격" };
	DefaultTableModel tablemodel = new DefaultTableModel(header, 0);
	JTable table = new JTable(tablemodel);
	JScrollPane tableScroll = new JScrollPane(table);
	
	JPanel tab_center = new JPanel();
	JPanel tab_south = new JPanel();
	JPanel south_north = new JPanel();
	JPanel south_south = new JPanel();
	
	
	
	
	public Test() {
		super("관리자");
		Dimension size = new Dimension(600, 400);
		createpanel();
		this.setLocation(300, 300);
		this.setSize(size);
		this.add(tabpane);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);

		//JFrame j = new JFrame("관리자 설정");
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(320, 240);
		this.setLayout(new FlowLayout(0,30,100));
		this.add(tabpane);
		Integer[] array = { 0, 1, 2, 3, 4 };
		JComboBox cbNight = new JComboBox<Integer>(array);
		this.add(cbNight);
		//cbNight.setBounds(80, 10, 100, 30);
		this.setVisible(true);
		
		
}
	private void createpanel() {
		// TODO Auto-generated method stub
		this.add(tab_center, "Center");
		this.add(tab_south, "South");
		tab_center.setLayout(new BorderLayout());
		tab_center.add(tableScroll, "Center");
		tab_center.add(tab_south, "South");
		tabpane.add("basket", tab_center);

		tab_south.setLayout(new BorderLayout());
		tab_south.add(south_north, "North");
		tab_south.add(south_south, "South");
	}
	}

