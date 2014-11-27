import java.util.Scanner;
public class XOvedo {

	public static void main(String[] args) {
		igrajIgricu('X', 'O', ' ');
	}

	private static void igrajIgricu(char prviIgrac, char drugiIgrac,
			char niJedanIgrac) {

		int aktivniIgrac = 0;// 0- igrac X; 1 igrax O
		String izabranoPolje = null;
		char[][] poljanaZaIgru = new char[3][3];
		boolean krajIgre = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				poljanaZaIgru[i][j] = niJedanIgrac;
			}
		}

		do {
			do {

				izabranoPolje = unesiPolje(aktivniIgrac);
			} while (izabranoPoljeJeIspravno(izabranoPolje, poljanaZaIgru, niJedanIgrac));
			postaviPolje(aktivniIgrac, izabranoPolje);
			krajIgre = krajIgre(poljanaZaIgru);
			if (!krajIgre) {
				aktivniIgrac = promjeniAktivnogIgraca(aktivniIgrac);

			}
		} while (!krajIgre);
		if (nemaPobjednika(poljanaZaIgru)) {
			ispisiRemi();
		} else {
			ispisiPobjednika(aktivniIgrac);
		}

	}

	private static void ispisiPobjednika(int aktivniIgrac) {
		// TODO Auto-generated method stub

	}

	private static void ispisiRemi() {
		// TODO Auto-generated method stub

	}

	private static boolean nemaPobjednika(char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int promjeniAktivnogIgraca(int aktivniIgrac) {
       if(aktivniIgrac ==0)
    	   return 1;
       
      return 0;
	}

	private static boolean krajIgre(char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		return false;
	}

	private static void postaviPolje(int aktivniIgrac, String izabranoPolje, char[][] poljanaZaIgru) {
	   int polje = Integer.parseInt(izabranoPolje);
	   poljanaZaIgru[(polje-1)/3][(polje-1)%3]=igrac;

	}

	private static boolean izabranoPoljeJeIspravno(String izabranoPolje, char [] [] poljanaZaIgru, char niJedanIgrac) {
		try{
			
			int polje = Integer.parseInt(izabranoPolje);
			if((polje<10) && (polje>0)){
				// (2-br)*3 +br2 +1
				if(poljanaZaIgru[(polje-1)/3][(polje-1)%3]==niJedanIgrac)
				return true;
				
			}
						
		}catch (Exception e) {		
		}
		return false;
	}

	private static String unesiPolje(int aktivniIgrac) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesi polje koje yelis igrati: \n");
        
		return in.nextLine();
	}
}
