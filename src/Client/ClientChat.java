package Client;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientChat {
	private Socket withServer = null;
	private InputStream reMsg = null;
	private OutputStream sendMsg = null;
	private String id = null;
	private String pw = null;
	private String[] lgs = null;
	private final String user = "a.bin";

	ClientChat(Socket withServer) {
		// this.withServer = c;
		//send();
		streamSet(lgs);

	}

	public ClientChat(String id, String pwd) {
		this.id = id;
		this.pw = pwd;
	}

//	private void send() {
//		// TODO Auto-generated method stub
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					Login lg = new Login();
//					System.out.println("send start~~");
//
//					while (true) {
//						FileOutputStream fos = new FileOutputStream(user);
//						BufferedOutputStream bos = new BufferedOutputStream(fos);
//						ObjectOutputStream out = new ObjectOutputStream(bos);
//						Login u1 = new Login();
//
//						ArrayList list = new ArrayList<>();
//						list.add(u1);
//						out.writeObject(u1);
//						out.writeObject(list);
//						out.close();
//						System.out.println("직렬화 완료");
//						Login l = new Login();
//
//						System.out.println("zzz");
//						Login lg = new Login();
//						ByteArrayOutputStream baos = new ByteArrayOutputStream();
//						ObjectOutputStream oos = new ObjectOutputStream(baos);
//						oos.writeObject(check);
//						byte[] bowl = baos.toByteArray();
//						op = sc.getOutputStream();
//						op.write(bowl);
//
//						sendMsg = withServer.getOutputStream();
//						sendMsg.write(bowl);
//						sendMsg.write(pwd.getBytes());
//					}
//				} catch (Exception e) {
//					System.out.println("client send end !!!");
//					return;
//				}
//			}
//		}).start();
//	}

	public void streamSet(String[] check) {
		// TODO Auto-generated method stub
		try {
			Login lg = new Login();
			System.out.println(check);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(check);
			byte[] bowl = baos.toByteArray();

			sendMsg = withServer.getOutputStream();
			sendMsg.write(bowl);
			System.out.println("zzz");

	
			reMsg = withServer.getInputStream();
			byte[] reBuffer = new byte[100];
			reMsg.read(reBuffer);
			String msg = new String(reBuffer);
			msg = msg.trim();

			reMsg.read(reBuffer);
			String id = new String(reBuffer);
			id = id.trim();

			System.out.println("서버에서 보내 메세지 확인 : " + msg);
			System.out.println("클라이언트에서 아이디 확인 : " + id);

			// myG = new FrameEX2(this);
			// myG.setMe(id);

		} catch (Exception e) {

		}

//		try {
//			FileOutputStream fos= new FileOutputStream(user);
//		BufferedOutputStream bos= new BufferedOutputStream(fos);
//		ObjectOutputStream out= new ObjectOutputStream(bos);
//			
//			
//			System.out.println("직렬화 완료");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

//		try {
//			new Login();
//		//	System.out.println("receive start~~");
//			sendMsg = withServer.getOutputStream();
//			sendMsg.write(id.getBytes());
//			sendMsg.write(pw.getBytes());
//
//			reMsg = withServer.getInputStream();
//			byte[] reBuffer = new byte[100];
//			reMsg.read(reBuffer);
//			String msg = new String(reBuffer);
//			msg = msg.trim();
//			System.out.println(msg);
//
//		} catch (IOException e) {
//			System.out.println("End");
//		}
//
	}
}
