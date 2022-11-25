//lezione del 21/11/22
//problemi decisionali
public class lezione21_11_22 {
	public static void main (String[] args){
		int[][] a = new int[4][3];
		a[0][0]=1;
		a[0][1]=7;
		a[0][2]=1;
		
		a[1][0]=1;
		a[1][1]=1;
		a[1][2]=1;
		
		a[2][0]=1;
		a[2][1]=90;
		a[2][2]=3;
		
		a[3][0]=1;
		a[3][1]=1;
		a[3][2]=1;
		
		boolean r = verifica(a);
		System.out.println(r);
	}
	static boolean verifica (int[][] a){
		boolean esiste = false;
		int i=0;
		while(i<a.length && !esiste){
			int j=0;
			while(j<a[i].length && !esiste){
				esiste=p(a[i][j]);
				j++;
			}
			i++;
		}
		return esiste;
	}
	static boolean p (int n){
		if (n%2==0){
			return true;
		}else {
			return false;
		}
	}
}
