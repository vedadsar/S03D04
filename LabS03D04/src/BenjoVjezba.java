public class BenjoVjezba {

	public static int[][] matrica(int visina, int sirina) {

		int[][] matrica = new int[visina][sirina];

		return matrica;
	}

	public static void ispisMatrice(int[][] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");

			}
			System.out.println();
		}

	}
	
	
	public static void ispis1DNiza(int [] niz){
		for(int i=0; i<niz.length;i++){
			System.out.print(niz[i] +" ");
		}
		System.out.println();
		
	}

	public static int[][] unesiVrijednost(int [][] matrica){
		int x=0;
	    int y=0;
	   
		
	    
		
	    System.out.println("Unesite koordinatu 1");
		x= TextIO.getInt();			
		while( x<0 || x>=matrica.length){
			System.out.println("Neispravna koordinata, pokusajte ponovo");
			x= TextIO.getInt();	
		}
				
		System.out.println("Unesite koordinatu 2");
		 y = TextIO.getInt();		
		 while( y<0 || y>=matrica[x].length){
				System.out.println("Neispravna koordinata, pokusajte ponovo");
				y= TextIO.getInt();	
			} 
	   
		
		 System.out.println("Unesite vrijednost kojom hocete da zamjenite poziiciju x,y");
		int vrijednost = TextIO.getInt();
		
		int [][] novaMatrica = matrica;
		novaMatrica [x][y] = vrijednost;
		
		for (int i = 0; i < novaMatrica.length; i++) {
			for (int j = 0; j < novaMatrica[i].length; j++) {
				System.out.print(novaMatrica[i][j] + " ");

			}
			System.out.println();
		}
		
		return novaMatrica;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite visinu matrice");
		int visina = TextIO.getInt();
		System.out.println("Unesite duzinu matrice");
		int duzina = TextIO.getInt();
		
		//int[][] matrica = new int[visina][duzina];
		//ispisMatrice(matrica(visina, duzina));
		
		unesiVrijednost(matrica(visina, duzina));
		
		//ispis1DNiza(matrica[0]);
		
		
	}
}
