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
public class Pacman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt();

        int tabuleiro[][] = new int[linhas][colunas];

        int fantasmas = scanner.nextInt();

        int LF = 0;
        int CF = 0;

        for (int i = 0; i < fantasmas; i++) {
            LF = scanner.nextInt();
            CF = scanner.nextInt();
            tabuleiro[LF - 1][CF - 1] = -1;
        }

        int LP = scanner.nextInt() - 1;

        int CP = scanner.nextInt() - 1;

        

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (tabuleiro[i][j] != -1) {
                    tabuleiro[i][j] = 1;
                }
            }
        }
        
        tabuleiro[LP][CP] = 0;
        
        
        
        scanner.nextLine();
        String movimentos = scanner.nextLine();
        
        String[] movSeparados = movimentos.split("");

        int pontuacao = 0;

        for (int i = 0; i < movSeparados.length; i++) {
            
            if (movSeparados[i].equals("N")) {
                
                if (LP - 1 >= 0) {
                    
                    if (tabuleiro[LP - 1][CP] > 0) {
                        pontuacao++;
                        tabuleiro[LP - 1][CP] = 0;
                    } else if (tabuleiro[LP - 1][CP] == -1) {
                        pontuacao = 0;
                    }
                    
                    LP = LP - 1;
                }

            }
            
            if (movSeparados[i].equals("S")) {

                if (LP + 1 < linhas) {
                    if (tabuleiro[LP + 1][CP] > 0) {
                        pontuacao++;
                        tabuleiro[LP + 1][CP] = 0;
                    } else if (tabuleiro[LP + 1][CP] == -1) {
                        pontuacao = 0;
                    }
                    
                    LP = LP + 1;
                }

            }
            
            if (movSeparados[i].equals("L")) {

                if (CP + 1 < colunas) {
                    if (tabuleiro[LP][CP + 1] > 0) {
                        pontuacao++;
                        tabuleiro[LP][CP + 1] = 0;
                    } else if (tabuleiro[LP][CP + 1] == -1) {
                        pontuacao = 0;
                    }
                    
                    CP = CP + 1;
                }

            }
            
            if (movSeparados[i].equals("O")) {

                if (CP - 1 >= 0) {
                    if (tabuleiro[LP][CP - 1] > 0) {
                        pontuacao++;
                        tabuleiro[LP][CP - 1] = 0;
                    } else if (tabuleiro[LP][CP - 1] == -1) {
                        pontuacao = 0;
                    }
                    
                    CP = CP - 1;
                }

            }
        }
        
        System.out.println(pontuacao);

    }
}
