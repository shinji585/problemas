package SistemaTransporteProblemas.sistemaTranspoertePublico.Main;


import java.util.*;

import SistemaTransporteProblemas.sistemaTranspoertePublico.servicios.Utilidad;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        // mostramos la bienvenidad 
        int option = 0;
        do {
            Mostrarinfo();
            option = s.nextInt();
            switch (option) {
                case 1 ->{
                    
                    System.out.print("ingrese el tipo de vehiculo: ");
                    String pasador1 = s.nextLine();
                    s.nextLine();
                    System.out.print("ingrese la marca del vehiculo: ");
                    String pasador2 = s.nextLine();
                    s.nextLine();
                    System.out.print("ingrese la capacidad del vehiculo: ");
                    int pasador3 = s.nextInt();
                    s.nextLine();
                    // solicitamos la placa y el conductor del vehiculo asi como el año del
                    System.out.print("ingrese la placa del vehiculo: ");
                    String pasador4 = s.nextLine();
                    s.nextLine();
                    System.out.print("ingrese el nombre del conductor: ");
                    String pasador5 = s.nextLine();
                    // pasamos los valores a las instancias de nuestra clase 
                    Utilidad vehiculos = new Utilidad(pasador2, pasador1, pasador3, pasador5, pasador4);
                    System.out.print("\na continuacion podra visualizar sus datos");
                    vehiculos.wathInfo();
                }case 2->{
                  System.out.print("ingrese el pasaje que le ofrece el pasajero: ");
                  double pasajePasador = s.nextDouble();
                  Utilidad pasajero = new Utilidad();
                  pasajero.cobrarPasaje(pasajePasador);
                  pasajero.setPasaje(pasajePasador);
                }
            }
        } while (option < 3);
    }
    // metodo void para mostrar las dos acciones a realizar 
    public static void Mostrarinfo(){
        System.out.println("----- Bienvenido al mundo de viajes ------");
        System.out.println("\nPor favor, selecciona una acción:");
        System.out.println("\t1. Agregar vehículo");
        System.out.println("\t2. Agregar pasajero");
        System.out.println("\t3. Salir de la aplicación");
        System.out.print("Ingrese su opción: ");
    }
}
