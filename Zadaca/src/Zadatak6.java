/**
Napisati funkciju koja prima string a vraca okrenut taj string, Ako funkciji posaljemo

string “teske boje” funkcija treba da vrati “ejob ekset”.

Napomena:

U izradi programa zabranjeno je koristiti klasu StringBuilder.
*/

import java.util.Scanner;
public class Zadatak6 {

	public static String [] niz(String recenica){
		String slovo;
		String [] okrenutaRecenica = new String [recenica.length()];
		for (int i=recenica.length()-1; i>=0; i--){
			slovo = ""+recenica.charAt(i);
			okrenutaRecenica[i]=slovo;
					
			
		}
				
		for( int i=okrenutaRecenica.length-1; i>=0;i--){
			System.out.print(okrenutaRecenica[i] +"");
		}
		
		return okrenutaRecenica;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite vasu recenicu: ");
		String unos = in.nextLine();
		niz(unos);
		
		
	}
	
	
}
