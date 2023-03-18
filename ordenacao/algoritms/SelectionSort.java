package ordenacao.algoritms;

import ordenacao.Sorter;
public class SelectionSort implements Sorter{
    
    public int BuscaMinimo(int[] elements, int x ){
        int indice = x;
        int contador = elements[x]; 

        for(int i = x ; i < elements.length; i++ ){
            if(contador > elements[i]){
                contador = elements[i];
                indice = i;
            }
        }
        return indice;
    
    }

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements;
        // int contador = elements[0];
        // int indice = 0;
        for(int i = 0 ; i < elements.length; i++){
            int menorindice = BuscaMinimo(elements, i);
            int Save = elements[i];
            elements[i] = elements[menorindice];
            elements[menorindice] = Save;
            // for(int x = i; x < elements.length; x++){
            //     if(elements[x] < contador){
            //         contador = elements[x];
            //         indice = x;
            //     }
            // }
            // int save = elements[indice];
            // elements[i] = elements[indice];
            // elements[indice] = save;

        }

        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }

    // public static void main(String[] args) {
    //     SelectionSort L = new SelectionSort();

    //     int[] lista = {50, -1, 12, 20, 4, 2, 10, 15};

    //     L.sort(lista);

    //     System.out.println(lista[0]);
    //     System.out.println(lista[1]);
    //     System.out.println(lista[2]);
    //     System.out.println(lista[3]);
    //     System.out.println(lista[4]);
    //     System.out.println(lista[5]);
    //     System.out.println(lista[6]);
    //     System.out.println(lista[7]);

    // }
}
