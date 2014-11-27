/** Napisati funkciju koja korisniku omogucava da unosi proizvoljni broj cijelih brojeva,

unos brojeva treba prekinuti kad korisnik unese -1, ovdje -1 ne racunamo kao deseti 

uneseni broj. Fukcija treba da vrati zadnjih 10 unesenih brojeva. Funciju demonstrirati 

u programu koji ce od korisnika traziti da unosi brojeve a zatim ispisuje zadnjih 10 

unesenih brojeva u istom redoslijedu u kojem su uneseni.
 */
import java.util.Scanner;

public class Zadatak4 {

	public static int[] unosBrojeva() {
		Scanner in = new Scanner(System.in);
		int kraj = -1;
		int unos = 0;
		int[] niz = new int[10];
		do {
			for (int i = 0; i < 10; i++) {
				System.out.println("Unesite broj");
				unos = in.nextInt();

				if (unos == kraj) {
					System.out.println("Unijeli ste -1, prekid");
					break;
				}
				niz[i] = unos;
			}
		} while (unos != kraj);

		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);

		}
		return niz;
	}

	public static void main(String[] args) {
		unosBrojeva();
	}
}
