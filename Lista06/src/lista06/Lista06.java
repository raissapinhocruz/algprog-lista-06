/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Numeros digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }

    }
    

