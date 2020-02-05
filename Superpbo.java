package superpbo;

import java.util.Scanner;

public class Superpbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PBO 1");
        
        /*String nama = "Muddy";
        int umur = 19;
        System.out.println(nama + " " + umur );
        System.out.println(nama);
        System.out.print(nama);
        System.out.println(umur);*/
        
//        Scanner nama = new Scanner(System.in);
//        System.out.println("masukkan nama : ");
//        String userName = nama.nextLine();
//        System.out.println("Nama Saya : " + userName);
//        
//        Scanner umur = new Scanner(System.in);
//        System.out.println("masukkan umur : ");
//        int age = umur.nextInt();
//        System.out.println("Umur Saya : " + age);

        /*Scanner input = new Scanner(System.in);
       
        System.out.print("masukkan nama : ");
        String userName = input.nextLine();
        
        System.out.print("masukkan umur : ");
        int umur = input.nextInt();
        
        System.out.println("Nama : " + userName);
        System.out.println("Umur : " + umur);

        if (umur >= 17 & umur < 50) {
            System.out.println("dewasa");
        } 
        else if (umur < 17 ){
            System.out.println("anak anak");
        }
        else {
            System.out.println("tua");
        }*/
            Scanner input = new Scanner(System.in);
        
            System.out.println("Menu : ");
            System.out.println("1. Luas ");
            System.out.println("2. Volume");

            System.out.print("Pilih Menu : ");
            int pilih = input.nextInt();

            switch (pilih){
              case 1: 
                    System.out.println(" Menu Luas ");
                    System.out.println("1. Segitiga ");
                    System.out.println("2. Persegi");
                    
                    System.out.println("Pilih Menu : ");
                    int pilihlagi = input.nextInt();
                    
                    switch (pilihlagi){
                        case 1: 
                            System.out.println("Luas Segitiga");
                            
                            System.out.println("Masukkan Tinggi");
                            int tinggisgt = input.nextInt();
                            
                            System.out.println("Masukkan Alas");
                            int alassgt = input.nextInt();

                            System.out.println("1/2 x " + tinggisgt + " x " + alassgt);
                            System.out.print("Hasil : " );
                            System.out.println((0.5)*tinggisgt*alassgt);
                    }
        }
        
    }
}