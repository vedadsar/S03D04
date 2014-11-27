import java.util.Scanner;

public class xo2 {

	public static int upisxX() {// Unos koordinate x od "X"
		Scanner in = new Scanner(System.in);

		int xX;
		xX = in.nextInt();

		return xX;

	}

	public static int upisyX() { // Unos koordinate y od "X"
		Scanner in = new Scanner(System.in);

		int yX = 0;
		yX = in.nextInt();

		return yX;
	}

	public static int upisxO() { // Unos koordinate x od " O "
		Scanner in = new Scanner(System.in);
		int xO;
		xO = in.nextInt();

		return xO;

	}

	public static int upisyO() {// Unos koordinate y od "O"
		Scanner in = new Scanner(System.in);

		int yO = 0;

		yO = in.nextInt();

		return yO;
	}

	public static void main(String[] args) {

		int[][] move = new int[3][3]; // Dvodimenzionalni niz, koordinate

		System.out.println("Tabela izgleda ovako: \n [0,0] \t [0,1] \t [0,2] \n [1,0] \t [1,1] \t [1,2] \n [2,0] \t [2,1] \t [2,2]");
		
		
		int x1;
		int x2;
		int o1;
		int o2;

		int brojac = 0;
		while (brojac < 9) {

			System.out
					.println("Prvi igrac na potezu, unestie x,y koordinate od X");

			x1 = upisxX();
			x2 = upisyX();
			if (move[x1][x2] == 0) {
				move[x1][x2] = 1;
				brojac = brojac + 1;
			} else {
				System.out
						.println("Unijeli ste broj na vec popunjeno mjesto, pokrenite igricu ponovo");
				return;
			}

			if ((move[0][0] == 1 && move[1][0] == 1 && move[2][0] == 1)
					|| (move[0][0] == 1 && move[1][1] == 1 && move[2][2] == 1)
					|| (move[0][0] == 1 && move[0][1] == 1 && move[0][2] == 1)
					|| (move[1][0] == 1 && move[1][1] == 1 && move[1][2] == 1) // x-pobjednik
					|| (move[2][0] == 1 && move[2][1] == 1 && move[2][2] == 1)
					|| (move[0][2] == 1 && move[1][1] == 1 && move[2][0] == 1)
					|| (move[0][2] == 1 && move[1][2] == 1 && move[2][2] == 1)) {

				System.out.println("Pobjednik igrac broj 1");
				break;
			}

			System.out
					.println("Drugi igrac na potezu, unestie x,y koordinate od O");

			o1 = upisxO();
			o2 = upisyO();
			if (move[o1][o2] == 0) {
				move[o1][o2] = 2;
				brojac = brojac + 1;
			} else {
				System.out
						.println("Unijeli ste broj na vec popunjeno mjesto, pokrenite igricu ponovo");
				return;
			}

			if ((move[0][0] == 2 && move[1][0] == 2 && move[2][0] == 2)
					|| (move[0][0] == 2 && move[1][1] == 2 && move[2][2] == 2)
					|| (move[0][0] == 2 && move[0][1] == 2 && move[0][2] == 2)
					|| (move[1][0] == 2 && move[1][1] == 2 && move[1][2] == 2)
					|| (move[2][0] == 2 && move[2][1] == 2 && move[2][2] == 2) // O-pobjednik
					|| (move[0][2] == 2 && move[1][1] == 2 && move[2][0] == 2)
					|| (move[0][2] == 2 && move[1][2] == 2 && move[2][2] == 2)) {

				System.out.println("Pobjednik igrac broj 2");
				break;
			}

		}
     
	}
}