/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaswdsab_array;

import java.util.Scanner;

public class B {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai untuk array acak Number : ");
        int v = s.nextInt();
        int[] acakNumber = new int[v];
        
        //input nillai
        for (int i = 0; i < v; i++) {
            System.out.print("nilai ke-" + i + " : ");
            acakNumber[i] = s.nextInt();
     
        }
        
        //output nilai
        System.out.print("Nilai array : ");
        System.out.print(" [ ");
        for (int i : acakNumber) {
            System.out.print(i + " ");
            
        }
        System.out.println(" ] ");
    }
    
}
