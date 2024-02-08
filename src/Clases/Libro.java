package Clases;

public class Libro {

	private int id_libro;
	private String titulo_Libro;
	private String autor_Libro;
	private int num_pag;
	
	public Libro() {
	}
	public Libro(int id_libro, String titulo_Libro, String autor_Libro, int num_pag) {
		this.id_libro = id_libro;
		this.titulo_Libro = titulo_Libro;
		this.autor_Libro = autor_Libro;
		this.num_pag = num_pag;
	}
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getTitulo_Libro() {
		return titulo_Libro;
	}
	public void setTitulo_Libro(String titulo_Libro) {
		this.titulo_Libro = titulo_Libro;
	}
	public String getAutor_Libro() {
		return autor_Libro;
	}
	public void setAutor_Libro(String autor_Libro) {
		this.autor_Libro = autor_Libro;
	}
	public int getNum_pag() {
		return num_pag;
	}
	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}
	
	
}
