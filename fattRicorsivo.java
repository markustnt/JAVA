//es piatti ricorsione
//fattorinale di n

public class fattRicorsivo{
	public static void Main (String[] args){
	int num = 5;
	
	int fatt = fattoiale(num);
	
	fattoiale(n){
	if(n==1){
		return 1;
	}else {
		fatt = n * fattoriale(n-1);
	}
	
	System.out.println(fatt);
}
}



//ricorsione co variante moltiplicazione

molt(x,y);

if (y==0){ //caso base
	return 0;
} else { //caso induttivo
	rI = molt(x,y-1);
	r = rI + x;
	return r;
}
//ricorsione contro-variante moltiplicazione
molt(x,y);
i=0;
if (i==y){
	retun 0; //caso base
}else {
	rI = molt(x,i+1);
	r = rI + x;
	return r;
}


//ricorsione co variante esponente
//x^y   Es. 2^3 == 2*2*2 == 8
e(x,y);

if (y==0){ //caso base
	return 1;
} else { //caso induttivo
	rI = e(x,y-1);
	r = rI * x;
	return r;
}