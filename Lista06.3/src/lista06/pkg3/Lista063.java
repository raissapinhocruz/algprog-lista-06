/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06.pkg3;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista063 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
        double media;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];
        }

        System.out.println("Notas digitadas:");

        for (int i = 0; i < 4; i++) {
            System.out.println(notas[i]);
        }

        media = soma / 4;

        System.out.println("Media: " + media);

        entrada.close();
    }
    
}
