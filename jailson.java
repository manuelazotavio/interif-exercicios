package aquecimento;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author CG3038947
 */
public class Joilson {

    public static void main(String[] args) {

        ArrayList<Integer> cadeiras = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int fileiras = scanner.nextInt();
        int cadeirasPorFileira = scanner.nextInt();

        int pessoasPorFileira[][] = new int[fileiras][cadeirasPorFileira];

        for (int i = 0; i < fileiras; i++) {
            for (int j = 0; j < cadeirasPorFileira; j++) {
                pessoasPorFileira[i][j] = scanner.nextInt();
            }
        }

        int qtdVizinho = 0;

        int qtdMenorVizinho = Integer.MAX_VALUE;


        for (int i = 0; i < fileiras; i++) {
            for (int j = 0; j < cadeirasPorFileira; j++) {

                qtdVizinho = 0;

                if (pessoasPorFileira[i][j] == 1) {
                    continue; // cadeira ocupada, pula
                }

                //lado direito
                if (j + 1 < cadeirasPorFileira && pessoasPorFileira[i][j + 1] == 1) {
                    qtdVizinho++;
                }

                //de baixo
                if (i + 1 < fileiras && pessoasPorFileira[i + 1][j] == 1) {
                    qtdVizinho++;
                }

                //lado esquerdo
                if (j > 0 && pessoasPorFileira[i][j - 1] == 1) {
                    qtdVizinho++;
                }

                //de cima
                if (i > 0 && pessoasPorFileira[i - 1][j] == 1) {
                    qtdVizinho++;
                }

                //diagonal esquerda superior
                if ((i > 0 && j > 0) && pessoasPorFileira[i - 1][j - 1] == 1) {
                    qtdVizinho++;
                }

                //diagonal direita superior
                if ((i > 0 && j + 1 < cadeirasPorFileira) && pessoasPorFileira[i - 1][j + 1] == 1) {
                    qtdVizinho++;
                }

                //diagonal esquerda inferior
                if ((j > 0 && i + 1 < fileiras) && pessoasPorFileira[i + 1][j - 1] == 1) {
                    qtdVizinho++;
                }

                //diagonal direita inferior
                if ((i + 1 < fileiras && j + 1 < cadeirasPorFileira) && pessoasPorFileira[i + 1][j + 1] == 1) {
                    qtdVizinho++;
                }
                
                int numeroCadeira = i * cadeirasPorFileira + j + 1;

                if (qtdVizinho < qtdMenorVizinho) {
                    qtdMenorVizinho = qtdVizinho;
                    cadeiras.clear();
                    cadeiras.add(numeroCadeira);
                } else if (qtdVizinho == qtdMenorVizinho) {
                    cadeiras.add(numeroCadeira);
                }
            }

        }

        System.out.println(qtdMenorVizinho);
        for (int c : cadeiras) {
            System.out.println(c);
        }

    }
}
