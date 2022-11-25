/*ALBERO SINTATTICO*/ //markustnt

public class alberoSintattico {
	
	public static void main (String[] args){
		String preposizione = "((A)i(B))";
		
		char[] p = preposizione.toCharArray();
		char[] lettere = {['A'] ['B'] ['C']};
		
		System.out.println(inArray('A', p));
	}
	static boolean inArray(char l, char[]p){
		boolean r = false;
		for(int i=0; i<p.length; i++){
			if(p[i]==l){
				r=true;
			}
		}
		return r;
	}
	
	
}