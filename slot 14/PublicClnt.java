//Write a program to implement public chatting
//Client

package Network;
import java.io.*;
import java.net.*;

public class PublicClnt {

	public static void main(String[] args) {
		try
		{
		Socket cs=new Socket("localhost",454);
		System.out.println("This is alice");
		DataInputStream kin=new DataInputStream(System.in);
		DataInputStream sin=new DataInputStream(cs.getInputStream());
		DataOutputStream sout=new
		DataOutputStream(cs.getOutputStream());
		String str;
		while(true)
		{
		str=sin.readUTF();
		System.out.println("Bob says :"+str);
		System.out.println("Enter data/bye: ");
		str=kin.readLine();
		sout.writeUTF(str);
		if(str.equals("bye"))
		break;
		}
		cs.close();
		sout.close();
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
	}

}
