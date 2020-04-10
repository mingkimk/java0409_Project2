package Client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Server.MemberDTO;

public class Login extends JFrame implements ActionListener {
	JPanel nP, cP, sP, eP;
	JLabel idLabel, pwLabel, joinlabel;
	JTextField idField, pwdField, loginField;
	JButton loginBtn, joinBtn;

//	ClientChat myChat = null;

	public Login() {//
		// ����Ŭ���� ������ �θ�
		super("�α��� â");
		createpanel();
		Loginchk();
		setClose();
		gosignup();
	}

	public void createpanel() {
		// this.myChat = c;
		// ������ �� �⺻�� BorderLayout
		this.setLayout(new BorderLayout());

		// JPanel contentPane = new JPanel();

		// �뽺 �г� �����
		// �г��� �⺻ ���̾ƿ��� flowlayout.
		nP = new JPanel();
		nP.setBorder(new EmptyBorder(10, 10, 0, 10));
		idLabel = new JLabel("ID");
		nP.add(idLabel);

		// �ؽ�Ʈ �ʵ� �����
		idField = new JTextField(15);
		nP.add(idField);

		// center �г� �����
		cP = new JPanel();
		pwLabel = new JLabel("�� ȣ");
		pwdField = new JTextField(15);

		cP.add(pwLabel);
		cP.add(pwdField);
		// south �г� �����
		sP = new JPanel();
		loginBtn = new JButton("�α���");
		sP.add(loginBtn);

		eP = new JPanel();
		joinBtn = new JButton("ȸ������");
		sP.add(joinBtn);
		loginBtn.addActionListener(this);
		joinBtn.addActionListener(this);

		// �г� �����ӿ� �ֱ� ��ġ�� ����"".
		this.add(nP, "North");
		this.add(cP, "Center");
		this.add(sP, "South");
		this.add(eP, "East");

		// �� ����
		// this.setBackground(Color,blue);

		// ������ �����ֱ�
		this.setBounds(400, 500, 300, 200);

	}

	public void setClose() {
		this.setVisible(false);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	private void Loginchk(MemberDTO member) {
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
				ClientChat cc=new ClientChat (idField.getText(),pwdField.getText());
				if(idField.getText().equals(member.getId())&&pwdField.getText().equals(member.getPwd())) {
						JOptionPane.showMessageDialog(null, "�α��� �Ϸ�");
						
						
					} else {
						JOptionPane.showMessageDialog(null, "�������� �ʴ� ���̵�ų� ��й�ȣ�� ���� �ʽ��ϴ�.");
						setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						idField.setText("");
						pwdField.setText("");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
	}

//		loginBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				MemberDTO member = new MemberDTO();
//				member.setId(idField.getText());
//				member.setPwd(pwdField.getText());
//
//				try {
//					MemberDAO dao = MemberDAO.getInstance();
//					Boolean result = dao.Loginchk(member);
//						if(result==true) {
////							if(idField.getText().equals(member.getId())&&pwdField.getText().equals(member.getPwd())) {
//								JOptionPane.showMessageDialog(null, "�α��� �Ϸ�");
//							dispose();
//							new ShoppingMall();
//							}
////						}
//					 else if(result==false){
//						JOptionPane.showMessageDialog(null, "�������� �ʴ� ���̵�ų� ��й�ȣ�� ���� �ʽ��ϴ�.");
//						setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//					 }else {
//						 JOptionPane.showMessageDialog(null, "id�� ��� ��ȣ�� ��ġ �մϴ�.");
//					}
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//
//			}
//
//		});
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		loginchk();
		gosignup();
	}

	private void gosignup() {
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUp();
			}

		});

	}
}

//(cObj.equals(joinBtn){

//		if(cObj.equals(loginBtn)) { //  �α��� ��ư ������ ģ�� ä��â
//		myChat.streamSet(idField.getText());
//		this.setVisible(false);

// this.setVisible(false);
