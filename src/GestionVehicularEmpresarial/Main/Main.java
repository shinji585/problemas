package GestionVehicularEmpresarial.Main;

import GestionVehicularEmpresarial.Empresa.Empresa;
import GestionVehicularEmpresarial.Utiles.Utiles;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Utiles validador = new Utiles();
        Empresa empresa = new Empresa();
        int opcion;

        do {
            mostrarMenu();
            opcion = validador.validarEntero();

            switch (opcion) {
                case 1 -> gestionarMotocicletas(empresa, validador);
                case 2 -> System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 2);
    }

    // Método para mostrar el menú principal
    public static void mostrarMenu() {
        System.out.println("---------- Bienvenido a la Gestión Empresarial de Vehículos ---------");
        System.out.println("Seleccione una opción:");
        System.out.println("1 - Gestionar motocicletas");
        System.out.println("2 - Salir");
        System.out.print("Ingrese su opción: ");
    }

    // Método para gestionar motocicletas
    public static void gestionarMotocicletas(Empresa empresa, Utiles validador) {
        try {
            System.out.println("----- Acciones disponibles ------");
            System.out.println("1 - Agregar moto");
            System.out.println("2 - Eliminar datos de una moto");
            System.out.println("3 - Visualizar datos");
            System.out.print("Ingrese su elección: ");
            int accion = validador.validarEntero();

            switch (accion) {
                case 1 -> {
                    empresa.gestionarMotos();
                    empresa.manejarHashmap();
                    System.out.println("Motocicleta registrada con éxito.");
                }
                case 2 -> {
                    empresa.visualizarHashmap();
                    System.out.print("Ingrese el ID a eliminar: ");
                    int id = validador.validarEntero();
                    empresa.eliminarDatos(id);
                }
                case 3 -> empresa.visualizarHashmap();
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getLocalizedMessage());
        }
    }
}
