import java.io.*;
public class ArraySearch
{
	public static void main(String args[])
	{
		try
		{
			int a[],n,i,key,flag=0;
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter n:");
			n=Integer.parseInt(dis.readLine());
			a=new int[n];	
			System.out.println("Enter array elements:");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(dis.readLine());
			}
			System.out.println("Array elements:");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
            System.out.println();
			System.out.println("Enter the element to search: ");
			key=Integer.parseInt(dis.readLine());
			for(i=0;i<n;i++)
			{
				if(a[i]==key)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("Element is found at position: "+(i+1));
			}
			else
			{
				System.out.println("Element not found");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}