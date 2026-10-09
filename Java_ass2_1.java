import java.util.*;
import java.io.*;
class A{
    void output(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String strs[] = new String[n];
        System.out.println("Enter strings:");
        for(int i=0; i<n; i++){
            strs[i] = sc.next();
        }
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("No Common Prefix");
                    return;
                }
            }
        }
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
public class Java_ass2_1{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}
