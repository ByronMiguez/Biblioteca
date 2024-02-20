package Gestores;

import java.util.Scanner;

import Main.Menu;

public class GestorSocios {

	public static void run() {
		Scanner escanea = new Scanner(System.in);
        int opcion;
        do {
        	Menu.mostrarMenuSocio();
            System.out.print("Ingrese su opción: ");
            opcion = Integer.parseInt(escanea.nextLine());

            switch (opcion) {

                case Menu.INSERTAR_SOCIO:
                	System.out.println("Inserte un socio");
                	System.out.println("-------------");
                    break;
                case Menu.ELIMINAR_SOCIO:
                	System.out.println("Elimina un socio");       
                	System.out.println("-------------");
                    break;
                case Menu.MODIFICAR_SOCIO:
                	System.out.println("Modifica un socio");
                	System.out.println("-------------");
                    break;
                case Menu.VISUALIZAR_SOCIO:
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
