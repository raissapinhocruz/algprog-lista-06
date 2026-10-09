/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06.pkg2;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero real: ");
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("Numeros na ordem inversa:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
    
}
