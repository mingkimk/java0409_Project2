package Server;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;


public class ServerChat extends Thread implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void run() {
		Receive();
		Send();
	}

	private Socket withClient = null;// 어떤 클라이언트와 소통할지 모르니까 null
	private InputStream reMsg = null;
	private OutputStream sendMsg = null;
	private ServerCenter sc = null;
	private String[] check = null;

	public ServerChat(Socket c, ServerCenter sc) {
		this.withClient = c;
	}

	public ServerChat(String[] check) {
		this.check = check;
	}

	private void Receive() {
		try {
			System.out.println("서버로 도착~");
			while (true) {
				reMsg = withClient.getInputStream();// 소켓으로 주고받기한 것을 jvm으로 in하는것
				byte[] bytes = new byte[1024];
				reMsg.read(bytes);
				
				ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
				ObjectInputStream ois = new ObjectInputStream(bais);
				Object objectMember = ois.readObject();
				if (objectMember != null) {
					check = (String[]) objectMember;
					for(int i=0; i<check.length;i++) {
						System.out.println(check[i]);
						
					}

				}

			}
		} catch (Exception e) {
			System.out.println("server chat Error");
			e.printStackTrace();

		}

	}
	
	private void Send() {
		try {
			System.out.println("client-->login");
			byte[] bytes = new byte[1024];
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(check);

			bytes = baos.toByteArray();
			System.out.println("여기: " + bytes.toString());

			sendMsg = withClient.getOutputStream();
			sendMsg.write(bytes);
			System.out.println("끝");
		} catch (IOException e) {
			System.out.println("Client chat Error");
		}

	}

}
