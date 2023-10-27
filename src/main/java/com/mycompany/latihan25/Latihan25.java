/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan25;
import java.util.Scanner;
        
/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program nama depan untuk di eja dan program akan diulangi serta berhenti
 */
public class Latihan25 {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        while(ulangi){
            System.out.print("Masukkan nama depan anda untuk di eja : ");
            String nama = input.next();
            
            System.out.println("Ejaan untuk '"+nama+"' adalah ");
            
            int panjangNama = nama.length();
            for(int i = 0; i<panjangNama; i++){
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-"+(i+1)+" : "+huruf);
            }
            
          System.out.print("ulangi aktifitas? (ya/tidak)");
            String aktifitas = input.next().toUpperCase();                                
            
            if(aktifitas.equals("YA")){
                System.out.print("Program akan diulangi\n");                
            } else if(aktifitas.equals("TIDAK")){
                System.out.print("Program Berhenti Terimakasih\n");
                ulangi = false;
        }
        }
    }
    
}
