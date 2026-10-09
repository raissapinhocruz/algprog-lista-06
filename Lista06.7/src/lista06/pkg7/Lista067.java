/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06.pkg7;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista067 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero inteiro: ");
            numeros[i] = entrada.nextInt();

            soma = soma + numeros[i];
            multiplicacao = multiplicacao * numeros[i];
        }

        System.out.println("Numeros digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicacao: " + multiplicacao);

        entrada.close();
    
    }
    
}
