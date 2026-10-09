import java.util.*;
import java.io.*;

class A{

    void output(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        String longest = words[0];
        for(int i=1; i<words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        System.out.println("Longest Word: " + longest);
    }
}
public class Java_ass2_8{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}
