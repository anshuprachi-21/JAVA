// FACTOR OF A NUMBER
import java.io.*;
import java.util.*;
class A{
    void output(int n){
        System.out.print("The factors of "+n+" is: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }

    }
}
class a1b12{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number to checks the factors of the number:");
        n=sc.nextInt();
        A obj=new A();
        obj.output(n);
    }
}