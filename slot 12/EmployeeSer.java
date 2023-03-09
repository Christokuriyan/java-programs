//Write a program to Serialize/De-Serialize selected attributes of an Employee.

import java.io.*;
public class EmployeeSer
{
public static void main(String args[])
{
 Employee s=new Employee("Bitty",21,101);
 try
 {
 FileOutputStream fout=new FileOutputStream("C:\\Users\\bitty\\Desktop\\JAVA\\slot 12\\emp.txt");
 ObjectOutputStream out=new ObjectOutputStream(fout);
 out.writeObject(s);
 out.close();
 fout.close();
 }
 catch(IOException e)
 {
 System.out.println(e);
 }
}
}

