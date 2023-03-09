//Write a program to implement communication between a client and server client, via Socket Programming.
//Server

package Network;
import java.io.*;
import java.net.*;

public class SockSrvr {

	public static void main(String[] args) {
		try
		 {
		ServerSocket ss=new ServerSocket(12347);
		System.out.println("waiting...");
		Socket s=ss.accept();
		System.out.println("made connection with client");
		ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
		String str=(String)ois.readUTF();
		System.out.println("message is: "+str);
		ois.close();
		ss.close();
		s.close();
		 }
		 catch(Exception e)
		 {
		 System.out.println("error: "+e);
		 }


	}

}
