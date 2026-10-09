import java.util.*;
import java.io.*;

class A{

    void output(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        String title = "";
        for(int i=0; i<words.length; i++){

            String first = words[i].substring(0,1).toUpperCase();

            String rest = words[i].substring(1).toLowerCase();

            title = title + first + rest + " ";
        }
        System.out.println("Title Case: " + title);
    }
}
public class Java_ass2_9{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}
