/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06.pkg5;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista065 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um numero inteiro: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                par[qtdPar] = numeros[i];
                qtdPar++;
            } else {
                impar[qtdImpar] = numeros[i];
                qtdImpar++;
            }
        }

        System.out.println("Vetor original:");

        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNumeros pares:");

        for (int i = 0; i < qtdPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nNumeros impares:");

        for (int i = 0; i < qtdImpar; i++) {
            System.out.print(impar[i] + " ");
        }

        entrada.close();
    }
    
}
