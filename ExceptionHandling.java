package exceptionHandling;

import java.util.Scanner;


public class ExceptionHandling{


//-----------------THROW,CATCH,FINALLY------------

	public static void main(String[] args) 
	{
	
		demo();
		
	}
	public static void demo()
	{
		int num1,num2,res;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		try
		{
			res=num1+num2;
			System.out.println("Add is ="+res);
			res=num1-num2;
			System.out.println("Sub is ="+res);

			res=num1%num2;
			System.out.println("Mod is ="+res);
			res=num1*num2;
		
			System.out.println("Mul is ="+res);
			res=num1/num2;
			System.out.println("Div is ="+res);
			
			int arr[]=new int[5];
			arr[5]=56;
			System.out.println("The value of array is ="+arr[5]);
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("The size of the array is not proper.\n we cannot user the extra size if it is defined.");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("The second number cannot be ZERO.");
		}
		catch(Exception e)
		{
			System.out.println("EXP . :)");
		}
		
		finally 
		{
			System.out.println("Hiiiiiiiiiiiiiiiiiii");
		}
		
		
	}

}

//----------------------------------------------------------

/*{

public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	
	int num1,num2,res;
	Scanner sc=new  Scanner(System.in);
	System.out.println("Enter two numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	res=num1+num2;
	System.out.println("Add is ="+res);
	res=num1-num2;
	System.out.println("Sub is ="+res);
	res=num1%num2;
	System.out.println("Mod is ="+res);
	res=num1*num2;
	System.out.println("Mul is ="+res);
	res=num1/num2;
	System.out.println("Div is ="+res);


}

}*/






//-----------------------TRY,CATCH-------------------------

/*{

public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	demo();

}


public static void demo()
{
	int num1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	num1=sc.nextInt();
	try
	{
		if(num1%2==0)
		{
			throw new ArithmeticException("It is Even NUmber");
		}
		else
		{
			throw new ArithmeticException("It is Odd NUmber");
		}
	}
	catch(Exception e)
	{
		System.out.println("Msg="+e.getMessage());
	}
}

}*/

