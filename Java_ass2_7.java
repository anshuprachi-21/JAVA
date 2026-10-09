import java.util.*;
import java.io.*;

class A{
    void output(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int flag = 0;
        for(int i=0; i<str.length(); i++){

            for(int j=i+1; j<str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("All characters are unique");
        }
        else{
            System.out.println("String contains duplicate characters");
        }
    }
}
public class Java_ass2_7{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}
