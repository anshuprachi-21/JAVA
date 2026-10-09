import java.io.*;
import java.util.*;
class A{
    void output(){
        int sum=0;
        for(int i=100;i<=200;i++){
            if(i%7==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum is:"+sum);
      
    }
}
class a1b16{
    public static void main(String arg[]){
        A obj=new A();
        obj.output();
    }
}
