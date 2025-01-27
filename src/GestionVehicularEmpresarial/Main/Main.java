package GestionVehicularEmpresarial.Main;

import GestionVehicularEmpresarial.Utiles.Utiles;
import java.util.*;
public class Main {
     static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Utiles validador = new Utiles();
        System.out.println("ingrese un numero decimal: ");
        int valor  = validador.validarEntero();
        System.out.println(valor);
    }
}
