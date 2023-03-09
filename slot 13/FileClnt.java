//Write a program to accept a file name given in the client, and to download the content from the server side.
//Client

package Network;
import java.io.*;
import java.net.*;

public class FileClnt {

	public static void main(String[] args) {
		try
		{
		Socket s = new Socket("localhost",123);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter name of the file to download: ");
		String str = dis.readLine();
		DataOutputStream sout = new DataOutputStream(s.getOutputStream());
		sout.writeUTF(str);
		dis.close();
		sout.close();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}

}
