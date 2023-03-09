//Write a program to implement connection less communication.
//Client

package Network;
import java.net.*;

public class UdpClnt {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket();
			int i=20;
			byte[] b=String.valueOf(i).getBytes();
			InetAddress ilh=InetAddress.getLocalHost();
			DatagramPacket dp=new
			DatagramPacket(b,b.length,ilh,1234);
			ds.send(dp);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
	}

}
