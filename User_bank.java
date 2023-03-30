package Assignment;

import java.util.Scanner;

public class User_bank extends Encapsulation_Demo{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		User_bank obj=new User_bank();
		obj.dip();

	}

	public void dip()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh amount");
		trans=sc.nextInt();
		setAc_bal(getAc_bal()+trans);
		
		System.out.println("The ac balance is ="+getAc_bal());
		
	}
}
