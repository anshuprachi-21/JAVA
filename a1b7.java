import java.io.*;
import java.util.*;
class A{
    void output(int n){
       int a=2,b=1;
       for(int i=1;i<=n;i++){
        System.out.print(a+","+b+",");
        a=a+2;
        b=b*(i+1);
       }
    }
}

class a1b7 {
    public static void main(String arg[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit for the sequence:");
        a=sc.nextInt();
        A obj =new A();
        obj.output(a);
    }
}
