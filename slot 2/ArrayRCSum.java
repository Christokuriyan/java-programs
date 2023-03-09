import java.io.*;
public class ArrayRCSum
{
	public static void main(String args[])
	{
		try
		{
			int a[][],row[],col[],m,n,i,j,rowsum,colsum;
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter the dimensions of 2D array:");
			m=Integer.parseInt(dis.readLine());
			n=Integer.parseInt(dis.readLine());
			a=new int[m][n];	
            row=new int[m];
            col=new int [n];
			System.out.println("Enter 2D array elements:");
			for(i=0;i<m;i++)
			{
                rowsum=0;
				for(j=0;j<n;j++)
				{
					a[i][j]=Integer.parseInt(dis.readLine());
					rowsum+=a[i][j];
				}
				row[i]=rowsum;
			}
			for(j=0;j<n;j++)
			{
                colsum=0;
				for(i=0;i<m;i++)
				{
					colsum+=a[i][j];
				}
				col[j]=colsum;
			}
			System.out.println("2D Array elements with their respective row-wise sum and column wise sum:");
			System.out.println();
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.print("| "+row[i]);
				System.out.println();
			}
			System.out.println("_____");
			for(j=0;j<n;j++)
			{
				System.out.print(col[j]+" ");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}