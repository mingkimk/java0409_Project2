package Server;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverS=null; // ������ ��ٸ�
		Socket withClient=null; 
		//����ϱ� ���� �ڿ�
		
		serverS= new ServerSocket();
		serverS.bind(new InetSocketAddress("10.0.0.96",9999)); //���ε�
		
		ArrayList<Socket>cList= new ArrayList<>(); // �����
	//	ServerCenter sc = new ServerCenter();
		
		while(true) {
		System.out.println("���� �����");
		withClient=serverS.accept(); 
		// Ŭ���̾�Ʈ ���  socket�� ����   withClient�� ��Ĺ  Ŭ���̾�Ʈ�� ��� �ϴ� ��Ĺ �������
		cList.add(withClient);
		System.out.println(cList);
		System.out.println(withClient.getInetAddress()+"Ŭ���̾�Ʈ ���� ��");
	//	ServerChat s=new ServerChat(withClient,sc);
	//	sc.addServaerChat(s);
	//	s.start();
	}

}
	
}	
//	public static void main(String[] args) throws Exception{
//		ServerSocket serverS = null;
//		Socket withClient = null;
//		serverS = new ServerSocket();
//		serverS.bind(new InetSocketAddress("10.0.0.127",9999));
//		
//		ArrayList<Socket> cList = new ArrayList<>();
//		//ServerCenter sc = new ServerCenter();
//		while(true) {
//			System.out.println("���� �����");
//			withClient = serverS.accept();
//			cList.add(withClient);
//			System.out.println(cList);
//			System.out.println(withClient.getInetAddress()+"���� ������.");
//			ServerChat s =new ServerChat(withClient);
//			//sc.addServerChat(s);
//			s.start();
//		
//		}
//	}
//
//}

