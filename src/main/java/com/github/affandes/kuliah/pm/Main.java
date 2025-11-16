package com.github.affandes.kuliah.pm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Browse browsing = new Browse();
        DataBase search = new DataBase();

        boolean program = true;

        while (program){
            try {
                System.out.println("1. Browsing");
                System.out.println("2. View");
                if(browsing.menuBack){
                    System.out.println("3. Back");
                }
                System.out.println("0. Exit");
                System.out.print("Input : ");

                int pilihan = input.nextInt();
                input.nextLine();


                if (pilihan == 1){
                    System.out.print("Mau cari apa? :");
                    String cari = input.nextLine();
                    browsing.browse(cari);
                    search.searchFromFile(cari);


                } else if (pilihan == 2) {
                    browsing.view();
                } else if (pilihan == 3 && browsing.menuBack) {
                    browsing.back();
                } else if (pilihan == 0) {
                    program = false;
                }else {
                    System.out.println("Inputan Salah");
                }
            } catch (Exception e) {
                System.out.println("Nilai harus berupa angka(int)!!!!");
                return;

            }
        }
    }
}