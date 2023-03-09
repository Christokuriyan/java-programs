
//2.Write a program to implement IS-A Serialization and De-Serialization, for a Maruti Car inherited from Vehicle
import java.io.*;

public class ISASerMaruti
{
    public static void main (String args[])
    {
        Maruti m = new Maruti("Brezza","Automatic","Petrol");
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\bitty\\Desktop\\JAVA\\slot 12\\ismaruti.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fout);
            oos.writeObject(m);//write
            System.out.println("ISA Serialization happened");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}