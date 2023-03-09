//Create a class for Cstring having a string data member and provide functions for read , display, compare(return Boolean value),add and concatenate.

import java.io.*;
import java.util.Scanner;
import java.lang.*;
class cstring
{
static void display(String n1,String n2)
{
System.out.println("n1="+n1);
System.out.println("n2="+n2);
}
static void compare(String n1,String n2)
{
System.out.println(n1==n2);
}
static void add(String n1,String n2)
{
 System.out.println(n1+n2);
}
static void concatenate(String n1,String n2)
{
System.out.println(n1.concat(n2));
}
public static void main(String args[])
{
try
{
String n1,n2;
int c,ch=1;
DataInputStream dir=new DataInputStream(System.in);
Scanner console=new Scanner(System.in);
System.out.println("first string :");
n1=console.nextLine();
System.out.println("second string :");
n2=console.nextLine();
do
{
System.out.println("1.display\n2.compare\n3.add\n4.concatenate\n");
c=Integer.parseInt(dir.readLine());
switch(c)
{
case 1:display(n1,n2);
break;
case 2:compare(n1,n2);
break;
case 3:add(n1,n2);
break;
case 4:concatenate(n1,n2);
break;
}
System.out.println("do you want to continue(1/0)");
ch=Integer.parseInt(dir.readLine());
}while(ch==1);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}
