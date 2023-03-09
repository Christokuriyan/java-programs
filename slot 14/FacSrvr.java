//Accept a number from the client, and print its factorial in the server.
//Server

package Network;
import java.io.*;
import java.net.*;
public class FacSrvr {

	public static void main(String[] args) {
		try
		 {
		ServerSocket ss=new ServerSocket(124);
		System.out.println("connecting...");
		Socket s=ss.accept();
		System.out.println("connected");
		ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
		String str=(String)ois.readUTF();
		System.out.println("Received Number From Client : " + str);
		 int num=Integer.parseInt(str);
		 int r=1;
		 while(num>0)
		 {
		 r=r*num;
		 num=num-1;
		 }
		 System.out.println("factorial is: "+r);
		 }
		 catch(Exception e)
		 {
		 System.out.println("error: "+e);
		 }


	}

}
