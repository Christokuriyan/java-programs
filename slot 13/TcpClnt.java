//Write a program to implement one-one chatting using the TCP protocol.
//Client

package Network;
import java.io.*;
import java.net.*;

public class TcpClnt {

	public static void main(String[] args) {
		try
		{
		Socket s=new Socket("localhost",22334);
		System.out.println("Client waiting for connection");
		DataInputStream dis=new DataInputStream(System.in);
		DataInputStream sin=new DataInputStream(s.getInputStream()); 
		DataOutputStream sout=new DataOutputStream(s.getOutputStream());
		String str;
		while(true)
		{
		str=sin.readUTF();
		System.out.println("Server says :"+str);
		System.out.println("Enter data/bye for the server :");
		str=dis.readLine();
		sout.writeUTF(str);
		if(str.equals("bye"))
		break;
		}
		s.close();
		sout.close();
		}
		catch (Exception e)
		{
		System.out.println(e);
		}

	}

}
