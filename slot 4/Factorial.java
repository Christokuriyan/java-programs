import java.io.*;
class test
{
    public int fact(int n)
    {
        if (n>1)
        {
            return n*fact(n-1);
        }

        else
            return 1;
    }
}
public class Factorial
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
            int res=t.fact(num);
            System.out.println("Factorial of "+num+" = "+res);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}