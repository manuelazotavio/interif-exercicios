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
public class ClubinhoDaIsa {

    // 2, 3, 5, 7, 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        if (n4 != (n1 + n2 + n3)){
            System.out.println("NEGADO");
        } else {
            System.out.println("LIBERADO");
        }

    }

}
