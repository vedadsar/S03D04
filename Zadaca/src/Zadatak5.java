/**
 * Napisati funkciju razdijeli koja prima 2 parametra, varijablu tipa string i
 * varijablu tipa
 * 
 * char.
 * 
 * Funkcija treba da vrati niz stringova koji se sastoje od dijelova koje
 * dobijemo kad
 * 
 * poslani string podijelimo na mjestima gdje se pojavljuje znak koji smo
 * poslali.
 * 
 * Primjer:
 * 
 * Ako funkciju pozovemo sa parametrima “ovaj zadatak je zabavan” i znakom
 * 
 * razmak ‘ ‘ funkcija treba da vrati niz { “ovaj”, “zadatak”, “je”, “zabavan” }
 * 
 * Napomena:
 * 
 * Pri izradi zadatka zabranjeno je koristiti metodu split iz klase string.
 * 
 * @author vedadzornic
 *
 */
public class Zadatak5 {

	public static String[] str(String recenica, char karakter) {

		String[] niz = new String[10];
		int i = 0;
		do {
			String noviString = recenica.substring(0,
					recenica.indexOf(karakter));
			niz[i] = noviString;
			recenica = recenica.substring(0, recenica.indexOf(karakter));
			i++;

		} while (recenica.length() > 0);

		for (int j = 0; j < niz.length; j++) {
			System.out.println(niz[j]);
		}
		return niz;
	}

	public static void main(String[] args) {
		String rijec = "Saf fas fasf fsa";
		char slov = 'f';
		str(rijec, slov);
	}

}
