import java.io.*;
public class Swap
{
    public static void main(String[] args) {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int x,y,z;
            System.out.println("Enter X:");
            x=Integer.parseInt(dis.readLine());
            System.out.println("Enter Y:");
            y=Integer.parseInt(dis.readLine());
            System.out.println("Before swapping......");
            System.out.println("X="+x);
            System.out.println("Y="+y);
            z=x;
            x=y;
            y=z;
            System.out.println("After swapping......");
            System.out.println("X="+x);
            System.out.println("Y="+y);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}