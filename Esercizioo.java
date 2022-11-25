/*
public class Esercizioo {
	public static void main (String[] args){
		
		int [] a = {4, 3, 2, 0};
		
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a.length-1; j++){
				if (a[j]>a[j+1]){
					a = scambio(j, a);
				}
			}
		}
		
		for(int y=0; y<a.length; y++){
			System.out.println(a[y]);
		}
	}
	public static int[] scambio (int j, int[] a){
		//scambio
		int tmp = a[j];
		a[j] = a[j+1];
		a[j+1] = tmp;
		
		return a;
	}
}
*/
/*
public class Esercizioo {
	public static void main (String[] args){
		int [] a = {1, 3, 4, 6, 8, 10};
		int [] b = doppio(a);
		
		System.out.println("Array a: ");
		for (int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("Array b: ");
		for (int i = 0; i<b.length; i++){
			System.out.println(b[i]);
		}
	}
	/*
	public static int [] doppio (int [] r){
		for (int i=0; i<r.length; i++){
			r[i] = r[i]*2;
		}
		return n;
	}
	*//*
	public static int[] doppio(int r[]){
		int[] n = new int[r.length];
		for(int i = 0; i<r.length; i++){
		  n[i] = r[i]*2;
		}      
		return n;
	}
}
*/

public class Esercizioo {
	public static void main (String[] args){
		int a = 2;
		int b=3;
		double s = somma(a,b);
		System.out.println(s);
	}
	public static double somma (int num1, int num2){
		int i = num2;
		
		if (i==0){
			return num1;
		}else {
			somma(num1, num2-1);
			somma = num1+1;
			return somma;
		}
		
	}
}



/*Esercizio sottrazione ricorsiva covariante*/

public class Esercizioo {
	public static void main (String[] args){
		//caso base -> meno(x,0) == 0 -> questo quando y = 0
		if (y=0){
			return x;
		}else{
			ri = meno(x, y-1);
			r = ri - 1;
		}
	}
}