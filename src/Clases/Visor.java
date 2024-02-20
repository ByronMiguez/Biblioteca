package Clases;
import java.util.*;
public class Visor {
	
	public static void mostrarLibro (Libro libro) {
		System.out.println(libro);
	}
	public static void mostrarVariosLibros (ArrayList<Libro> libros) {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}
}
