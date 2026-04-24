/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquecimento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CG3038947
 */
public class Latinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int primeiraEntrada = scanner.nextInt();
        
        ArrayList<Integer> numerosSalasGanhadoras = new ArrayList<>();
        
        int pontuacaoAtual = 0;
        
        int salaGanhadora = 0;
        
        int maiorPontuacao = 0;
        
        while(primeiraEntrada != 0){
            
            for(int i = 1; i <= primeiraEntrada; i++){
                pontuacaoAtual = scanner.nextInt();
                
                if(pontuacaoAtual > maiorPontuacao){
                    maiorPontuacao = pontuacaoAtual;
                    salaGanhadora = i;
                }
                
            }
            
            numerosSalasGanhadoras.add(salaGanhadora);
            
            primeiraEntrada = scanner.nextInt();
            
            maiorPontuacao = 0;
        }
        
        for(int salas : numerosSalasGanhadoras){
            System.out.println(salas);
        }
    }
}
