package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {
    // supondo a lista [2,6,4,1,0,8,10]
    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements;
        int d = 0;

        for(int i = 1 ;  i < sorted.length ; i++){
            if(sorted[0] > sorted[i]){
                d++;
                int temporário = sorted[d];
                sorted[d] = sorted[i];
                sorted[i] = temporário;
            }
        }        // O que se espera da lista até agora seria [2,1,0,6,4,8,10]
        int inicio = sorted[0];
        sorted[0] = sorted[d];
        sorted[d] = inicio;  // O que se espera da lista até agora [0,1,2,6,4,8,10]

        
        for(int i = 0; i < sorted[d-1]; i++){
            if(sorted[i] > sorted[i+1]){
                int temporário = sorted[i];
                sorted[i] = sorted[i+1];
                sorted[i+1] = temporário;
            }
        }
        

        for(int i= d+1; i < sorted.length - 1 ; i++){
            if(sorted[i] > sorted[i+1]){
                int temporário = sorted[i];
                sorted[i] = sorted[i+1];
                sorted[i+1] = temporário;
            }
        }

        return sorted;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

    public static void main(String[] args) {
        QuickSort R = new QuickSort();
        int[] lista = {14,32,2,6,4,1,0,8,10};

        R.sort(lista);

        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
        System.out.println(lista[3]);
        System.out.println(lista[4]);
        System.out.println(lista[5]);
        System.out.println(lista[6]);
        
    }
}
