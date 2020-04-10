package Client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Server.MemberDTO;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket withServer = null;

		withServer = new Socket("10.0.0.96", 9999);
		new ClientChat(withServer);
		
		
//		MemberDTO a= new MemberDTO("min","ddd","3333333*","2","4");
//		FileOutputStream faOut= new FileOutputStream("a.bin");
//		ObjectOutputStream osOut= new ObjectOutputStream(faOut);
//		osOut.writeObject(a);
//		osOut.close();
		
//		FileInputStream faIn= new FileInputStream("a.bin");
//		ObjectInputStream osIn= new ObjectInputStream(faIn);
//		
//		MemberDTO clone=(MemberDTO)osIn.readObject();
//		osIn.close();
//		System.out.println(clone.getId()+"\t"+clone.getName()+"\t"+clone.getPwd()+"\t"+clone.getAdr()+"\t"+clone.getCell());
	}

}
