//Write a program to display the contents of a directory by displaying the subdirectory’s name first, then the file names.

import java.io.*;
import java.lang.*;
class Direc1
{
 public static void main(String args[])
 {
 try
 {
 int i,j=0;
 File subf=new File("E:\\");
 String a[]=subf.list();
 String b[]=subf.list();
 for(i=0;i<a.length;i++)
 {
 subf=new File("E:\\"+a[i]);
 if(subf.isDirectory())
 {
 System.out.println("Directory: "+a[i]);
 }
 else
 {
 b[j]=a[i];
 j=j+1;
 }
 }
 for(i=0;i<a.length;i++)
 {
 System.out.println("File: "+b[i]);
 }
 }
 catch(Exception e){System.out.println(e);}
}
}
