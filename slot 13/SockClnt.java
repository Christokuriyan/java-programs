//Write a program to implement communication between a client and server client, via Socket Programming.

package Network;
import java.io.*;
import java.net.*;

public class SockClnt {

	public static void main(String[] args) {
		try
		 {
		Socket s=new Socket("localhost",12347);
		ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
		oos.writeUTF("HELLO");
		oos.close();
		s.close();
		 }
		 catch(Exception e)
		 {
		 System.out.println("error: "+e);
		 }

	}

}
