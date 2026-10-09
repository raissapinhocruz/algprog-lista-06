/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista06.pkg6;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Lista066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;

            System.out.println("Aluno " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                double nota = entrada.nextDouble();

                soma = soma + nota;
            }

            medias[i] = soma / 4;

            System.out.println("Media do aluno: " + medias[i]);

            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("Medias dos alunos:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1)
                    + ": " + medias[i]);
        }

        System.out.println("Alunos com media maior ou igual a 7: "
                + aprovados);

        entrada.close();
    }
    
}
