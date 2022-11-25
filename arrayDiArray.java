public class arrayDiArray{
	public static void main (String[] args){
		String[][] classi = new String [3][3];
		classi[0][0]="Luca";
		classi[0][1]="Anna";
		classi[0][2]="Marco";
		
		classi[1][0]="Edoardo";
		classi[1][1]="Antonio";
		classi[1][2]="Leonardo";
		
		classi[2][0]="Edo";
		classi[2][1]="Anto";
		classi[2][2]="Leo";
		
		//stampa di tutti i nomi
		stampaArraydiArray(classi);
	}
	static void stampaArraydiArray(String[][] classi){
		if(classi!=null && classi.length!=0){
			stampaArraydiArrayWhile(classi, 0, 0);
		}else{
			System.out.println("Array non valido");
		}
	}
	static void stampaArraydiArrayWhile(String[][] classi, int i, int j){
		while (i<classi.length){
			System.out.println();
			System.out.println("classe "+String.valueOf (i));
			while(j<classi[i].length){
				System.out.println(classi[i][j]);
				j=j+1;
			}
			i=i+1;
			j=0;
		}
	}
}