
package modelo;

import java.util.Random;

public class GeraNumeros {
    Random gerador = new Random();
    public int[] geraNumeroCrescente(int n){
        int vet[] = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = i+1;
        }
        return vet;
    }
    public int[] geraNumeroDecrescente(int n){
        int vet[] = new int[n];
        int j=0;
        for (int i = n-1; i >= 0; i--) {
            vet[j] = i+1;
            j++;
        }
        return vet;
    }
    public int[] geraNumeroAleatorio(int n){
        int vet[] = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = gerador.nextInt(10);
        }
        return vet;
    }
}
