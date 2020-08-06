
package modelo;

public class Ordenacao<T extends Comparable<T>> {

    public int[] bubbleSort(int v[]) {
        for (int k = v.length; k >= 1; k--) {

            for (int j = 1; j < k; j++) {

                if (v[j - 1] > v[j]) {
                    troca(v, j, j - 1);
                }
            }

        }
        return v;
    }

    public void troca(int v[], int m, int n) {

        int aux = v[m];
        v[m] = v[n];
        v[n] = aux;

    }

    public int[] insertionSort(int v[]) {

        int j;
        int k = 0;
        int i;

        for (j = 1; j < v.length; j++) {
            k = v[j];

            for (i = j - 1; (i >= 0) && (v[i] > k); i--) {
                v[i + 1] = v[i];

            }

            v[i + 1] = k;

        }

        return v;
    }

    public int[] shellSort(int[] v) {
        int h = 1;
        int n = v.length;

        while (h < n) {
            h = h * 3 + 1;
        }

        h = h / 3;
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = v[i];
                j = i;
                while (j >= h && v[j - h] > c) {

                    v[j] = v[j - h];
                    j = j - h;
                    if (j <= h) {
                        break;
                    }
                }
                v[j] = c;

            }
            h = h / 2;

        }

        return v;
    }
    
    public int[] quickSort(int[] vetor, int inicio, int fim) {
             if (inicio < fim) {
                    int pivo = separar(vetor, inicio, fim);
                    quickSort(vetor, inicio, pivo - 1);
                    quickSort(vetor, pivo + 1, fim);
             }
             return vetor;
       }
       
       private static int separar(int[] vetor, int inicio, int fim) {
             int pivo = vetor[inicio];
             int i = inicio + 1, f = fim;
             while (i <= f) {
                    if (vetor[i] <= pivo)
                           i++;
                    else if (pivo < vetor[f])
                           f--;
                    else {
                           int troca = vetor[i];
                           vetor[i] = vetor[f];
                           vetor[f] = troca;
                           i++;
                           f--;
                    }
             }
             vetor[inicio] = vetor[f];
             vetor[f] = pivo;
             return f;
       }
    public int[] mergeSort(int[] v, int[] w, int ini, int fim) {
        if (ini < fim) {
            int meio = (ini + fim) / 2;
            mergeSort(v, w, ini, meio);
            mergeSort(v, w, meio + 1, fim);
            intercala(v, w, ini, meio, fim);
        }
        return v;
        

    }

    public void intercala(int[] v, int[] w, int ini, int meio, int fim) {
        for (int k = ini; k <= fim; k++) {
            w[k] = v[k];
        }

        int i = ini;
        int j = meio + 1;

        for (int k = ini; k <= fim; k++) {
            if (i > meio) {
                v[k] = w[j++];
            } else if (j > fim) {
                v[k] = w[i++];
            } else if (w[i] < w[j]) {
                v[k] = w[i++];
            } else {
                v[k] = w[j++];
            }
        }
    }
    
    public int[] heapSort(int[] v) {
        constMaiorHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            troca2(v, i, 0);
            heapify(v, 0, --n);
        }

        return v;
    }

    private static void constMaiorHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            heapify(v, i, v.length);
        }

    }

    private static void heapify(int[] vetor, int pos, int tamVet) {

        int max = 2 * pos + 1, direita = max + 1;
        if (max < tamVet) {

            if (direita < tamVet && vetor[max] < vetor[direita]) {
                max = direita;
            }

            if (vetor[max] > vetor[pos]) {
                troca2(vetor, max, pos);
                heapify(vetor, max, tamVet);
            }
        }
    }

    public static void troca2(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }

    public void copiar(int[] vet, int[] h) {
        System.arraycopy(vet, 0, h, 0, h.length);
    }
}
