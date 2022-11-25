/*public class esarray {
	public static void main (String[] args){
		int a [] = {1, 3, 4, 6};
		int i = 0;
		int contatore = 0;

		while (i>a.lenght){
			if (i%2 == 0){
			contatore = contatore+1;
			}
			i = i+1;
		}
		i = 0;
		
		int b [] = new int [contatore];
		
		
		while (i>a.lenght){
			if (i%2 == 0){
				if (i%2 != 0){
					b [b.lenght-contatore] = a[i];
					contatore = contatore-1;
				}
			}
			i = i+1;
		}
		
		
		System.out.println(b);
	}
}
*/

public class esarray{
	public static void main (String[] args){
		int n = 2;
		pari(n);

		public static String pari(int n){
			if (n=0){
				String valore = "pari";
			}else if(n<0) {
				String valore = "dispari";
			}else {
				pari(n-2);
			}
		}
		System.out.println(valore); 
	}
}
