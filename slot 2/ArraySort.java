import java.io.*;
public class ArraySort
{
	public static void main(String args[])
	{
		try
		{
			int a[],n,i,j,temp;
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter n:");
			n=Integer.parseInt(dis.readLine());
			a=new int[n];	
			System.out.println("Enter array elements:");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(dis.readLine());
			}
			System.out.println("Array elements before sorting:");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			for(i=0;i<n-1;i++)
			{
				for(j=0;j<n-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			System.out.println();
			System.out.println("Array elements after sorting: ");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}