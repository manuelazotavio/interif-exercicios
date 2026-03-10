/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o.bruxo.e.os.fracos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author CG3038947
 */
public class ConversandoEmSegredo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String linha;
        
        while(scanner.hasNextLine()){
            linha = scanner.nextLine().trim();
            
            if(linha.equals("0")) break;
            
            String[] partes = linha.split(" ");
            
            int operacao = Integer.parseInt(partes[0]);
            
            String mensagem = partes[1];
            String senha = partes[2];
            
            StringBuilder resultado = new StringBuilder();
            
            for (int i = 0; i < mensagem.length(); i++) {
                int posMsg = mensagem.charAt(i) - 'a';
                int N = senha.charAt(i) - 'a' + 1;
                int posResult;
                
                if (i % 2 == 0) {
    
                    if (operacao == 1) {
                        posResult = ((posMsg - N) % 26 + 26) % 26;
                    } else {
                        posResult = (posMsg + N) % 26;
                    }
                } else {
                   
                    if (operacao == 1) {
                        posResult = (posMsg + N) % 26;
                    } else {
                        posResult = ((posMsg - N) % 26 + 26) % 26;
                    }
                }
                
                resultado.append((char) ('a' + posResult));
                
            }
            
            System.out.println(resultado);
        }
    }
}
