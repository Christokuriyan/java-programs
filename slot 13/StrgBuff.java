//Write a program to implement various methods of a StringBuffer class

package Network;
import java.io.*;

public class StrgBuff {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello"); 
		System.out.println(sb.capacity());
		sb.append(" Bitty");
		System.out.println(sb);
		System.out.println(sb.capacity()); 
		sb.append(" Shatto"); 
		System.out.println(sb.capacity());
		sb.insert(5,"--Java--");
		System.out.println(sb);
		sb.replace(1,3,"Java"); 
		System.out.println(sb);
		sb.delete(0,3); 
		System.out.println(sb);
		sb.reverse(); 
		System.out.println(sb);

	}

}
