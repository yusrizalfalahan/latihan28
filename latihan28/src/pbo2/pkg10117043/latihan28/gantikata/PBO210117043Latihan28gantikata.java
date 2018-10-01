/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan28.gantikata;
import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk mengganti kata 
 *                        sesuai kata yang dipilih dalam suatu kalimat
 * @author Acer
 */
public class PBO210117043Latihan28gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimatawal;
        String kalimatbaru;
        String gantikata;
        String jadikata;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Ganti kata======\n ");
        System.out.print("masukkan kalimat: ");kalimatawal = scn.nextLine();
        System.out.print("ganti kata: ");gantikata = scn.next();
        System.out.print("menjadi kata: ");jadikata = scn.next();
        kalimatbaru = (kalimatawal).replaceAll(gantikata,jadikata);
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("kaliamat awal: " + kalimatawal);
        System.out.println("kaliamat baru: " + kalimatbaru);
        
        
        
    }
    
}
