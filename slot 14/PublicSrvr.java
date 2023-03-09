////Write a program to implement public chatting
//Server

package Network;
import java.io.*;
import java.net.*;

public class PublicSrvr {

	public static void main(String[] args) {
		try
		{

		ServerSocket ss=new ServerSocket(454);
		System.out.println("This is bob ");
		Socket as=ss.accept();
		System.out.println("Conection made");
		DataInputStream din=new DataInputStream(System.in);
		DataInputStream sin=new
		DataInputStream(as.getInputStream());
		DataOutputStream sout=new
		DataOutputStream(as.getOutputStream());
		String str;
		sout.writeUTF("Welcome");
		while(true)
		{
		str=sin.readUTF();
		System.out.println("Alice says :"+str);
		if(str.equals("bye"))
		break;
		System.out.println("Enter data:");
		str=din.readLine();
		sout.writeUTF(str);
		}
		as.close();
		sout.close();
		}
		catch (Exception e)
		{
		System.out.println(e);
		}


	}

}
