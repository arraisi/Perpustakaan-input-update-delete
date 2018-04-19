package tes1.perpustakaan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import tes1.Book;
import tes1.Perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {
        boolean isTambah = true;
        boolean isKurang = true;
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();
        while (isTambah) {
            System.out.println(" ***********************************************************");
            System.out.println(" Tambah Data Buku ! ");
            System.out.print(" Judul Buku : ");
            Book book = new Book();
            book.setTitle(input.next());
            System.out.print(" Pengarang : ");
            book.setAuthor(input.next());
            System.out.print(" No ISBN : ");
            daftarBuku.put(input.next(), book);
            System.out.print(" Tambah data baru kembali ?(jawab dengan true/false : ");
            isTambah = input.nextBoolean();

        }

        for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
            System.out.println(entry.getKey());
            Book buku = entry.getValue();
            System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
        }
        System.out.println("____________________________________________________________________ ");
//UPDATE DATA
        String update = "iya";
        System.out.println("Ingin Update Data Buku? jawab dengan iya/tidak");
        update = input.next();

        if (update.equals("iya")) {
            System.out.println(" ***********************************************************");
            System.out.println(" Update Data Buku ! ");
            System.out.print(" Judul Buku : ");
            Book book = new Book();
            book.setTitle(input.next());
            System.out.print(" Pengarang : ");
            book.setAuthor(input.next());
            System.out.print(" No ISBN : ");
            daftarBuku.put(input.next(), book);

        }
        for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
            System.out.println(entry.getKey());
            Book buku = entry.getValue();
            System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
        }
        System.out.println("____________________________________________________________________ ");
//MENGHAPUS DATA                
        while (isKurang) {
            System.out.println(" ***********************************************************");
            System.out.println(" Ingin Menghapus Data Buku ? ");
            Book book = new Book();

            System.out.print(" No ISBN : ");
            String jawabSementara = input.next();

            String yakin = "y";
            System.out.println("y/n");
            yakin = input.next();

            if (yakin.equals("y")) {
                daftarBuku.remove(jawabSementara);
                isKurang = false;
                for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                    System.out.println(entry.getKey());
                    Book buku = entry.getValue();
                    System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
                }
                System.out.println("____________________________________________________________________ ");
            } else {
                for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
                    System.out.println(entry.getKey());
                    Book buku = entry.getValue();
                    System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
                }
                System.out.println("____________________________________________________________________ ");
                isKurang = true;
            }
        }
        for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
            System.out.println(entry.getKey());
            Book buku = entry.getValue();
            System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
        }
        System.out.println("____________________________________________________________________ ");

//UPDATE BUKU
    }
}
