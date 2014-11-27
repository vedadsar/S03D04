/**
 * Napisati funkciju koja za neku unesenu recenicu(string) ispisuje sve simetricne rijeci

(palindrome), odnosno sve rijeci koje se citaju jednako sa obje strane. Takve rijeci su 

naprimjer Ana, kapak, pop.
 */
import java.util.Scanner;

public class Zadatak7 {
	
	/**
	 * Funkcija okrece jedan string i ispisuje niz stringova okrenutim redosljedom.
	 * @param rijec
	 * @return
	 */
	public static String[] okrenutiString(String rijec){
		
		String [] nizRijec = new String [rijec.length()];
		String slovo;
		
		for(int i=0; i<=rijec.length()-1;i++){
			slovo = ""+rijec.charAt(i);
			nizRijec[i] = slovo;
			
		}
		String [] okrenutaRijec = new String [rijec.length()];
		for( int i=nizRijec.length-1; i>=0;i--){
			System.out.print(nizRijec[i] +"");
		}
		return okrenutaRijec;
	}
	
	
	public static 
	
	public static void main(String[] args) {

		
		okrenutiString("Samoovunoc");
		
		
	}
}
