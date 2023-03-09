import java.io.*;
class test
{
    public void sum(int n)
    {
        int i=1,j,sum=0;
        while(i<=n)
        {
            j=(i*(i+1))/2;
            sum=sum+j;
            i=i+1;
        }
        System.out.println("Sum of the series = "+sum);
    }
}
public class SeriesSum
{
    public static void main(String[] args) {
        try
        {
            System.out.println("Sum of the series 1+(1+2)+(1+2+3)+........+(1+2+3+......+n) ");
            DataInputStream dis=new DataInputStream(System.in);
            int n;
            System.out.println("Enter N:");
            n=Integer.parseInt(dis.readLine());
            test t=new test();
            t.sum(n);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}