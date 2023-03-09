import java.io.*;
import java.util.*;
class person{
    String personName,address;
    public void  read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        personName=sc.nextLine();
        System.out.println("Enter the Address:");
        address=sc.nextLine();
    }

    public void dispDetails(){
            System.out.println("Name: "+personName);
            System.out.println("Address:"+address);
    }
}
class Student extends person{
    int rno=0;
    String name,address;
    public void read(){     //MethodOverriding
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Roll No:");
        rno=sc.nextInt();
        System.out.println("Enter the Student Name:");
        name=sc.nextLine();
        name=sc.nextLine();
        System.out.println("Enter the Address:");
        address=sc.nextLine();
        System.out.println("\n");
    }
    public void dispDetails(){
        System.out.println("Student RollNo: "+rno);
        System.out.println("Student Name: "+name);
        System.out.println("Student Address:"+address+"\n\n");
    }
}
class Teacher extends person{
int tid=0;
String tname,taddress;    
    public void read(){     //MethodOverriding
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Teacher Id:");
        tid=sc.nextInt();
        System.out.println("Enter the Teacher Name:");
        sc.nextLine();
        tname=sc.nextLine();
        System.out.println("Enter the Address:");
        taddress=sc.nextLine();
    }
    public void dispDetails(){
        System.out.println("Teacher Id: "+tid);
        System.out.println("Teacher Name: "+tname);
        System.out.println("Teacher Address:"+taddress+"\n\n");
    }
}


class FunctionOverriding{
    public static void main(String args[]){
        int ch;
        Student s = new Student();
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Read Student Details\n2.Display Student Details\n3.Read Teacher details\n4.Display Teacher details\n5.Exit\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:     
                    s.read();
                    break;
                case 2:
                    if(s.rno==0){
                        System.out.println("Empty list");
                    }
                    else{
                        s.dispDetails();
                    }
                    break;
                case 3:
                    t.read();
                    break;
                case 4:
                    if(t.tid==0){
                        System.out.println("Empty list");
                    }
                    else{
                        t.dispDetails();
                    }
                    break;            
            }
        }while(ch!=5);
    }
}