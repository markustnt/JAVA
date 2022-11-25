import java.util.Arrays;

/** Dato un array `a`, restituisce un *array* che deve contenere tutti e soli gli elementi che in `a`, simultaneamente, occupano una posizione dispari e hanno valore pari */
public class ElempariPosDisp {
  
  public static void main (String[] args) {
    int[] atteso = posDispariElPariCon(new int[] {10,8,11,7,13,12});
    System.out.println(Arrays.toString(atteso));
  }
  
  static int[] posDispariElPariCon(int[] a) {
    int[] r = null;
    if (a != null) {
      r = new int[contaPosDisElPari(a, 0)];
      posDispariElPariCon(a, r, 0);
    }
    return r;
  }
  
  static int posDispariElPariCon(int[] a, int[] r, int i) {
    /* Se j è il valore restituito, allora nell'intervallo di
    elementi di r con indici [0,...,j) sono memorizzati gli 
    elementi cercati in a, con indici in [i,...,a.length) */
    if (i == a.length) { 
    return 0; 
    } else { 
      int vI = posDispariElPariCon(a, r, i+1);
      /* Per ipotesi induttiva, negli elementi di r con indici 
      [0,...,vI) sono memorizzati gli elementi cercati in a, 
      con indici in [i+1,...,a.length) */
      if ((i%2 == 1) && (a[i]%2 == 0)) {
        /* Occorre memorizzare unnuovo elemento in r, perché
        soddisfa le condizioni */
        r[vI] = a[i];
        /* Negli elementi di r con indici 
        [0,...,vI+1) sono memorizzati gli elementi cercati in a, 
        con indici in [i,...,a.length) */
        vI = vI + 1;
        /* L'assegnazione precedente ridenomina l'espressione
        vI + 1 in vI, così possiamo affermare che negli elementi di 
        r con indici [0,...,vI) sono memorizzati gli elementi cercati in a, 
        con indici in [i,...,a.length) */
      }
      return vI;
        /* Negli elementi di r con indici [0,...,vI) sono memorizzati gli 
           elementi cercati in a, con indici in [i,...,a.length) */
    }
  }
  
  static int contaPosDisElPari(int[] a, int i) {
  /* Deve restituire numero elem specificati di a
     nell'intervallo [i,...,a.length) */
     if (i == a.length)  {
       return 0;
       /* Nell'intervallo [a.length,...,a.length) non ci sono elementi
          da contare */
     } else {
         int valoreInduttivo = contaPosDisElPari(a, i+1);
         /* Per ipotesi induttiva restituisce numero elem 
            specificati di a nell'intervallo [i+1,...,a.length) */
         if (i%2==1 && a[i]%2==0 ) {
            /* Trovato elemento ulteriore in a.
               Quindi dobbiamo incrementare il numero elem 
               specificati di a nell'intervallo che da [i+1,...,x.length)
               diventa [i,...,x.length) */
            valoreInduttivo = valoreInduttivo + 1;
         }
        return valoreInduttivo;
     }
  }
}