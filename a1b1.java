// WRITE A JAVA PROGRAM TO PRINT FIRST 10 NUMBERS IN FIBONACCI SEQUENCE.ALSO PRINT THE SUM OF THE NUMBERS
import java.io.*;
import java.util.*;
class fibonacci {
    int a=0,b=1,c=0,sum=0;
    void fibo(int x){
    System.out.print("The fibonacci is:");
    for(int i=1;i<=x;i++)
{
    
    System.out.print(a+" ");
    sum=sum+a;
    c=a+b;
    a=b;
    b=c;
    
    
}  
System.out.println("\nThe sum is:"+sum);

    }
}

class a1b1{
	public static void main(String args[]){
        fibonacci obj=new fibonacci();
        obj.fibo(10);
    }
		}
