
import java.util.Scanner;

public class NumberArray{

     public static void main(String []args){
        System.out.println("Hello World");
        
        NumberArray p = new NumberArray();
        p.ArrayPrint();
     }
     public void ArrayPrint(){
        
        Scanner obj=new Scanner(System.in);
          int a[] = new int[5];
        //String n=obj.nextString();
        //String a[] = new String();
        //String []a={"a","b","5","d","e"};
          System.out.println("Enter Array size: ");
          int n = obj.nextInt();
        System.out.println("Enter" +n+ "numbers");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
            
        }
	System.out.println("Your array is: ");
	for(int i=0;i<n;i++)
	System.out.println(a[i]);
     }
}