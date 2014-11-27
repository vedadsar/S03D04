import java.util.Scanner;
public class Zadatak9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite neki karakter: ");
		char unis =TextIO.getChar();
		int unosM = (int) (unis-1);
		int unosV = (int) (unis+1);
		System.out.println("broj ASCII  vaseg karaktera je: " + (int) unis +" " +(char)unosM + " " +(char)unosV);
	}
}

	
	