import java.io.*;
import java.util.*;
    
class A{
   void output(int n){
    int a=0,b=1,c=0,d=-1;
    for(int i=0;i<=n;i++){
        System.out.print(a+","+d+",");
        c=a+b;
        a=b;
        b=c;
        d=d-3;

    }


   }
}
class a1b5{
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit for the sequence:");
        a=sc.nextInt();
        A obj=new A();
        obj.output(a);
    }
}