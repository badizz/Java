package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 
{
	public static void main (String [] args)
	{
		Scanner tara = new Scanner(System.in);
		int x;
		System.out.println("bir sayi giriniz");
		x=tara.nextInt();

		int sayac = 1;
		int faktoriyel =1 ;

		
		do
		{

			faktoriyel *= sayac;
			sayac += 1;
		}while (sayac <=x);
		System.out.println(faktoriyel);
	}
}

