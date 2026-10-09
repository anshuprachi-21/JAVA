/*import java.io.*;
import java.util.*;
class A{
    void output(int n){
          int v=n;
          for(int i=1;i<=n;i++){
            int flag=0;
            if(n%i==0){
                flag=flag+1;
            }
            if(flag==2){

            }
          }
    }
}
class a1b13{
    public static void main(String arg[]){
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Enter a number:");
            n=sc.nextInt();
            A obj=new A();
            obj.output(n);
    }
}*/
import java.util.*;
class A{
    boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2)
            return true;
        else
            return false;
    }
    void output(int n){
        int found=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i) && isPrime(n-i)){
                System.out.println("Possible");
                System.out.println(n + " = " + i + " + " + (n-i));
                found=1;
            }
        }
        if(found==0){
            System.out.println("Not possible");
        }
    }
}
class a1b13{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        A obj=new A();
        obj.output(n);
    }
}
