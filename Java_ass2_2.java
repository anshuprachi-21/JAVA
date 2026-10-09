import java.util.*;
import java.io.*;
class A{
    void output(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Password Conditions:");
        System.out.println("1. At least 4 characters");
        System.out.println("2. At least one numeric digit");
        System.out.println("3. At least one Capital Letter");
        System.out.println("4. Must not contain space or slash(/)");
        System.out.println("5. First character must not be a number");
        System.out.print("\nEnter Password: ");
        String pass = sc.nextLine();
        int capital = 0;
        int digit = 0;
        if(pass.length() < 4){
            System.out.println("Invalid Password");
            return;
        }
        if(Character.isDigit(pass.charAt(0))){

            System.out.println("Invalid Password");
            return;
        }
        for(int i=0; i<pass.length(); i++){
            char ch = pass.charAt(i);
            if(Character.isUpperCase(ch)){
                capital = 1;
            }
            if(Character.isDigit(ch)){
                digit = 1;
            }
            if(ch == ' ' || ch == '/'){

                System.out.println("Invalid Password");
                return;
            }
        }
        if(capital == 1 && digit == 1){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
public class Java_ass2_2{
    public static void main(String arg[]){
        A obj = new A();
        obj.output();
    }
}