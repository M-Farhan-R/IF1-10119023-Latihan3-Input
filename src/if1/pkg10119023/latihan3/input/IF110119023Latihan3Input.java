/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan3.input;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Muhammad Farhan R
 * KELAS    : IF1
 * NIM      : 10119023
 * Deskripsi Program : Latihan membuat program input data
 */
public class IF110119023Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
