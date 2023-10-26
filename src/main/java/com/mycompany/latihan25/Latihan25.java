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
 Deskripsi Program : Program ini berisi program nama depan untuk dieja dan program akan diulangi serta berhenti
 */
public class Latihan25 {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        while(ulangi){
            System.out.print("Masukkan nama depan anda untuk dieja : ");
            String nama = input.next();
            
            System.out.println("Ejaan untuk '"+nama+"' adalah ");
            
            int panjangNama = nama.length();
            for(int i = 0; i<panjangNama; i++){
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-"+(i+1)+" : "+huruf);
            }
            
            System.out.print("Ulangi Aktifitas? (ya/tidak)");
            String ulang = input.next();
            if(ulang == "ya"){
                System.out.println("Program akan diulangi");
            }else if(ulang == "tidak"){
                System.out.println("Program berhenti terimakasih");
                ulangi = false; 
        }
        }
    }
    
}
