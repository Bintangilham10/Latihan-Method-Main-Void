/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmainvoid;

import java.util.Scanner;

/**
 *
 * @author Bintang.Ilham
 */
public class hewan {
    //membuat objek scan dari class library scanner//
    Scanner masukan = new Scanner (System.in);
    
    //mengisi variable hewan (String)//
    String[] Hewan = {"","Buaya","Tikus","Sapi"};
    
    void Perulangan(){
      
        //rumus perulangan dan i dalah 1 2 3//
        for (int i=1; i<4; i++ )
        {
            
            //mencetak isi variable hewan dan nomer (i) pada hewan//
            System.out.println(i+". "+Hewan[i]);
            }
    }
    
    void Percabangan(){
        
        //membuat batas angka inputan user ( 0 = unlimited )
        int pilihanhewan = 0 ;
        
        //menbuat inputan tipe data integet nextInt() dengan baris baru
        //ketika dienter
        //yang berisi nilai/value dari inputan user di objek masukan/input  
        System.out.print("Pilih Hewan Nomor : ");  
        pilihanhewan = masukan.nextInt();
        System.out.println("");
        
        //switch dari variabel hewan//
        switch(pilihanhewan){
            
            //case 1 akan tampil ketika user input no 1//
            case 1 :
                System.out.println("--------------------");
                System.out.println("Hewan : "+Hewan[1]);
                System.out.println("Kelompok Hewan : Karnivora");
                System.out.println("--------------------");
                break;     
            //case 1 akan tampil ketika user input no 2//    
            case 2 :
                System.out.println("--------------------");
                System.out.println("Hewan : "+Hewan[2]);
                System.out.println("Kelompok Hewan : Omnivora");
                System.out.println("--------------------");
                break;       
            //case 1 akan tampil ketika user input no 3//    
            case 3 :  
                System.out.println("--------------------");
                System.out.println("Hewan : "+Hewan[3]);
                System.out.println("Kelompok Hewan : Herbivora");
                System.out.println("--------------------");
                break;
            //akan tampil jika user menginput angka selain no 1-3//   
            default : 
                System.out.println("--------------------");
                System.out.println("Silakan Ulang Kembali");
                System.out.println("--------------------");
        }
        
    }
          
}  
    


     

    
     