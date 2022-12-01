public class triangolareMatrice {
	public static void main (String[] args){
		int[][]m = new int[4][4];
    //chiamata metodo diagolane
		m = diagonale(m,false);
    
    //stampa risultato
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				System.out.print(m[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
  
  //metodo diagonale
	static int[][] diagonale(int[][] m, boolean alta){
		int c = 0;
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				if (alta){
					if(i>=j){
					  c=c+1;
					  m[i][j]=c;
					}
				}else{
					if(i<=j){
					  c=c+1;
					  m[i][j]=c;
					}
				}
				
			}
		}
		return m;
	}
}
