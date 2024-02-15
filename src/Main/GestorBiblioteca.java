package Main;

import java.util.Scanner;

import Gestores.GestorLibros;
import Gestores.GestorPrestamo;
import Gestores.GestorSocios;

public class GestorBiblioteca {
	
	public static void main(String[] args) {
		run();
	}
	private static void run() {
		
		Scanner escanea = new Scanner(System.in);
        int opcion;
      
        do {
        	Menu.mostrarMenuPrincipal();
            System.out.print("Ingrese su opción: ");

            opcion = Integer.parseInt(escanea.nextLine());

            switch (opcion) {

                case Menu.GESTIONAR_LIBROS:
                	
                	GestorLibros.run();
                	
                    break;
                case Menu.GESTIONAR_SOCIOS:
                	
                	GestorSocios.run();
                	
                    break;
                case Menu.GESTIONAR_PRESTAMOS:
                	
                	GestorPrestamo.run();
                	
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

