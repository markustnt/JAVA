public class stampaAngoli{
	public static void main (String[] args){
		int[][] a = new int [4][8];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[2][0] = 5;
		a[2][1] = 6;
		a[3][0] = 7;
		a[3][1] = 8;
		stampaAngolii(a);
	}
	static void stampaAngolii(int[][] a){
	for(int i=0; i<a.length; i++){
		System.out.println("");
			for (int j=0; j<a[i].length; j++){
				boolean c1 = i==0||i==a.length-1;
				boolean c2 = j==0 || j==a[i].length-1;
				if (c1 && c2){
					System.out.print(a[i][j]);	
					System.out.print(" ");
				}
				System.out.print(" ");
			}
		}
	}
}