package Domasna3z2;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		int BrojNaFrlanja;
		
		Brojac brPismo = new Brojac();
		Brojac brGlava = new Brojac();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Vnesete go brojot na frlanja na parickata: ");
		BrojNaFrlanja = sc.nextInt();
		
		while (BrojNaFrlanja > 0) {
			brPismo.reset();
			brGlava.reset();
			
			for(int i=0; i<BrojNaFrlanja; i++)
			{
				if(Math.random() < 0.5)
					brPismo.zgolemi();
				else 
					brGlava.zgolemi ();
			}
			System.out.println("Vo " + BrojNaFrlanja + " frlanja");
			System.out.println("Padnaa: " + brPismo.brojac + " pisma");
			System.out.println("Padnaa: " + brGlava.brojac + " glavi");
			
			System.out.println("Dokolku sakate povtorno frlanje, vnesete broj na frlanja: ");
			BrojNaFrlanja = sc.nextInt();
			
		}
		sc.close();
		
	}

}
