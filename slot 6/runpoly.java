import java.io.*;
interface triar
{
    public void area(int a,int b);
}
class tri implements triar
{
    public void area(int b,int h)
    {
    double x=0.5*b*h;
    System.out.println("area:" +x);
    } 
}
class runpoly
{
    public static void main(String arr[])
    {
		try{
			DataInputStream br=new DataInputStream(System.in);
			System.out.print("Enter height and base:");
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			triar t=new tri();
			t.area(a,b);
		}catch(Exception e){System.out.println(e);}
    } 
}