public class es_ricorsivi { //restituire true se n è in a
	public static void main (String[] args){
		int[] a = {1, 5, 3, 4};
		stampaArray(a);
	}
	static void stampaArray(int [] a){
		if (a!=null && a.length>0){
			stampaArrayDi(a, 0, a.length);
		}
		else{
			System.out.println("Errore Array");
		}
	}
	static void stampaArrayDi (int[] a, int l, int r){
		if(r-l==1){
			return;
		}else{
			int m = (l+r)/2;
			stampaArrayDi(a,l,m);
			System.out.println(a[l]);
			stampaArrayDi(a,m,r);
			System.out.println(a[m]);
		}
	}
}



/*
public static void main (String[] args){
		int[] a = {1, 5, 34, 7};
		int v = 1;
		boolean r = esiste(v, a);
		System.out.println(r);
	}
	static boolean esiste (int v, int[] a){
		boolean ret = false;
		if (a!=null && a.length!=0){
			ret = esisteRic(v, a, a.length-1);
		}
		return ret;
	}
	static boolean esisteRic (int v, int[] a, int i){
		if (i==-1){
			return false;
		}else {
			if (a[i]==v){
				return true;
			}else {
				return esisteRic(v, a, i-1);
			}
		}
	}
*/