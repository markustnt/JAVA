public class minimoArray {
	public static void main (String[] args){
		int [] a = {1, 5, 3, 7};
		int l=0;
		int r=a.length;
		int min = minimo(a, l, r);
		System.out.println(min);
	}
	public static int minimo (int [] a, int l, int r){
		if (r-l==1){ //caso base
			return a[l];
		}else{
			int m = (r+l)/2;
			int minsx = minimo(a, l, m);
			int mindx = minimo(a, m, r);
			if (minsx<mindx){
				return minsx;
			}else {
				return mindx;
			}
		}
	}
}

//es inrementa array di 1
//es conta array pari