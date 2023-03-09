import java.io.*;
public class SingleLineMinThree
{
    public static void main(String[] args) {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int x,y,z,min;
            System.out.println("Enter X:");
            x=Integer.parseInt(dis.readLine());
            System.out.println("Enter Y:");
            y=Integer.parseInt(dis.readLine());
            System.out.println("Enter Z:");
            z=Integer.parseInt(dis.readLine());
            min=((x<y)&&(x<z))?x:((y<z)?y:z);
            
            System.out.println("Minimum of "+x+" "+y+" and "+z+" is "+min);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}