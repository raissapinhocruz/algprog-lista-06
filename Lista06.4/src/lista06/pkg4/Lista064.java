/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06.pkg4;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista064 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);

        char[] letras = new char[10];
        int quantidade = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um caractere: ");
            letras[i] = entrada.next().toLowerCase().charAt(0);
        }

        System.out.println("Consoantes digitadas:");

        for (int i = 0; i < 10; i++) {
            char letra = letras[i];

            if (Character.isLetter(letra)
                    && "aeiou".indexOf(letra) == -1) {
                System.out.println(letra);
                quantidade++;
            }
        }

        System.out.println("Quantidade de consoantes: " + quantidade);

        entrada.close();
    }
    
