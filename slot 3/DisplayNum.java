import java.io.*;
class test
{
    public void disp(int x,int y)
    {
        System.out.println("Numbers from "+x+" to "+y+" are:");
        while(x!=y)
        {
            System.out.print(x+" ");
            x=(x<y)?x+1:x-1;
        }
        System.out.print(x+" ");
    }
}
public class DisplayNum
{
    public static void main(String[] args) {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int m,n;
            System.out.println("Enter value for M:");
            m=Integer.parseInt(dis.readLine());
            System.out.println("Enter value for N:");
            n=Integer.parseInt(dis.readLine());
            test t=new test();
            t.disp(m,n);
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}