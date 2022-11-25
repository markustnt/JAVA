public class quadrata {
	public static void main(String[] args){
		int[][] a = new int [3][3];
		System.out.println(quadrata(a));
	}
	static boolean quadrata (int[][] a){
		boolean quadrata = false;
		for(int i=0; i<a.length; i++){
			quadrata = (a.length == a[i].length);
		}
		return quadrata;
	}
}
