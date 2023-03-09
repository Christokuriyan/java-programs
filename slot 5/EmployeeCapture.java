import java.io.*;
import java.util.*;

class Employee{
int eNo[] =new int[10];
String eName[]=new String[10];
double eSal[]=new double[10];
Scanner sc = new Scanner(System.in);
public void dispEmployee(int n){
    int i;
    for(i=0;i<n;i++){
        System.out.println("Empolyee Number:"+eNo[i]);

        System.out.println("Empolyee Name:"+eName[i]);
        
        System.out.println("Empolyee Salary:"+eSal[i]+"\n");       
    }
}

}
class EmployeeCapture{
    public static void main(String args[]){
        int ch,n=-1;
        Scanner sc = new Scanner(System.in);
        Employee  e = new Employee();
        do{
            System.out.println("\n1.Read Employee Details\n2.Display Employee\n5.Exit\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the no of Employees to be captured:");
                    n=sc.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("Enter the Empolyee Number:");
                        e.eNo[i]=sc.nextInt();
                        System.out.println("Enter the Empolyee Name:");
                        e.eName[i]=sc.nextLine();
                        e.eName[i]=sc.nextLine(); 
                        System.out.println("Enter the Empolyee Salary:");
                        e.eSal[i]=sc.nextDouble();        
                    }
                    break;
                case 2:
                    if(n==-1){
                        System.out.println("Empty File!");
                    }
                    else{
                        e.dispEmployee(n);
                    }
                    break;
            }

        }while(ch!=5);
    }
}