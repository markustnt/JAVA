/*Esempio ricorsivo*/

public class EsRicorsivo {
	public static void main (String[] args){
		int num = 3;
		ContoAllaRovescia(num);
	}
	public static void ContoAllaRovescia(int num){
		if (num == 0){
			System.out.println();
		}else{
			System.out.println(num);
			ContoAllaRovescia(num-1);   //in questa riga avviene il passaggio chiave della ricorsione
		}								//infatti all'interno del metodo 'ContoAllaRovescia' viene
	}									//richiamato nuovamente il metodo 'ContoAllaRovescia' con parametro	
}										// num-1, quindi viene ripetuto il metodo con num-1, finchè num = 0