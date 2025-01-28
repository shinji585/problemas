package GestionVehicularEmpresarial.Utiles;

import java.util.*;

public class Utiles {
    // Constructor vacío
    public Utiles() {}

    static Scanner s = new Scanner(System.in);

    /**
     * Método para validar una entrada de texto.
     * Verifica que la entrada no contenga caracteres especiales, no esté vacía, y tenga más de un carácter.
     * @return Una cadena válida ingresada por el usuario.
     */
    public String validadorString() {
        String valor = "";
        boolean controlador = true;

        do {
            try {
                System.out.print("Ingrese un valor (sin caracteres especiales): ");
                valor = s.nextLine();

                if (valor.matches(".*[?|°&{}^*+\\\\-].*")) {
                    System.out.println("La entrada no puede contener caracteres especiales. Por favor, intente de nuevo.");
                } else if (valor.isEmpty() || valor.length() <= 1) {
                    System.out.println("La entrada no puede estar vacía, ser un único carácter o comenzar con un número.");
                } else {
                    controlador = false; // La entrada es válida
                }
            } catch (Exception e) {
                System.out.println("Error desconocido. Por favor, intente de nuevo.");
            }
        } while (controlador);

        return valor;
    }

    /**
     * Método para validar una entrada numérica de tipo double.
     * Verifica que el valor sea un número decimal mayor a cero.
     * @return Un número decimal válido ingresado por el usuario.
     */
    public double validarDouble() {
        boolean controlador = true;
        double valor = 0;

        while (controlador) {
            try {
                System.out.print("Ingrese un número decimal mayor a cero: ");

                while (!s.hasNextDouble()) {
                    System.out.println("La entrada no es un número válido. Por favor, intente de nuevo.");
                    System.out.print("Ingrese un número decimal: ");
                    s.next();
                }

                valor = s.nextDouble();

                if (valor <= 0) {
                    System.out.println("El número debe ser mayor a cero. Intente nuevamente.");
                } else {
                    controlador = false; // La entrada es válida
                }
            } catch (Exception e) {
                System.out.println("Error desconocido de tipo " + e.getLocalizedMessage());
            }
        }

        return valor;
    }

    /**
     * Método para validar una entrada numérica de tipo entero.
     * Verifica que el valor sea un número entero mayor a cero.
     * @return Un número entero válido ingresado por el usuario.
     */
    public int validarEntero() {
        boolean controlador = true;
        int valor = 0;

        while (controlador) {
            try {
                System.out.print("Ingrese un número entero mayor a cero: ");

                while (!s.hasNextInt()) {
                    System.out.println("La entrada no es un número entero válido. Por favor, intente de nuevo.");
                    System.out.print("Ingrese un número entero: ");
                    s.next();
                }

                valor = s.nextInt();

                if (valor <= 0) {
                    System.out.println("El número debe ser mayor a cero. Intente nuevamente.");
                } else {
                    controlador = false; // La entrada es válida
                }
            } catch (Exception e) {
                System.out.println("Error desconocido de tipo " + e.getLocalizedMessage());
            }
        }

        return valor;
    }
}
