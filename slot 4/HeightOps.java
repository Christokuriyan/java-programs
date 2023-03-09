import java.io.*;
class Height
{
    int foot;
    int inch;
    void read(){

        DataInputStream din= new DataInputStream(System.in);

        try{
            System.out.println("Enter the foot part of height:");
            foot=Integer.parseInt(din.readLine());
            System.out.println("Enter the inch part of height:");
            inch=Integer.parseInt(din.readLine());            
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }

    }
    void disp(){
        System.out.println("Height is:"+foot+" foot "+inch+"inches");
    }
    void add(Height h2)
    {
        int rem;
        Height h=new Height();
        h.foot=this.foot+h2.foot;
        if((this.inch+h2.inch)>12)
        {
            rem=(this.inch+h2.inch)/12;
            h.foot=h.foot+(int)(rem);
        }
        h.inch=(this.inch+h2.inch)%12;
        System.out.println("Sum of two heights :"+h.foot+" foot "+h.inch+" inches");
    }
    void mul(Height h2)
    {
        int rem;
        Height h=new Height();
        h.foot=this.foot*h2.foot;
        if((this.inch*h2.inch)>12)
        {
            rem=(this.inch*h2.inch)/12;
            h.foot=h.foot+(int)(rem);
        }
        h.inch=(this.inch*h2.inch)%12;
        System.out.println("Product of two heights :"+h.foot+" foot "+h.inch+" inches");
    }
}
public class HeightOps
{
    public static void main(String[] args) {
        Height h1 = new Height();
        h1.read();
        h1.disp();
        Height h2 = new Height();
        h2.read();
        h2.disp();

        h1.add(h2);
        h1.mul(h2);
    }
}