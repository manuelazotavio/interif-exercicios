/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package o.bruxo.e.os.fracos;

import java.util.Scanner;

/**
 *
 * @author CG3038947
 */
public class OBruxoEOsFracos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int frasco0 = 0;
        int frasco1 = 1;
        int frasco2 = 2;
        int vogais = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        String criatura = scanner.nextLine();
        
        if (criatura.length() > 20 || criatura.length() < 1){
            System.out.println("O nome da criatura precisa ter entre 1 e 20 caracteres.");
        }
        
        criatura = criatura.toLowerCase();
        
        for (int i = 0; i < criatura.length(); i++) {
            char carac = criatura.charAt(i);
            
            if (carac == 'a' || carac == 'e' || carac == 'i' || carac == 'u' || carac == 'o'){
                vogais++;
            }
        }
        
        
        int resultado = vogais % 3;
        
        if (resultado >= 0 && resultado < 3) {
            System.out.println("frasco " + resultado);
        } else {
            System.out.println("resultado inválido");
        }
               
    }
    
}
