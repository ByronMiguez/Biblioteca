package Gestores;

import java.util.Date;
import java.util.Scanner;

import Main.Menu;
import Clases.*;

public class GestorPrestamo {
	public static void run() {
		GestorBBDD gestorBBDD = new GestorBBDD();
		Scanner escanea = new Scanner(System.in);
		Socio s;
        int opcion;
        do {
        	Menu.mostrarMenuPrestamo();
            System.out.print("Ingrese su opción: ");
            opcion = Integer.parseInt(escanea.nextLine());

            switch (opcion) {

                case Menu.INSERTAR_PRESTAMO:
                	System.out.println("Inserte un prestamo");
                	System.out.println("-------------");
                	
                	gestorBBDD.conectar();
                	String tituloLibro = FormularioDeDatos.tituloLibro();
                	String dni = FormularioDeDatos.DNIsocio();
                	
                	Prestamos p = new Prestamos();
                	p.setDevuelto(false);
                	p.setFecha(new Date());
                	
                
                    break;
                case Menu.ELIMINAR_PRESTAMO:
                	System.out.println("Elimina un socio");       
                	System.out.println("-------------");
                    break;
                case Menu.MODIFICAR_PRESTAMO:
                	System.out.println("Modifica un socio");
                	System.out.println("-------------");
                    break;
                case Menu.VISUALIZAR_PRESTAMO:
                	System.out.println("Visuaiza un socio");
                	System.out.println("-------------");
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

