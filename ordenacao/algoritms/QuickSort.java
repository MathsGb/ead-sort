package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    public int[] Organizador(int[] elements, int indicePivo){


        return elements;
    }
    
    @Override
    public int[] sort(int[] elements) {         //{4, -1, 12, 20, 50, 2, 10, 15}
        int [] sorted = elements;
        int indicePivo;


        return sorted;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

    public static void main(String[] args) {
        QuickSort L = new QuickSort();

        int[] lista = {4, -1, 12, 20, 50, 2, 10, 15};

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
