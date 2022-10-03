package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.println("--------------");
		
		for (int [] rad : matrise) {
			for (int kolonne : rad) {
				System.out.print(kolonne + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matriseStr = "";
		
		for (int [] rad : matrise) {
			for (int kolonne : rad) {
				matriseStr += kolonne + " ";
			}
			matriseStr += "\n";
		}
		
		return matriseStr;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
				
		int[][] nymatrise = new int[matrise.length][];
		
		for (int rad=0; rad<matrise.length; rad++) {
			nymatrise[rad] = new int[matrise[rad].length];
					
			for (int kolonne=0; kolonne<matrise[rad].length; kolonne++) {
				nymatrise[rad][kolonne] = matrise[rad][kolonne] * tall;	
			}
		}

		return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		
		if (a.length != b.length)
			lik = false;
		
		int rad = 0;
		
		while (rad<a.length && lik) {
			
			if (a[rad].length != b[rad].length)
				lik = false;
			
			int kolonne = 0;
			
			while (kolonne<a[rad].length && lik) {
				if (a[rad][kolonne] != b[rad][kolonne])
					lik = false;
				
				kolonne++;
			}
			
			rad++;
		}
		
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speilet = new int[matrise.length][matrise.length];
		
		for (int rad=0; rad<matrise.length; rad++) {
			for (int kolonne=0; kolonne<matrise.length; kolonne++) {
				speilet[kolonne][rad] = matrise[rad][kolonne];
			}
		}
	
		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int m = a.length;
		int p = b[0].length;
		
		int[][] c = new int [m][p];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<p; j++) {
				for (int n=0; n<b.length; n++) {
					c[i][j] += a[i][n] * b[n][j];
				}
			}
		}
		
		return c;
	}
		
		
}
