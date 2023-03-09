//Write a menu driven program to demonstrate Random Access File handling, with options for creating, deleting, writing, appending and reading the file.

import java.io.*;
import java.lang.*;
import java.util.*;
class raf
{
public static void main(String args[])
{
String fname,fcon,name;
int ch=1;
try
{
Scanner console=new Scanner(System.in);
DataInputStream br=new DataInputStream(System.in);
System.out.println("The file is creating");
System.out.println("Enter the file name");
fname=console.nextLine();
RandomAccessFile f1=new RandomAccessFile("C:\\Users\\bitty\\Desktop\\JAVA"+fname+".txt","rw");
do {
System.out.println("1.writing\n2.appending\n3.reading");
System.out.println("Enter the choice:");
int c=Integer.parseInt(br.readLine());
switch(c)
{
case 1:System.out.println("Enter the elements into "+fname+" file");
fcon=console.nextLine();
f1.write(fcon.getBytes());
break;
case 2:f1.seek(f1.length());
System.out.println("Enter the elements into "+fname+" file");
fcon=console.nextLine();
f1.write(fcon.getBytes());
break;
case 3:f1.seek(0);
byte[] bytes=new byte[20];
f1.read(bytes);
System.out.println(new String(bytes));
}
System.out.println("Do you want to continue(1/0)");
ch=Integer.parseInt(br.readLine());
} while (ch==1);
f1.close();
}
catch(Exception e)
{
System.out.println("error"+e);
} }
}