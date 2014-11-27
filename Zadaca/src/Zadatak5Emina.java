public class Zadatak5Emina {

	/**
	 * 
	 * Dijeli string na mjestima gdje se pojavljuje zadani znak
	 * 
	 * @param s
	 *            String bilo koji string
	 * 
	 * @param z
	 *            char bilo koji znak
	 */

	public static String[] Razdijeli(String s, char z)

	{

		String novaR = "";

		int i = 0, j = 0;

		String[] niz = new String[s.length()];

		while (i < s.length())

		{

			if (s.charAt(i) != z)

				novaR += s.substring(i, i + 1);

			else

			{

				niz[j] = novaR;

				j++;

				novaR = "";

			}

			i++;

		}

		return niz;

	}

	public static void main(String[] args) {

		System.out.println("Unesite string: ");

		String str = TextIO.getlnString();

		System.out.println("Unesite karakter: ");

		char z = TextIO.getAnyChar();

		String noviStr = str + " ";

		String[] niz = Razdijeli(noviStr, z);

		for (int j = 0; j < niz.length; j++)

			System.out.print(niz[j] +" ");

	}

}