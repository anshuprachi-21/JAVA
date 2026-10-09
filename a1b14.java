// PALINDROM OR NOT
import java.io.*;
import java.util.*;
class A{
    void output(int n){
        int v=n,r=0;
        while(n!=0){
            int m=n%10;
            r=(r*10)+m;
            n=n/10;
        }
        if(v==r){
            System.out.println("The number is palindrom");
        }
        else{
            System.out.println("Not palindrom");
        }
    }

}
class a1b14{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enteer a number to check palindrom or not:");
        n=sc.nextInt();
        A obj=new A();
        obj.output(n);
    }
}