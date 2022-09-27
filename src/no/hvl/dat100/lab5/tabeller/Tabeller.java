package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		
		for (int i : tabell) 
			System.out.print(i + " " );
		
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabellStr = "[";	
		
		for (int i=0; i<tabell.length; i++) {
			tabellStr += tabell[i];
			
			if (i<tabell.length-1)
				tabellStr += ",";
		}	
		
		tabellStr += "]";
		
		return tabellStr;
	}

	// c)
	public static int forSummer(int[] tabell) {

		int sum = 0;
		
		for (int i=0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		
		return sum;
	}
		
	public static int whileSummer(int[] tabell) {
		
		int sum = 0;	
		int tall = 0;
		
		while (tall<tabell.length) {
			sum += tabell[tall];
			tall++;
		}
		
		return sum;	
	}
		
	public static int uforSummer(int[] tabell) {

		int sum = 0;
		
		for (int i : tabell)
			sum += i;
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int pos = 0;
		boolean funnet = false;
		
		while(pos<tabell.length && !funnet) {
			if (tabell[pos] == tall)
				funnet = true;
			pos++;
		}
		
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int pos = 0;
		boolean funnet = false;
		
		while(pos<tabell.length && !funnet) {
			if (tabell[pos] == tall)
				funnet = true;
			pos++;
		}
		
		if (!funnet)
			pos = 0;
		
		return (pos - 1);
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] nytabell = new int[tabell.length];
		
		for (int i=0; i<tabell.length; i++)
			nytabell[(tabell.length-1)-i] = tabell[i];

		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int  pos = 1;
		boolean sortert = true;
		
		while (sortert && pos<tabell.length) {
			if (tabell[pos]<tabell[pos-1])
				sortert = false;
			pos++;	
		}
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nytabell = new int [tabell1.length + tabell2.length];
		int pos = 0;
		
		for (int i=0; i<nytabell.length; i++) {
			if (i < tabell1.length) {
				nytabell[i] = tabell1[i];
			} else {
				nytabell[i] = tabell2[pos];
				pos++;
			}
		}

		return nytabell;
	}
}

