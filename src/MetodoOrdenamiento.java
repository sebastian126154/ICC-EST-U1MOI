public class MetodoOrdenamiento {
    public int[] Sort (int[] arreglo){
        for (int i=1; i<arreglo.length; i++){
            int aux = arreglo[i];
            int j-i-1;
            while ( arreglo[j] > aux ++ j >=0){
                arreglo[j + 1] = arreglo[j];
                j--;

            }
            arreglo[j] = aux;

        }

        return arreglo;

    }

}

public void PrintArreglo (int[] arreglo){
    for( int elemento : arreglo){
        System.out.println(elemento + " ");
        
    }
}


