/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquecimento;

import java.util.Scanner;

/**
 *
 * @author CG3038947
 */
public class Bussola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = scanner.nextInt();

        scanner.nextLine();
        String jaEscolhidos = scanner.nextLine();

        String[] separados = jaEscolhidos.split(" ");

        int anguloEscolhido = numeroEscolhido % 359;

        int anguloFinal = verificaAngulo(separados, anguloEscolhido);

        System.out.println(anguloFinal);

    }

    public static int verificaAngulo(String[] separados, int anguloEscolhido) {
        for (String separado : separados) {
            int anguloOcupado = Integer.parseInt(separado);
            if (anguloOcupado == anguloEscolhido) {
                anguloEscolhido += 5;
                return verificaAngulo(separados, anguloEscolhido);
            }
        }

        return anguloEscolhido;
    }
}
