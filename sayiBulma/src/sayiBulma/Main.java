package sayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,3,5,6,7,8,0};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Arayacağınız sayıyı giriniz:");
		int aranacak = scan.nextInt();
		
		boolean varMi = false;
		
		for(int i = 0; i < sayilar.length; i++)
		{
			if(sayilar[i] == aranacak) 
			{
				varMi = true;				
			}
		}
		
		if(varMi) 
		{
			System.out.println("Aradığınız sayı bulundu.");
		}
		else {System.out.println("Aradığınız sayı bulunamadı.");}

	}

}
