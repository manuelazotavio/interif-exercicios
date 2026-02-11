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
public class OTesouroDosNumerosPrimos {

    // 2, 3, 5, 7, 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int divisivel = 0;
        int i = 2;
        

        while (i <= n) {
           
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        divisivel++;
                    }
                }
                
                if (divisivel == 0) {
                    System.out.print(i + " ");
                }
                
            divisivel = 0;
            i++;
            
        }

    }

}
