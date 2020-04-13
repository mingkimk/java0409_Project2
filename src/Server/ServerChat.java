package Server;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerChat extends Thread {
	private Socket withClient = null;
	private InputStream reMsg = null;
	private OutputStream sendMsg = null;
	private String id = null;
	private MemberDAO dao = null;

	ServerChat(Socket withClient) {
		// this.withClient = c;
		// this.sc = s;
		// streamSet();
	}

	@Override
	public void run() {
		streamSet();
		// receive();
		// send();
	}

	private void streamSet() {
		
		try {
			//reMsg = withClient.getInputStream();
			//byte[] serializedMember;
			System.out.println("*******************************");
			byte[] reBuffer = new byte[1024];
			InputStream reMsg = withClient.getInputStream();
			reMsg.read(reBuffer);
			System.out.println(reBuffer+"         바이트형태");
			
			ByteArrayInputStream bais = new ByteArrayInputStream(reBuffer);
			System.out.println(bais+"      ArrayInput");
			
			ObjectInputStream ois = new ObjectInputStream(bais);
			System.out.println(ois+"       ObjectInput");
			
			Object o = ois.readObject();
			System.out.println(o+"        객체형변환");
			String[] ex = (String[]) o;
			System.out.println(ex+"      받은 객체");
			for(int i=0; i<ex.length; i++) {
			System.out.println(ex[i]);

//			FileInputStream fis = new FileInputStream("object.dat");
//
//			ObjectInputStream ois = new ObjectInputStream(fis);

			System.out.println("성공");

//			byte[] reBuffer = new byte[100];
//			reMsg.read(reBuffer);
//			id = new String(reBuffer);
//			id = id.trim();

			MemberDAO dao = MemberDAO.getInstance();
			//MemberDTO member = dao.loginchk(id);
//			if (id.equals(member.getId()) && pwdField.getText().equals(member.getPwd())) {
//				JOptionPane.showMessageDialog(null, "로그인 완료");
//				if (member.getLv() == 1) {
//					System.out.println("쇼핑몰창 뜨게하기");
//				} else if (member.getLv() == 5) {
//					System.out.println("관리자창 뜨게 하기 관리자 객체를 관리자의 창으로 보내깅");
//					dispose();
//				}
//			} else {
//				JOptionPane.showMessageDialog(null, "존재하지 않는 아이디거나 비밀번호가 맞지 않습니다.");
//				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//				idField.setText("");
//				pwdField.setText("");
			}

			InetAddress c_ip = withClient.getInetAddress();
			String ip = c_ip.getHostAddress();

			System.out.println(id + "님 로그인  (" + ip + ")");

			String reMsg1 = "정상접속 되었습니다.";
			sendMsg = withClient.getOutputStream();
			sendMsg.write(reMsg1.getBytes());
			sendMsg.write(id.getBytes());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}