import java.io.*;
import java.util.*;
class prime {
	int n;
      
  	 void cal(int n){
    
      for (int i=2; i<=n;i++){
	int flag=0;
       for (int j=1;j<=i;j++){
     		if(i%j==0){
                   flag=flag+1;
           	  }
	}
       if(flag==2){
       System.out.println(i);

	}
    
	}  

    }
}

class a1b3{
	public static void main (String a[]){
	  
	prime obj =new prime();
	obj.cal(1000);
  	
		}
}
	
		