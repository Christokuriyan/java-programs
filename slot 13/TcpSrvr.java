//Write a program to implement one-one chatting using the TCP protocol.
//Server

package Network;
import java.io.*;
import java.net.*;

public class TcpSrvr {

	public static void main(String[] args) {
		try
		{
		ServerSocket ss=new ServerSocket(22334);
		System.out.println("Server is waiting for connection");
		Socket s=ss.accept();
		System.out.println("Conection made");
		DataInputStream din=new DataInputStream(System.in);
		DataInputStream sin=new DataInputStream(s.getInputStream());
		DataOutputStream sout=new DataOutputStream(s.getOutputStream());
		String str;
		sout.writeUTF("Welcome");
		while(true)
		{
		str=sin.readUTF();
		System.out.println("Client says :"+str);
		if(str.equals("bye"))
		break;
		System.out.println("Enter data for the client :");
		str=din.readLine();
		sout.writeUTF(str);
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
