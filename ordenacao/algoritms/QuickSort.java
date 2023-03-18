package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    public void quicksort(int[] elements, int menorIndice, int maiorIndice)
    {
        if(menorIndice >= maiorIndice)  // parar assim que os indices se cruzaram.
        {
            return ;
        }

        int indicePivo = elements[maiorIndice];
        int newPivo = Organiza(elements, menorIndice, maiorIndice, indicePivo);
        quicksort(elements, menorIndice, newPivo - 1);
        quicksort(elements, newPivo + 1, maiorIndice); // o +1 é necessário para não contar a partir do pivo
        return ;
    }

    private static int Organiza(int[] elements, int esquerda, int direita, int pivo)
    {
        int esq = esquerda; 
        
        int dir = direita; 
        while (esq < dir)
        {
            while (elements[esq] <= pivo && esq < dir)
            {
                esq++;
            }

            while (elements[dir] >= pivo && esq < dir)
            {
                dir--;
            }
            
            int save = elements[esq];
            elements[esq] = elements[dir];
            elements[dir] = save;

        }

        int save = elements[esq];
        elements[esq] = elements[direita];
        elements[direita] = save;

        return esq;
    }

    @Override
    public int[] sort(int[] elements)
    {         //{4, -1, 12, 20, 50, 2, 10, 15}
        int [] sorted = elements;
        quicksort(elements, 0, elements.length - 1);
        return sorted;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }
    public static void main(String[] args) {
        QuickSort L = new QuickSort();
        int[] lista = {4,2,5,-1,12};
        L.sort(lista);
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
        System.out.println(lista[3]);
        System.out.println(lista[4]);
        
    }
}

