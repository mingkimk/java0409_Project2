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
		// 슈퍼클래스 생성자 부름
		super("로그인 창");
		createpanel();
		Loginchk();
		setClose();
		gosignup();
	}

	public void createpanel() {
		// this.myChat = c;
		// 프레임 의 기본은 BorderLayout
		this.setLayout(new BorderLayout());

		// JPanel contentPane = new JPanel();

		// 노스 패널 만들기
		// 패널의 기본 레이아웃은 flowlayout.
		nP = new JPanel();
		nP.setBorder(new EmptyBorder(10, 10, 0, 10));
		idLabel = new JLabel("ID");
		nP.add(idLabel);

		// 텍스트 필드 만들기
		idField = new JTextField(15);
		nP.add(idField);

		// center 패널 만들기
		cP = new JPanel();
		pwLabel = new JLabel("암 호");
		pwdField = new JTextField(15);

		cP.add(pwLabel);
		cP.add(pwdField);
		// south 패널 만들기
		sP = new JPanel();
		loginBtn = new JButton("로그인");
		sP.add(loginBtn);

		eP = new JPanel();
		joinBtn = new JButton("회원가입");
		sP.add(joinBtn);
		loginBtn.addActionListener(this);
		joinBtn.addActionListener(this);

		// 패널 프레임에 넣기 위치도 지정"".
		this.add(nP, "North");
		this.add(cP, "Center");
		this.add(sP, "South");
		this.add(eP, "East");

		// 색 지정
		// this.setBackground(Color,blue);

		// 사이즈 정해주기
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
						JOptionPane.showMessageDialog(null, "로그인 완료");
						
						
					} else {
						JOptionPane.showMessageDialog(null, "존재하지 않는 아이디거나 비밀번호가 맞지 않습니다.");
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
//								JOptionPane.showMessageDialog(null, "로그인 완료");
//							dispose();
//							new ShoppingMall();
//							}
////						}
//					 else if(result==false){
//						JOptionPane.showMessageDialog(null, "존재하지 않는 아이디거나 비밀번호가 맞지 않습니다.");
//						setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//					 }else {
//						 JOptionPane.showMessageDialog(null, "id와 비밀 번호가 일치 합니다.");
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

//		if(cObj.equals(loginBtn)) { //  로그인 버튼 누르면 친구 채팅창
//		myChat.streamSet(idField.getText());
//		this.setVisible(false);

// this.setVisible(false);
