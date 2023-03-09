import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

class Stackclass
{
    int top=-1;
    int a[];
    Stackclass()
    {
        a= new int[10];
    }
    public void push(int val)
    {
        if(top==9)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top=top+1;
            a[top]=val;
            System.out.println("Value pushed");
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println(a[top]+" is popped");
            top=top-1;
        }
    }
    public void display()
    {
        int i;
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Elements in the Stack: ");
            for(i=top;i>=0;i--)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
     }
}
class Stack
{
    public static void main(String args[])
    {
        Stackclass s= new Stackclass();
        DataInputStream dis=new DataInputStream(System.in);
        int key=0;
        while(key!=4)
        {
            try
            {
                System.out.println("Stack Operations");
                System.out.println("****************");
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Display");
                System.out.println("4.Exit");
                System.out.println("Enter your choice: ");
                key=Integer.parseInt(dis.readLine());
                switch (key) 
                {
                    case 1:
                            System.out.println("Enter the value to push");
                            int num= Integer.parseInt(dis.readLine());
                            s.push(num);
                            break;
                    case 2:
                            s.pop();
                            break;
                    case 3:
                            s.display();
                            break;
                    case 4:
                            break;        
                    default:
                            System.out.println("Invalid choice!!");
                            break;
                }
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
    }
}
