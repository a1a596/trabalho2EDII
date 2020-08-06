package controle;

import java.util.Arrays;
import modelo.Ordenacao;
import modelo.GeraNumeros;

public class TesteSorts {

    public static void main(String[] args) {
        Ordenacao testes = new Ordenacao();
        GeraNumeros gerador = new GeraNumeros();
        float mediaTempo = 0;
        float mediaTempo1 = 0;
        float mediaTempo2 = 0;
        float mediaTempo3 = 0;
        float mediaTempo4 = 0;
        float mediaTempo5 = 0;
        int[] vet = gerador.geraNumeroAleatorio(10000);

        int[] vet1 = new int[vet.length];
        int[] vet2 = new int[vet.length];
        int[] vet3 = new int[vet.length];
        int[] vet4 = new int[vet.length];
        int[] vet5 = new int[vet.length];
        int[] vet6 = new int[vet.length];
        for (int i = 0; i < vet.length; i++) {
            vet1[i] = vet[i];
            vet2[i] = vet[i];
            vet3[i] = vet[i];
            vet4[i] = vet[i];
            vet5[i] = vet[i];
            vet6[i] = vet[i];
        }
        int[] w = new int[vet5.length];
        for (int i = 0; i < 100; i++) {

            long tmpinicial = System.nanoTime();

            System.out.printf("\nVetor: %s", Arrays.toString(vet));
            System.out.printf("\nBubbleSort: %s", Arrays.toString(testes.bubbleSort(vet1)));
            //Arrays.toString(testes.bubbleSort(vet1));

            //System.out.println("\n");

            long tmpfinal = System.nanoTime();
            mediaTempo += (tmpfinal - tmpinicial);
        }
        mediaTempo = mediaTempo /100;
        System.out.println("Bolha:");
        System.out.printf("Tempode execução em nanosegundos: %.2f\n", mediaTempo);

        for (int i = 0; i < 100; i++) {

            long tmpinicial = System.nanoTime();

            System.out.printf("\nVetor: %s", Arrays.toString(vet));
            System.out.printf("\nInsertionSort: %s", Arrays.toString(testes.insertionSort(vet2)));
            //Arrays.toString(testes.insertionSort(vet2));
            //System.out.println("\n");

            long tmpfinal = System.nanoTime();
            mediaTempo2 += (tmpfinal - tmpinicial);
        }
        mediaTempo2 = mediaTempo2 /100;
        System.out.println("Insertion:");
        System.out.printf("Tempode execução em nanosegundos: %.2f\n", mediaTempo2);
        for (int i = 0; i < 100; i++) {

            long tmpinicial = System.nanoTime();

            System.out.printf("\nVetor: %s", Arrays.toString(vet));
            System.out.printf("\nShellSort: %s", Arrays.toString(testes.shellSort(vet3)));
            //Arrays.toString(testes.shellSort(vet3));
            //System.out.println("\n");

            long tmpfinal = System.nanoTime();
            mediaTempo2 += (tmpfinal - tmpinicial);
        }
        mediaTempo2 = mediaTempo2 /100;
        System.out.println("Shell:");
        System.out.printf("Tempode execução em nanosegundos: %.2f\n", mediaTempo2);

        for (int i = 0; i < 100; i++) {

            long tmpinicial = System.nanoTime();

            System.out.printf("\nVetor: %s", Arrays.toString(vet));
            System.out.printf("\nQuickSort: %s", Arrays.toString(testes.quickSort(vet4, 0, vet4.length - 1)));
            //Arrays.toString(testes.quickSort(vet4, 0, vet4.length - 1));
            //System.out.println();

            long tmpfinal = System.nanoTime();
            mediaTempo3 += (tmpfinal - tmpinicial);
        }
        mediaTempo3 = mediaTempo3 /100;
        System.out.println("Quick:");
        System.out.printf("Tempode execução em nanosegundos: %.2f\n", mediaTempo3);

        for (int i = 0; i < 100; i++) {

            long tmpinicial = System.nanoTime();

            System.out.printf("\nVetor: %s", Arrays.toString(vet));  
            System.out.printf("\nMergeSort: %s", Arrays.toString(testes.mergeSort(vet5, w, 0, vet5.length - 1)));
            //Arrays.toString(testes.mergeSort(vet5, w, 0, vet5.length - 1));
            //System.out.println("\n");

            long tmpfinal = System.nanoTime();
            mediaTempo4 += (tmpfinal - tmpinicial);
        }
        mediaTempo4 = mediaTempo4 /100;
        System.out.println("Merge:");
        System.out.printf("Tempode execução em nanosegundos: %.2f\n", mediaTempo4);

        for (int i = 0; i < 100; i++) {

            long tmpinicial = System.nanoTime();
            System.out.printf("\nVetor: %s", Arrays.toString(vet));
            System.out.printf("\nHeapSort: %s", Arrays.toString(testes.heapSort(vet6)));
            //Arrays.toString(testes.heapSort(vet6));
            //System.out.println("\n");

            long tmpfinal = System.nanoTime();
            mediaTempo5 += (tmpfinal - tmpinicial);
        }
        mediaTempo5 = mediaTempo5 /100;
        System.out.println("Heap");
        System.out.printf("Tempode execução em nanosegundos: %.2f\n", mediaTempo5);

    }
    //System.out.printf("\nTempode execução em nanosegundos: %.2f\n", mediaTempo);
}
