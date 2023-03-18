package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    public int[] verify(int[] elements, int i){
        int save =  elements[i];
        elements[i] = elements[i - 1];
        elements[i - 1] = save;

        if(i > 1 && elements[i - 1] < elements[i - 2]){
            return verify(elements, i - 1);
        }
        return elements;
    }

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements; // Considera o array {4,2,10,15}
        
        for(int i = 1; i < elements.length ; i++){
            if(elements[i] < elements[i - 1]){
                
                verify(elements, i); 
                // while(elements[i - j] > elements[i ]){
                //     int save =  elements[i];
                //     elements[i] = elements[i - 1];
                //     elements[i - 1] = save;
                //     j--;
                // }
            }
        }

        return sorted;
        }

    @Override
    public String getName() {
        return "InsertionSort";
    }
    public static void main(String[] args) {
        InsertionSort L = new InsertionSort();

        int[] lista = {50, -1, 12, 20, 4, 2, 10, 15};

        L.sort(lista);

        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
        System.out.println(lista[3]);
        System.out.println(lista[4]);
        System.out.println(lista[5]);
        System.out.println(lista[6]);
        System.out.println(lista[7]);

    }
}
