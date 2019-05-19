package javaInterview_Naveen;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int temp=num;
		int cube=0, rem;//rem is remainder
		
		while(temp>0)
		{
			rem=temp%10;
			cube=cube+(rem*rem*rem);
			temp=temp/10;
		}
		
		System.out.println(temp);
		if(cube==num)
		{
			System.out.println("Number is Armstronhg");
		}
		else
		{
			System.out.println("Number is NOT Armstronhg");
		}
	}

}
