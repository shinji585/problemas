package GestionVehicularEmpresarial.Utiles;

import java.util.*;

public class Utiles {
    // creamos un constructor
    public Utiles() {
    } // constructor vacio

    static Scanner s = new Scanner(System.in);

    public String validadorString() {
        String valor = "";
        boolean controlador = true;
        do {
            try {
                System.out.print("ingrese el valor indicado: ");
                valor = s.nextLine();
                if (valor.matches(".*[?|°&{}^*+\\\\-].*")) {
                    System.out.println(
                            "la entrada no puede contener valores especiales\nIngrese un valor correcto por favor");
                } else {
                    controlador = false;
                }
                while (valor.isEmpty() || (valor.length() == 1) || (Character.isDigit(valor.charAt(0)))) {
                    System.out.print("la entrada no puede estar vacia\nIngrese una cadena de caracteres mayor a uno: ");
                    valor = s.nextLine();
                }

            } catch (Exception e) {
                System.out.println("error desconocido\nIngrese los datos de nuevo");
                s.nextLine();
            }
        } while (controlador);
        return valor;
    }

    public double validarDouble() {
        boolean controlador = true;
        double valor = 0;
        while (controlador) {
            try {
                System.out.print(
                        "ingrese el valor de su numero -----  este no puede ser menor de cero ------\nIngrese un valor numerico decimal: ");
                while (!s.hasNextDouble()) {
                    System.out.print("la entrada es incorrecta ---- intenten de nuevo ----\nIngrese un valor:  ");
                    s.next();
                }
                valor = s.nextDouble();

                while (valor < 0) {
                    System.out.print(
                            "el valor no puede ser menor a cero como se especifico\nIngrese un valor mayor a cero: ");
                    valor = s.nextDouble();
                }
                if (valor > 0) {
                    controlador = false;
                }
            } catch (Exception e) {
                System.out.println("error desconocido de tipo " + e.getLocalizedMessage());
            }
        }
        return valor;
    }
    public int validarEntero(){
        boolean controlador = true;
        int valor = 0;
        while (controlador) {
            try {
                System.out.print(
                        "ingrese el valor de su numero -----  este no puede ser menor de cero ------\nIngrese un valor numerico entero: ");
                while (!s.hasNextDouble()) {
                    System.out.print("la entrada es incorrecta ---- intenten de nuevo ----\nIngrese un valor:  ");
                    s.next();
                }
                valor = s.nextInt();

                while (valor < 0) {
                    System.out.print(
                            "el valor no puede ser menor a cero como se especifico\nIngrese un valor mayor a cero: ");
                    valor = s.nextInt();
                }
                if (valor > 0) {
                    controlador = false;
                }
            } catch (Exception e) {
                System.out.println("error desconocido de tipo " + e.getLocalizedMessage());
            }
        }
        return valor;
    }

}
