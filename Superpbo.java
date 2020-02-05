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

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String userName = input.nextLine();
        System.out.print("masukkan umur : ");
        int umur = input.nextInt();
        System.out.println("Nama Saya : " + userName);
        System.out.println("Umur Saya : " + umur);

        if (umur >= 17 & umur < 50) {
            System.out.println("dewasa");
        } 
        else if (umur < 17 ){
            System.out.println("anak anak");
        }
        else {
            System.out.println("tua");
        }
            
        
    }
    
    private class Superaja {
        
    }
}
