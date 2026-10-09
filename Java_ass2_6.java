import java.util.*;
import java.io.*;

class A{

    void output(){

        Scanner sc = new Scanner(System.in);

        String badWords[] = {"bad", "ugly", "stupid"};

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        for(int i=0; i<badWords.length; i++){

            text = text.replace(badWords[i], "***");
        }
        System.out.println("Filtered Text: " + text);
    }
}
public class Java_ass2_6{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}
