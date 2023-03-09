import java.io.*;
class test
{
    public void disprev(int n)
    {
        if(n>=1)
        {
            System.out.print(n+" ");
            disprev(n-1);
        }
        else
            return ;
    }
    public void disp(int n)
    {
        if(n>=1)
        {
            disp(n-1);
            System.out.print(n+" ");
        }
    }
}
public class DispNum
{
    public static void main(String args[])
    {
        try
        {
            DataInputStream dis=new DataInputStream(System.in);
            int num;
            test t=new test();
            System.out.println("Enter any number: ");
            num=Integer.parseInt(dis.readLine());
            System.out.println("Numbers from "+num+" to 1 are: ");
            t.disprev(num);
            System.out.println();
            System.out.println("Numbers from 1 to "+num+" are: ");
            t.disp(num);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}