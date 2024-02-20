package Gestores;

import java.util.Scanner;

import Clases.Libro;
import Clases.Socio;

public class FormularioDeDatos {

	private static Scanner escanea = new Scanner(System.in);
	
	public static Libro pedirDatosLibro() {
		Libro l = new Libro();
		System.out.println("\n---------------------------");
		System.out.println("Titulo:");
		l.setTitulo_Libro(escanea.nextLine());
		
		System.out.println("\nAutor:");
		l.setAutor_Libro(escanea.nextLine());
		
		System.out.println("\nNumero de paginas:");
		l.setNum_pag(Integer.parseInt(escanea.nextLine()));
		
		return l;
	}
	public static Libro tituloLibro() {
		Libro l = new Libro();
		System.out.println("\n---------------------------");
		System.out.println("Titulo:");
		l.setTitulo_Libro(escanea.nextLine());
		
		return l;
	}
	
	public static int pedirIdLibro() {
		System.out.println("\nInserte id");
		return Integer.parseInt(escanea.nextLine());
	}
	
	public static Socio DNIsocio() {
		Socio s = new Socio();
		System.out.println("\n---------------------------");
		System.out.println();
		s.setDni(escanea.nextLine());
		return s;
	}
}
