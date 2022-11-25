/*Ricerca di un array*/
//ricorsone dicotomica che retituisce l'indice più piccolo di un array in cui risiede il valore v
public class ricercaArray{
	public static void main (String[] args){
		int[] a = {1, 5, 8, 3};
		System.out.println(ricercaArrays(a, 3));
	}
	
	//Wrapper
	static int ricercaArrays (int[] a, int v){
		int r = -1;
		if(a != null && a.length>0 ){ //array non nullo e non vuoto
			r = ricercaArrayDi(a, v, 0, a.length); //r tale che a[r] con r in [0,..,a.length)
		}
		return r;
	}
	
	//Dicotominco
	static int ricercaArrayDi (int[] a, int v, int l, int r){
		int m = (l+r)/2;
		if (a[m]==v){
			return m;
		}
		else if (a[m]>v){
			ricercaArrayDi(a, v, l, m); //sx
			return -1;
		}
		else{
			ricercaArrayDi(a, v, m, r); //dx
			return -1;
		}
	}
}
