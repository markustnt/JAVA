public class esss {
	public static void main (String[] args){
		int [] a = {1, 4, 6, 3, 5, 7};
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]);
			System.out.print(" ");
		}
		
		int [] b = InvertiArray(a);
		
		System.out.println("");
		
		for (int i=0; i<b.length; i++){
			System.out.print(b[i]);
			System.out.print(" ");
		}
	}
	
	//metodo che inverte l'array 
	public static int[] InvertiArray (int[] a){
		int[] x = a;
		int [] b = new int[x.length];
		
		for (int i=0; i<x.length; i=i+1){
			b[i] = x[i-x.length-1];
		}
		for (int i=0; i<b.length; i++){
			System.out.print(b[i]);
			System.out.print(" ");
		}
		return b;
	}
	
}