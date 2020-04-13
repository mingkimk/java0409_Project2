package Server;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverS=null; // 서버를 기다림
		Socket withClient=null; 
		//통신하기 위한 자원
		
		serverS= new ServerSocket();
		serverS.bind(new InetSocketAddress("10.0.0.96",9999)); //바인딩
		
		ArrayList<Socket>cList= new ArrayList<>(); // 저장용
	//	ServerCenter sc = new ServerCenter();
		
		while(true) {
		System.out.println("서버 대기중");
		withClient=serverS.accept(); 
		// 클라이언트 대기  socket을 리턴   withClient이 소캣  클라이언트랑 통신 하는 소캣 만들어줌
		cList.add(withClient);
		System.out.println(cList);
		System.out.println(withClient.getInetAddress()+"클라이언트 접속 함");
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
//			System.out.println("서버 대기중");
//			withClient = serverS.accept();
//			cList.add(withClient);
//			System.out.println(cList);
//			System.out.println(withClient.getInetAddress()+"님이 접속함.");
//			ServerChat s =new ServerChat(withClient);
//			//sc.addServerChat(s);
//			s.start();
//		
//		}
//	}
//
//}

