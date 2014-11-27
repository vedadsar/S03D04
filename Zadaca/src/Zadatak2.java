/**
 * Napisite funkciju koja prima cijeli broj n , a koja ispisuje na ekran sve
 * brojeve od 1
 * 
 * do n koji su dijeljivi sa sumom svojih cifara. Funkciju demonstrirati u
 * programu koji
 * 
 * zahtjeva od korisnika da unese broj n a zatim poziva napisanu funkciju sa
 * parametrom
 * 
 * n.
 * 
 * @author vedadzornic
 *
 */
import java.util.Scanner;

public class Zadatak2 {

	public static int zbir(int broj) {
		int zbir = 0;
		int brojCopy = broj;

		while (broj != 0) {
			zbir = zbir + broj % 10;
			broj = broj / 10;

		}
		if (brojCopy % zbir == 0) {
			System.out.println("broj " + brojCopy
					+ " je djeljiv sa sumom svojih cifara");
		}

		return brojCopy;
	}

	public static void interval(int broj) {
		for (int i = 1; i <= broj; i++) {
			zbir(i);

		}

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Unesite vas broj");
		int broj = in.nextInt();
		interval(broj);
	}

}
