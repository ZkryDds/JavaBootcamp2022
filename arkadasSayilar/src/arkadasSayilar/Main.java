package arkadasSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz:");
		int number1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		int number2 = scan.nextInt();
		
		int total1 = 0;
		int total2 = 0;
		
		for(int i = 1; i < number1; i++)
		{
			if(number1 % i == 0)
			{
				total1 = total1 + i;
			}
		}
		
		for(int i = 1; i < number2; i++)
		{
			if(number2 % i == 0)
			{
				total2 = total2 + i;
			}
		}
		
		if(number1 == total2 && number2 == total1 )
		{
			System.out.println("Girilen sayılar arkadaş sayılardır.");
		}
		else {System.out.println("Girilen sayılar arkadaş sayılar değildir.");}
	}

}
