import java.io.*;
import java.util.*;
class A{
    void output(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
        fac=fac*i;
        }
    System.out.println("The factorial of "+n+" is: "+fac);

    }
}

class a1b6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        A obj=new A();
        obj.output(a);
    }
    
}
