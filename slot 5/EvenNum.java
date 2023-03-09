import java.io.*;
import java.util.*;

class Even{
    static int i=1;
    public static void EvenChecker(int n){
        
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+":Even Number");
            }
        }
    }
}

class EvenNum{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=sc.nextInt();
        Even e = new Even();
        e.EvenChecker(n);
    }
}