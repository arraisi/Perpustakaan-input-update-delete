package tes1.perpustakaan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import tes1.Book;
import tes1.Perpustakaan;
import tes1.Peminjam;

public class MainPerpustakaan {

    public static void main(String[] args) {
        boolean isTambah = true;
        boolean isKurang = true;
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();
        Peminjam pinjam = new Peminjam();
        Map<String, Peminjam> daftarPeminjam = new LinkedHashMap<String, Peminjam>();
//************************************************************************** 
        /*DAFTAR BUKU*/
//************************************************************************** 
//INPUT DATA BUKU        
        Map<String, Book> daftarBukuOut = inputData();
        showData(daftarBukuOut);

//UPDATE DATA
        Map<String, Book> daftarBukuUpdate = updateData(daftarBukuOut);
        showData(daftarBukuUpdate);

//MENGHAPUS DATA                
        Map<String, Book> daftarBukuDelete = deleteData(daftarBukuOut);
        showData(daftarBukuUpdate);

//**************************************************************************        
        /*DAFTAR PEMINJAM*/
//**************************************************************************
//INPUT DATA PEMINJAM
        Map<String, Peminjam> daftarPeminjamInput = inputPeminjam();
        showDataPeminjam(daftarPeminjamInput);

//DELETE DATA PEMINJAM
        Map<String, Peminjam> daftarPeminjamDelete = deleteDataPeminjam(daftarPeminjamInput);
        showDataPeminjam(daftarPeminjamInput);

        /*BATAS MAIN*/
    }

//METHODS TAMPILAN BOOK
    public static void showData(Map<String, Book> daftarBuku) {
        for (Map.Entry<String, Book> entry : daftarBuku.entrySet()) {
            System.out.println(entry.getKey());
            Book buku = entry.getValue();
            System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
        }
        System.out.println("____________________________________________________________________ ");
    }

//METHODS INPUT
    public static Map<String, Book> inputData() {
        boolean isTambah = true;
        boolean isKurang = true;
        Map<String, Book> daftarBuku = new LinkedHashMap<String, Book>();
        while (isTambah) {
            Scanner input = new Scanner(System.in);
            Perpustakaan perpus = new Perpustakaan();
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
            //return daftarBuku;
        }
        return daftarBuku;
    }

//METHODS UPDATE
    public static Map<String, Book> updateData(Map<String, Book> /*Nama baru/ mengganti daftarBuku*/ updateData) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
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
            updateData.put(input.next(), book);
            return updateData;
        }
        return updateData;
    }

//METHODS DELETE
    public static Map<String, Book> deleteData(Map<String, Book> deleteData) {
        boolean isTambah = true;
        boolean isKurang = true;
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        String delete = "iya";
        System.out.println("Ingin Delete Data Buku? jawab dengan iya/tidak");
        delete = input.next();

        if (delete.equals("iya")) {
            //baru dicopy
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
                    deleteData.remove(jawabSementara);
                    isKurang = false;
                    for (Map.Entry<String, Book> entry : deleteData.entrySet()) {
                        System.out.println(entry.getKey());
                        Book buku = entry.getValue();
                        System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
                    }
                    System.out.println("____________________________________________________________________ ");
                } else {
                    for (Map.Entry<String, Book> entry : deleteData.entrySet()) {
                        System.out.println(entry.getKey());
                        Book buku = entry.getValue();
                        System.out.println(" Judul  Buku : " + buku.getTitle() + "  pengarang " + buku.getAuthor());
                    }
                    System.out.println("____________________________________________________________________ ");
                    isKurang = true;
                }
            }
        }
        return deleteData;
    }
//METHODS TAMPILAN PEMINJAM

    public static void showDataPeminjam(Map<String, Peminjam> daftarPeminjam) {
        for (Map.Entry<String, Peminjam> entry : daftarPeminjam.entrySet()) {
            System.out.println(entry.getKey());
            Peminjam pinjam = entry.getValue();
            System.out.println(" Nama : " + pinjam.getName() + "  Alamat " + pinjam.getAddres());
        }
        System.out.println("____________________________________________________________________ ");
    }
//METHODS INPUT PEMINJAM

    public static Map<String, Peminjam> inputPeminjam() {
        boolean isTambah = true;
        boolean isKurang = true;
        Map<String, Peminjam> daftarPeminjam = new LinkedHashMap<String, Peminjam>();
        while (isTambah) {
            Scanner input = new Scanner(System.in);
            Peminjam pinjam = new Peminjam();
            System.out.println(" ***********************************************************");
            System.out.println(" Tambah Data Peminjam ! ");
            System.out.print(" Nama : ");
            pinjam.setName(input.next());
            System.out.print(" Alamat : ");
            pinjam.setAddres(input.next());
            System.out.print(" ID : ");
            daftarPeminjam.put(input.next(), pinjam);
            System.out.print(" Tambah data baru kembali ?(jawab dengan true/false : ");
            isTambah = input.nextBoolean();
            //return daftarBuku;
        }
        return daftarPeminjam;
    }

//METHODS DELETE PEMINJAM
    public static Map<String, Peminjam> deleteDataPeminjam(Map<String, Peminjam> deleteDataPeminjam) {
        boolean isTambah = true;
        boolean isKurang = true;
        Scanner input = new Scanner(System.in);

        String delete = "iya";
        System.out.println("Ingin Delete Data Peminjam? jawab dengan iya/tidak");
        delete = input.next();

        if (delete.equals("iya")) {
            //baru dicopy
            while (isKurang) {
                System.out.println(" ***********************************************************");

                Peminjam pinjam = new Peminjam();

                System.out.print(" ID : ");
                String jawabSementara = input.next();

                String yakin = "y";
                System.out.println("y/n");
                yakin = input.next();

                if (yakin.equals("y")) {
                    deleteDataPeminjam.remove(jawabSementara);
                    isKurang = false;
                    for (Map.Entry<String, Peminjam> entry : deleteDataPeminjam.entrySet()) {
                        System.out.println(entry.getKey());
                        Peminjam siPeminjam = entry.getValue();
                        System.out.println(" Judul  Buku : " + siPeminjam.getName() + "  pengarang " + siPeminjam.getAddres());
                    }
                    System.out.println("____________________________________________________________________ ");
                } else {
                    for (Map.Entry<String, Peminjam> entry : deleteDataPeminjam.entrySet()) {
                        System.out.println(entry.getKey());
                        Peminjam siPeminjam = entry.getValue();
                        System.out.println(" Judul  Buku : " + siPeminjam.getName() + "  pengarang " + siPeminjam.getAddres());
                    }
                    System.out.println("____________________________________________________________________ ");
                    isKurang = true;
                }
            }
        }
        return deleteDataPeminjam;
    }
}
