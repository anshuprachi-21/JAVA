// GCD OF TWO NUMBER 

import java.io.*;
import java.util.*;
class A{
    void output(int a,int b){
     int v1=a,v2=b;   
     while(b!=0){
        int r=a%b;
        a=b;
        b=r;
     }
     System.out.println("The GCD of :"+v1+" and "+v2+" is: "+a);
    }
}
class a1b8 {
    public static void main(String arg[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enyter a number:");
        a=sc.nextInt();
        System.out.println("Enter another number:");
        b=sc.nextInt();
        A obj=new A();
        obj.output(a,b);
    }
}
