package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
	private Socket withServer = null;
	private InputStream reMsg = null;
	private OutputStream sendMsg = null;
	private String id = null;
	private String pw=null;

	ClientChat(Socket c) {
		this.withServer = c;
		streamSet();
		

	}
	public void ClientChat(String id,String pwd) {
		this.id=id;
		this.pw=pwd;
	}

	private void receive() {
		// TODO Auto-generated method stub
		
	}

	private void send() {
		// TODO Auto-generated method stub
		
	}

	private void streamSet() {
		// TODO Auto-generated method stub
		try {
			new Login();
		//	System.out.println("receive start~~");
			sendMsg = withServer.getOutputStream();
			sendMsg.write(id.getBytes());
			sendMsg.write(pw.getBytes());

			reMsg = withServer.getInputStream();
			byte[] reBuffer = new byte[100];
			reMsg.read(reBuffer);
			String msg = new String(reBuffer);
			msg = msg.trim();
			System.out.println(msg);

		} catch (IOException e) {
			System.out.println("End");
		}

	}

}
