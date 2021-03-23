/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaswdsab_array;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class E {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("                    CAFE JAMAICA");
        System.out.println("                    ANEKA KOPI NAN MINUMAN");
        System.out.println("---------------------------------------------------");
        System.out.println("                    SPECIAL MENU");
        System.out.println("1. Coffee Mint");
        System.out.println("2. Soft Drink");
        System.out.println("3. Kopi Kapal Api");
        System.out.println("4.Soda Coffee");
        System.out.println("5. Tea Coffee");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = s.nextLine();
        System.out.print("Silahkan masukkan pilihan Anda : ");
        
        int op  = s.nextInt();
        String pilihan = " ";
        
        switch (op){
            case 1:
                pilihan = "Coffee Mint";
                break;
            case 2:
                pilihan = "Soft Drink";
                break;
            case 3:
                pilihan = "Kopi Kapal Api";
                break;
            case 4:
                pilihan = "Soda Coffee";
                break;
            case 5:
                pilihan = "Tea Coffee";
                break;
            default:
                System.out.println("Pilihan Anda Tidak Ada di Menu");
        }
        
        System.out.println("Minuman yang Anda Pesan adalah " + pilihan);
        System.out.println("Pesanan Anda akan Segera Kami Antar");
        System.out.println("Terimakasih " + nama + " Telah berkunjung ke CAFE JAMAICA");
    }
    
}
