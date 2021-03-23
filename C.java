/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaswdsab_array;

public class C {
    
    public static void main(String[] args){
        int[][] angka = {
            {5, 6, 1, 7},
            {8, 1, 2, 9},
            {5, 4, 7, 1},
            {8, 3, 7, 5},
        };
        
        for (int[] angka1 : angka) {
            System.out.print(" [ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(angka1 [j] + " ");
                
            }
            System.out.println(" ] ");
        }
    }
    
        
    
}
