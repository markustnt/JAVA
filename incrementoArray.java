//ditocomica
public class incementoArray{
	public static void main (String[] args){
		int[] b = {1, 5, -2, 9}; 
		incremento(b);
		for (int i = 0; i<b.length; i++){
			System.out.println(b[i]);
		}
		
	}
	static void incremento(int[] b){
		if (b!=null){
			int l =0;
			int r=b.length;
			incrementoDi(b,l,r);
		}
	}
	static void incrementoDi (int[] b, int l, int r){
		if (l+1==r){
			b[l]=b[l]*(-1);
		}else {
			int m=(l+r)/2;
			incrementoDi(b, l, m);
			incrementoDi(b, m, r);
		}
	}
}

//covariante
public class incrementoArray {
	public static void main (String[] args){
		int[] a = {3, 5, 6};
		incremento(a);
	}
	static void incremento (int[] a) 
}