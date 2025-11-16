package com.github.affandes.kuliah.pm;

import java.io.File;
import java.util.Scanner;

public class DataBase {
    public void searchFromFile(String inputUser) {
        try {
            File file = new File("src/main/resources/DataBase/DataBase.txt");
            Scanner reader = new Scanner(file);

            String[] keywords = inputUser.toLowerCase().split(" ");
            boolean ketemu = false;

            System.out.println("\n=== HASIL PENCARIAN DI DATABASE ===");
            while (reader.hasNextLine()) {
                String line = reader.nextLine().toLowerCase();

                //pengecekan
                for (String key : keywords) {
                    if (key.length() > 2 && line.contains(key)) {  // hindari kata terlalu pendek
                        System.out.println(line);
                        ketemu = true;
                        break;
                    }
                }
            }

            if (!ketemu) {
                System.out.println("Tidak ada hasil..");
            }

            System.out.println("===================================\n");

            reader.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database: " + e.getMessage());
        }
    }

}
