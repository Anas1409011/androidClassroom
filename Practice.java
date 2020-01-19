
import java.util.Scanner;

public class Practice{

     public static void main(String []args){
        System.out.println("Hello World");
        
        Practice p = new Practice();
        p.ArrayPrint();
     }
     public void ArrayPrint(){
        
        Scanner obj=new Scanner(System.in);
          //int a[] = new int[5];
        //String n=obj.nextString();
          String a[] = new String[20];
          
        //String []a={"a","b","5","d","e"};
          System.out.println("Enter Array size: ");
          int n = obj.nextInt();
		  int i;
        System.out.println("Enter " +n+ " elements");
        for(i=0;i<=n;){
			System.out.println(i);
            a[i]=obj.nextLine();
			System.out.println(i);
			i++;
            System.out.println(i);
        }
	System.out.println("Your array is: ");
	for(i=1;i<=n;i++){
	System.out.println(a[i]);	
	System.out.println(i);
	}
	System.out.println();
	System.out.println("*"+a[0]+"*");System.out.println("*"+a[1]+"*");System.out.println("*"+a[2]+"*");
    }
}