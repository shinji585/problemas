package GestionVehicularEmpresarial.Empresa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import GestionVehicularEmpresarial.Servicios.Servicio;
import GestionVehicularEmpresarial.Servicios.TiposVehiculos.Motocicleta;
import GestionVehicularEmpresarial.Utiles.Utiles;

public class Empresa extends Servicio {
    Utiles validador = new Utiles();
    static Scanner s = new Scanner(System.in);
    Motocicleta motocicleta = new Motocicleta();
    static ArrayList<Motocicleta> pasadorCaracteristica = new ArrayList<>();
    private HashMap<Integer, ArrayList<Motocicleta>> gestionMoto = new HashMap<>();
    private int ID = 0;

    public Empresa() {
    }

    public Empresa(int id) {
        this.ID += id;
    }

    public void setId(int id) {
        this.ID += id;
    }

    public int getId() {
        return this.ID;
    }

    // Métodos que gestionarán los servicios
    public ArrayList<Motocicleta> gestionarMotos() {
        System.out.println("----- Bienvenido al sistema de gestión de motocicletas -----");
        System.out.println("A continuación, se le solicitará ingresar una serie de datos. Por favor, siga las instrucciones.");
        
        System.out.print("Ingrese el tipo de motor que tiene la motocicleta: ");
        motocicleta.setTipoMotor(validador.validadorString());
        
        System.out.print("Ingrese la potencia máxima del motor (en HP): ");
        motocicleta.setPotencia(validador.validarDouble());
        
        System.out.print("Ingrese la velocidad máxima de la motocicleta (en km/h): ");
        motocicleta.setVelocidadMaxima(validador.validarDouble());
        
        System.out.print("Ingrese el color de la motocicleta: ");
        motocicleta.setColor(validador.validadorString());
        
        System.out.println("----- Información adicional de la motocicleta -----");
        
        System.out.print("Ingrese la marca de la motocicleta: ");
        motocicleta.setMarca(validador.validadorString());
        
        System.out.print("Ingrese el tipo de suspensión de la motocicleta: ");
        motocicleta.setSuspension(validador.validadorString());
        
        System.out.print("Ingrese el número máximo de pasajeros que soporta la motocicleta: ");
        motocicleta.setNumeropasajero(validador.validarEntero());
        
        System.out.print("Ingrese el tipo de motocicleta (por ejemplo: deportiva, turismo): ");
        motocicleta.settipoMotocicleta(validador.validadorString());
        
        System.out.print("Ingrese el peso máximo que soporta la motocicleta (en kg): ");
        motocicleta.setpesoMaximo(validador.validarDouble());
        
        // Añadimos la instancia de motocicleta al ArrayList
        pasadorCaracteristica.add(motocicleta);
        return pasadorCaracteristica;
    }

    // Manejar HashMap
    public HashMap<Integer, ArrayList<Motocicleta>> manejarHashmap() {
        System.out.print("Ingrese un nuevo ID para registrar las motocicletas: ");
        setId(validador.validarEntero());
        gestionMoto.put(getId(), pasadorCaracteristica);
        return gestionMoto;
    }

    // Visualizar contenido del HashMap
    public void visualizarHashmap() {
        System.out.println("------- Datos registrados en el sistema -------");
        if (gestionMoto.isEmpty()) {
            System.out.println("No hay datos registrados.");
        } else {
            for (Map.Entry<Integer, ArrayList<Motocicleta>> entrada : gestionMoto.entrySet()) {
                System.out.println("ID: " + entrada.getKey() + ", Detalles: " + entrada.getValue());
            }
        }
    }

    // Eliminar datos del HashMap
    public void eliminarDatos(int valor) {
        if (gestionMoto.containsKey(valor)) {
            gestionMoto.remove(valor);
            System.out.println("El registro con ID " + valor + " ha sido eliminado exitosamente.");
        } else {
            System.out.println("El ID ingresado no existe. Por favor, intente nuevamente.");
        }
    }
}
