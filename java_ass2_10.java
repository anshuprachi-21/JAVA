import java.util.*;
import java.io.*;

class A {
    void output() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        url = url.replace("https://", "");
        url = url.replace("http://", "");
        url = url.replace("www.", "");

        int pos = url.indexOf("/");
        String domain;

        if (pos != -1) {
            domain = url.substring(0, pos);
        } else {
            domain = url;
        }

        System.out.println("Domain: " + domain);
    }
}

public class java_ass2_10 {
    public static void main(String[] args) {
        A obj = new A();
        obj.output();
    }
}
