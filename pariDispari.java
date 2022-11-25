import java.util.Scanner; //libreria

public class pariDispari {
	public static void main (String[] args){
		
		Scanner myObj = new Scanner(System.in); //oggetto scanner
		
		System.out.println("Pari o Dispari"); //input
		System.out.println();
		String i="S";
		while (i=="S"){
			System.out.print("Inserisci il numero: ");
			int num = myObj.nextInt();
			i = PariODispari(num);
 		}
	}
	static String PariODispari(int num){
		
		Scanner myObj = new Scanner(System.in);
		
		if(num%2==0){
			System.out.println("Il numero è pari");
		}else {
			System.out.println("Il numero è dispari");
		}
		System.out.println("Inserisci 'S' per ripetere");
		String r = myObj.nextLine();
		return r;
		
	}
}