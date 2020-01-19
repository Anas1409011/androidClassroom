
import java.util.Scanner;

public class NumberArray{

     public static void main(String []args){
        System.out.println("Hello. It is ready.");
        
        NumberArray p = new NumberArray();
        //p.ArrayPrint();
		//p.Operation();
		
		
		System.out.println("Which operation do you want to perform?");
		System.out.println("1. For Addition press + ");
		System.out.println("2. For Substraction press - ");
		System.out.println("3. For Multiplication press * ");
		System.out.println("4. For Division press / ");
		System.out.println();
		Scanner obj=new Scanner(System.in);
		String a[]= new String[10];
		//String b1= new String();
		//b1= obj.nextLine();
		String b1=obj.nextLine();
		String b2="+";
		String b3="-";
		String b4="*";
		String b5="/";
		
		//NumberArray c = new NumberArray();
		//System.out.println(b1);
		//System.out.println(b2);
		//System.out.println(b1==b2);

		if(b1.equals(b2)){
			p.Add();
		}
		else if(b1.equals(b3)){
			p.Substraction();
			}
		else if(b1.equals(b4)){
			p.Multiplication();
			}
		else if(b1.equals(b5)){
			p.Division();
			}
		else {
			System.out.println("Wrong Input!!!");
			}
		
		System.out.println();
		System.out.println("Thank you.");
		System.out.println();
     }
     public void ArrayPrint(){
        
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int arraysize= obj.nextInt();
		int a[] = new int[arraysize];
        System.out.println("Enter " +arraysize+ " numbers");
        for(int i=0;i<arraysize;i++){
            a[i]=obj.nextInt();    
        }
		System.out.println("Your array is: ");
		for(int i=0;i<arraysize;i++)
		System.out.println(a[i]);
     }
	 public void Add(){
		
		//NumberArray x = new NumberArray();
		//x.ArrayPrint();
		        
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int arraysize= obj.nextInt();
		int a[] = new int[arraysize];
		int i;
		int sum=0;
        System.out.println("Enter " +arraysize+ " numbers");
        for(i=0;i<arraysize;i++){
            a[i]=obj.nextInt();    
        }
		System.out.println("The array is: ");
		for(i=0;i<arraysize;i++)
		System.out.println(a[i]);
		
		for(i=0;i<arraysize;i++)
		sum=sum+a[i];
		System.out.println("Sum of the numbers is: "+ sum);
     }
	 
	  public void Multiplication(){
		        
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int arraysize= obj.nextInt();
		int a[] = new int[arraysize];
		int i;
		int multi=1;
        System.out.println("Enter " +arraysize+ " numbers");
        for(i=0;i<arraysize;i++){
            a[i]=obj.nextInt();    
        }
		System.out.println("The array is: ");
		for(i=0;i<arraysize;i++)
		System.out.println(a[i]);
		
		for(i=0;i<arraysize;i++)
		multi=multi*a[i];
		System.out.println("Multiplication of the numbers is: "+ multi);
     }
	 
	 	public void Substraction(){
		        
        Scanner obj=new Scanner(System.in);
		System.out.println("How many pair of numbers you want to input?");
		int pair= obj.nextInt();
		int a[] = new int[pair*2];
		int i;
		int sub=0;
        System.out.println("Enter " +pair*2+ " numbers");
        for(i=0;i<pair*2;i++){
            a[i]=obj.nextInt();    
        }
		System.out.println("The pair is: ");
		for(i=0;i<pair*2;i++){
		System.out.print(a[i]);
		if(i%2==0)System.out.print(", ");
		else System.out.print("; ");
		}
		System.out.println();
		System.out.println("The result is: ");
		for(i=0;i<pair*2;){
		sub=a[i]-a[i+1];
		System.out.println(a[i]+ " - "+ a[i+1]+ " = " +sub);
		i=i+2;
		}
		
     }
	 
	 public void Division(){
		        
        Scanner obj=new Scanner(System.in);
		System.out.println("How many pair of numbers you want to input?");
		int pair= obj.nextInt();
		int a[] = new int[pair*2];
		int i;
		int sub=0;
        System.out.println("Enter " +pair*2+ " numbers");
        for(i=0;i<pair*2;i++){
            a[i]=obj.nextInt();    
        }
		System.out.println("The pair is: ");
		for(i=0;i<pair*2;i++){
		System.out.print(a[i]);
		if(i%2==0)System.out.print(", ");
		else System.out.print("; ");
		}
		System.out.println();
		System.out.println("The result is: ");
		for(i=0;i<pair*2;){
			if(a[i+1]==0){
			System.out.println(a[i]+ " / "+ a[i+1]+ " = Undefine");
			i=i+2;
			break;
			}
			else{	
			sub=a[i]/a[i+1];
			System.out.println(a[i]+ " / "+ a[i+1]+ " = " +sub);
			i=i+2;
			}
		}
		
     }
	 public void Operation(){
		System.out.println("Which operation do you want to perform?");
		System.out.println("1. For Addition press 1 or + ");
		System.out.println("2. For Substraction press 2 or - ");
		System.out.println("3. For Multiplication press 3 or * ");
		System.out.println("4. For Division press 4 or / ");
		
		Scanner obj=new Scanner(System.in);
		String a[]= new String[10];
		String b= new String();
		b= obj.nextLine();
		NumberArray c = new NumberArray();
		
		if(b=="+"){
			c.Add();
		}
		else if(b=="-"){
			c.Substraction();
			}
		else if(b=="*"){
			c.Multiplication();
			}
		else if(b=="/"){
			c.Division();
			}
		else {
			System.out.println("Wrong Input!!!");
			}
		
		System.out.println("Thank you.");
	 }

}