import java.util.*;
import java.io.*;
class A{
    void permutation(String str, String ans){
        if(str.length() == 0){
          System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String remaining = left + right;
            permutation(remaining, ans + ch);
        }
    }
    void output(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Permutations are:");
        permutation(str, "");
    }
}
public class Java_ass2_4{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}
