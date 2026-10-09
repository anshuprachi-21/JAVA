import java.io.*;
import java.util.*;
class A{
    void output(int n,int p){
        int v=n;
        for(int i=2;i<=p;i++){
            n=n*v;
        }
        System.out.println("The power of "+v+" is: "+n);
    }
}
class a1b11 {
    public static void main(String arg[]){
        int n,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        System.out.println("Enter the power:");
        p=sc.nextInt();
        A obj=new A();
        obj.output(n,p);
    }
}
