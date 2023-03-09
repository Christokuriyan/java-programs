////Write a program to implement connection less communication.
//Client

package Network;
import java.net.*;

public class UdpSrvr {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(1234);
			byte[] b1=new byte[1024];
			DatagramPacket dp=new DatagramPacket(b1,b1.length);
			ds.receive(dp);
			String str=new String(dp.getData());
			int i=Integer.parseInt(str.trim());
			System.out.println("the num is : "+i);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}	
	}

}
