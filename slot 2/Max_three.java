import java.io.*;
public class Max_three
{
    public static void main(String[] args) {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int x,y,z,max;
            System.out.println("Enter X:");
            x=Integer.parseInt(dis.readLine());
            System.out.println("Enter Y:");
            y=Integer.parseInt(dis.readLine());
            System.out.println("Enter Z:");
            z=Integer.parseInt(dis.readLine());
            if ((x>y)&&(x>z))
                max=x;
            else if(y>z)
                max=y;
            else
                max=z;
            System.out.println("Maximum of "+x+" "+y+" and "+z+" is "+max);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}