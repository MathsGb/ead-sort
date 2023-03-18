package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    public void Repartir(int[] elements){

        if(elements.length > 1) // a ideia é remover  o caso de array de 1 elemento apenas.
        {
            int meio = (elements.length) / 2;
    
            int[] esquerda = new int[meio];  
            int[] direita = new int[elements.length - meio];

            // Colocando elementos dentro de cada array repartido.
            for(int i = 0; i < meio; i++)     // Parte esquerda
            {
                esquerda[i] = elements[i];  
            }

            for(int i = meio ; i < elements.length; i++)    // Parte direita 
            {
                direita[i - meio] = elements[i];
            }

            Repartir(esquerda); // recurssão para dividir em cada vez menor.
            Repartir(direita);
            juntar(elements, esquerda, direita);

        }
    }

    public int[] juntar(int[] elements, int[] esquerda, int[] direita)
    {
        int indiceEsq = 0;
        
        int indiceDir = 0;
    
        int indiceFinal = 0;

        while(indiceEsq < esquerda.length && indiceDir < direita.length)
        {
            if(esquerda[indiceEsq] <= direita[indiceDir])
            {
                elements[indiceFinal] = esquerda[indiceEsq];
                indiceEsq++;
            }
            else
            {
                elements[indiceFinal] = direita[indiceDir];
                indiceDir++;
            }
            indiceFinal++;
        }

        while(indiceEsq < esquerda.length)  // Adicionar qualquer eleemento restante
        {   elements[indiceFinal] = esquerda[indiceEsq];
            indiceEsq++;
            indiceFinal++;
        }

        while(indiceDir < direita.length)
        {   elements[indiceFinal] = direita[indiceDir];
            indiceDir++;
            indiceFinal++;
        }
        // A ideia é que nesse ponto indiceFinal = indiceDir + indiceEsq (Ou seja um array com todo os elementos)
        return elements;
    }

    @Override
    public int[] sort(int[] elements)
    {
        int [] sorted = elements;

        Repartir(sorted);
        
        return sorted;
    }

    @Override
    public String getName()
    {
        return "MergeSort";
    }
}

