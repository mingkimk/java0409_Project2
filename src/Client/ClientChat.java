package Client;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

import Server.ServerChat;

public class ClientChat implements Serializable {
	private static final long serialVersionUID = 1L;
	private Socket withServer = null;
	private InputStream reMsg = null;
	private OutputStream sendMsg = null;
	private String id = null;
	private String pw = null;
	private String[] check = null;
	private String chk = null;
	private ServerChat d=null;

	public ClientChat() {
	}

	ClientChat(Socket withServer) {
		this.withServer = withServer;
		start();
		streamSet();		
		//Send();
		//receive();
	}
	public ClientChat(String[] check) {
		this.check = check;
	}

	private void start() {
		new Login(this);

	}

	public void Send() {
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
		try {
			// Login lg = new Login();
			System.out.println("send start~~");

			while (true) {
//						//FileOutputStream fos = new FileOutputStream(USERINFO_SER);
//						BufferedOutputStream bos = new BufferedOutputStream();
//						ObjectOutputStream out = new ObjectOutputStream(bos);
//						Login u1 = new Login(check);
//						
//						ArrayList list = new ArrayList<>();
//						list.add(u1);
//						out.writeObject(u1);
//						out.writeObject(list);
//						out.close();
//						System.out.println("직렬화 완료");
				// Login l = new Login();

//						System.out.println("zzz");
//						Login lg = new Login();
//						ByteArrayOutputStream baos = new ByteArrayOutputStream();
//						ObjectOutputStream oos = new ObjectOutputStream(baos);
//						oos.writeObject(check);
//						byte[] bowl = baos.toByteArray();
				// op = sc.getOutputStream();
//						op.write(bowl);

//						sendMsg = withServer.getOutputStream();
//						sendMsg.write(bowl);
//						sendMsg.write(pwd.getBytes());
			}
		} catch (Exception e) {
			System.out.println("client send end !!!");
			return;
		}
//			}
//		}).start();
	}
		

//	private void receive() throws IOException {
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				try {
//					System.out.println("received");
//					while (true) {
//						reMsg = withServer.getInputStream();// 소켓으로 주고받기한 것을 jvm으로 in하는것
//						byte[] bytes = new byte[1024];
//						reMsg.read(bytes);
//
//						ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//						ObjectInputStream ois = new ObjectInputStream(bais);
//						Object objectMember = ois.readObject();
//						if (objectMember != null) {
//							check = (String[]) objectMember;
//							for (int i = 0; i < check.length; i++) {
//								System.out.println(check[i]);
//
//							}
//
//						}
//					}
//
//				} catch (IOException e) {
//				} catch (ClassNotFoundException e) {
//				}
//			}
//		}).start();
//	}

	public void streamSet(String[] check) {
		
				try {
					if (check != null) {
						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						ObjectOutputStream oos = new ObjectOutputStream(baos);
						oos.writeObject(check);

						byte[] bowl = baos.toByteArray();

						sendMsg = withServer.getOutputStream();

						sendMsg.write(bowl);
						System.out.println("보내기 완료");
					}

					// 메세지 받기
					reMsg = withServer.getInputStream();
					byte[] reBuffer = new byte[100];
					reMsg.read(reBuffer);
					String msg = new String(reBuffer);
					msg = msg.trim();
					System.out.println(msg);

					System.out.println("서버에서 보낸 메시지 확인 :" + msg);
				} catch (Exception e) {
				}
			}
	}

//		try {
//			System.out.println("client-->login");
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			ObjectOutputStream oos = new ObjectOutputStream(baos);
//			oos.writeObject(check);
//			byte[] bytes = new byte[1024];
//
//			bytes = baos.toByteArray();
//			System.out.println("여기: " + bytes.toString());
//
//			sendMsg = withServer.getOutputStream();
//			sendMsg.write(bytes);
//			System.out.println("끝");
//		} catch (IOException e) {
//			System.out.println("Client chat Error");
//		}
//
//	}



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

//	public void streamSet(String[] check) {
//		// TODO Auto-generated method stub
//		try {
//			
//			//System.out.println(check);
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			ObjectOutputStream oos = new ObjectOutputStream(baos);
//			oos.writeObject(check);
//			byte[] bowl = baos.toByteArray();
//			System.out.println("aaa");
//			sendMsg = withServer.getOutputStream();
//			byte[] buffer = new byte[1024];
//			reMsg.read(buffer);
//			chk = new String(buffer);
//			chk = chk.trim();
//
//	
//			reMsg = withServer.getInputStream();
//			byte[] reBuffer = new byte[1024];
//			reMsg.read(reBuffer);
//			String msg = new String(reBuffer);
//			msg = msg.trim();
//
//			reMsg.read(reBuffer);
//			String id = new String(reBuffer);
//			id = id.trim();
//
//	
//
//
//		} catch (Exception e) {
//
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
	
