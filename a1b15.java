import java.io.*;
import java.util.*;
class A{
    void output(){

        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println("Random number is: " + num);
        
    }
}
class a1b15{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        A obj=new A();
        obj.output();

    }
}
