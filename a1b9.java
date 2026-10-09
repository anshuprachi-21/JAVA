import java.io.*;
import java.util.*;
class A{
    void output(int n){
        double sum=0;
        
        for(int i=1;i<=n;i++){
            int fac=1;
            for(int j=1;j<=i;j++){
                fac=fac*j;
            }
            sum=sum +(1.0/fac);
        }
    System.out.println("The sum of the sequence is:"+sum);
    }
}
class a1b9 {
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of term u want: ");
        n=sc.nextInt();
        A obj=new A();
        obj.output(n);
    }
}
