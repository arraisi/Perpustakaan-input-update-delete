package tes1;

import java.util.Map;

public class Perpustakaan {
	private Map<String, Book> daftarBuku;
	private String namaPerpustakaan;

	public Map<String, Book> getDaftarBuku() {
		return daftarBuku;
	}

	public void setDaftarBuku(Map<String, Book> daftarBuku) {
		this.daftarBuku = daftarBuku;
	}

	public String getNamaPerpustakaan() {
		return namaPerpustakaan;
	}

	public void setNamaPerpustakaan(String namaPerpustakaan) {
		this.namaPerpustakaan = namaPerpustakaan;
	}

}
