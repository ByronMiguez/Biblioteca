package Gestores;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

import Clases.*;
import Main.Menu;

public class GestorLibros {
	
	public static void run() {
		GestorBBDD gestorBBDD = new GestorBBDD();
		Libro l;
		Scanner escanea = new Scanner(System.in);
        int opcion;
        do {
        	Menu.mostrarMenuLibros();
            System.out.print("Ingrese su opción: ");
            opcion = Integer.parseInt(escanea.nextLine());

            switch (opcion) {

                case Menu.INSERTAR_LIBROS:
                	System.out.println("Inserte un libro");
                	
                	gestorBBDD.conectar();
                	gestorBBDD.insertarLibro(FormularioDeDatos.pedirDatosLibro());
                	gestorBBDD.cerrar();
                	
                    break;
                case Menu.ELIMINAR_LIBROS:
                	System.out.println("Elimina un libro");  
                	gestorBBDD.conectar();
                	gestorBBDD.eliminarLibro(FormularioDeDatos.pedirIdLibro());
                	gestorBBDD.cerrar();
                	
                    break;
                case Menu.MODIFICAR_LIBROS:
                	System.out.println("Modifica un libro");
                	
                	int id=FormularioDeDatos.pedirIdLibro();
                	
                	gestorBBDD.conectar();
//                	Visor.mostrarLibro(gestorBBDD.getLibro(id));
//                	gestorBBDD.modificarLibro(id, FormularioDeDatos.pedirDatosLibro());
                	gestorBBDD.cerrar();
                    break;
                case Menu.VISUALIZAR_LIBROS:
                	gestorBBDD.conectar();
                	System.out.println("Visuaiza un libro");
                	ArrayList<Libro> libros = new ArrayList<>();
                	libros = gestorBBDD.obtenerLibros();
                	Visor.mostrarVariosLibros(libros);
                	gestorBBDD.cerrar();
                	break;
                case Menu.SALIR:           
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }

        } while (opcion != 0);
        System.out.println("ADIOS");
        escanea.close();

    }
}



