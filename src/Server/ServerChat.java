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
			System.out.println(reBuffer+"         ����Ʈ����");
			
			ByteArrayInputStream bais = new ByteArrayInputStream(reBuffer);
			System.out.println(bais+"      ArrayInput");
			
			ObjectInputStream ois = new ObjectInputStream(bais);
			System.out.println(ois+"       ObjectInput");
			
			Object o = ois.readObject();
			System.out.println(o+"        ��ü����ȯ");
			String[] ex = (String[]) o;
			System.out.println(ex+"      ���� ��ü");
			for(int i=0; i<ex.length; i++) {
			System.out.println(ex[i]);

//			FileInputStream fis = new FileInputStream("object.dat");
//
//			ObjectInputStream ois = new ObjectInputStream(fis);

			System.out.println("����");

//			byte[] reBuffer = new byte[100];
//			reMsg.read(reBuffer);
//			id = new String(reBuffer);
//			id = id.trim();

			MemberDAO dao = MemberDAO.getInstance();
			//MemberDTO member = dao.loginchk(id);
//			if (id.equals(member.getId()) && pwdField.getText().equals(member.getPwd())) {
//				JOptionPane.showMessageDialog(null, "�α��� �Ϸ�");
//				if (member.getLv() == 1) {
//					System.out.println("���θ�â �߰��ϱ�");
//				} else if (member.getLv() == 5) {
//					System.out.println("������â �߰� �ϱ� ������ ��ü�� �������� â���� ������");
//					dispose();
//				}
//			} else {
//				JOptionPane.showMessageDialog(null, "�������� �ʴ� ���̵�ų� ��й�ȣ�� ���� �ʽ��ϴ�.");
//				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//				idField.setText("");
//				pwdField.setText("");
			}

			InetAddress c_ip = withClient.getInetAddress();
			String ip = c_ip.getHostAddress();

			System.out.println(id + "�� �α���  (" + ip + ")");

			String reMsg1 = "�������� �Ǿ����ϴ�.";
			sendMsg = withClient.getOutputStream();
			sendMsg.write(reMsg1.getBytes());
			sendMsg.write(id.getBytes());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}