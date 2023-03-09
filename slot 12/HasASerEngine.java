//3.Write a program to implement HAS-A Serialization and De-Serialization for the Engine of a Vehicle.
import java.io.*;

public class HasASerEngine
{
    public static void main (String args[])
    {
        HasEngine en = new HasEngine("Automatic");
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\bitty\\Desktop\\JAVA\\slot 12\\hasas.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fout);
            oos.writeObject(en);//write
            System.out.println("HAS A Serialization happened");
        }
        catch(IOException e){System.out.println(e);}
    }
}