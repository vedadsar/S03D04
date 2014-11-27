/**
 * 1) Napisite funkciju koja kao paramerar prima cijeli broj n a koja vraca sumu cifara 

broja n. Napisanu funkciju demonstrirajte u programu koji od korisnika trazi da unese 

broj a zatim ispisuje sumu njegovih cifara.
 * @author vedadzornic
 *
 */
import java.util.Scanner;
public class Zadatak1 {

	public static int zbir( int broj){
		int zbir = 0;
		while (broj>0){
			zbir = zbir +broj%10;
			broj=broj/10;
			
		}
		System.out.println("Zbir cifara vaseg broja je " +zbir);
		return zbir;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesite vas broj");
		int broj = in.nextInt();
		
		zbir(broj);
	}
	
}
