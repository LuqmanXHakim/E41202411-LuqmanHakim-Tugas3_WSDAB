/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaswdsab_array;

import java.util.Scanner;

public class D {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("                    LUQMAN HAKIM");
        System.out.println("                Promo Belanja Berhadiah");
        System.out.println("            Khusus Pembelian 5 Pertama");
        System.out.println("          Dengan Harga Minimum Rp. 100.000,-");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = s.nextLine();
        int[] barang = new int[5];
        int total = 0;
        for (int i = 0; i < barang.length; i++){
            System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
            barang[i] = s.nextInt();
            total = total + barang[i];
            
        }
        
        System.out.println("Total pembelian atas nama" + nama + " adalah Rp. " + total);
        
        boolean promo = false;
        for (int i = 0; i < barang.length; i++){
            promo = barang[i] >= 5000;
        }
        
        if (promo == true){
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah cincin");
        } else {
            System.out.println("anda tidak mendapat promo");
        }
        
        System.out.println("---------------------------------------------------");
        System.out.println("                    Terimakasih");
        System.out.println("            Anda sudah berbelanja di X Smart");
        System.out.println("---------------------------------------------------");
    }
    
}
