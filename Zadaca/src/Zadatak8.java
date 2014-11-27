/**
 * Napišite program koji trazi da se sa tastature unese neki cijeli broj, a koji će zatim na

ekranu ispisati znak čija je ASCII šifra jednaka unesenom broju. Program treba da 

proizvede dijalog koji izgleda poput sljedeceg: 

Unesi neki broj: 67 

Znak koji ima ASCII šifru 67 je znak C.
 */

import java.util.Scanner;

public class Zadatak8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite neki broj: ");
		int unis = in.nextInt();
		System.out.println("ASCII kod vaseg broja je: " + (char) unis);
	}
}
