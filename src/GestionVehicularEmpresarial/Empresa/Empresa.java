package GestionVehicularEmpresarial.Empresa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import GestionVehicularEmpresarial.Servicios.Servicio;
import GestionVehicularEmpresarial.Servicios.TiposVehiculos.Motocicleta;
import GestionVehicularEmpresarial.Utiles.Utiles;
public class Empresa extends Servicio{
    Utiles validador = new Utiles();
    Motocicleta motocicleta = new Motocicleta();
    static  ArrayList<Motocicleta> pasadorCaracteristica = new ArrayList<>();
    private HashMap<Integer,ArrayList<Motocicleta>> gestionMoto = new HashMap<>();
    private int ID = 0; 
    Random r = new Random();
    public Empresa(){

    }
    public Empresa(int id){
        this.ID += id;
    }
    public void setId(int id){
        this.ID += id;
    }
    public int getId(){
        return this.ID;
    }
    // creamos los metodos que gestionaran nuestros servicios 
    public ArrayList<Motocicleta> gestionarMotos(){
        System.out.println("----- Bienvenido a la gestion de motos -------");
        System.out.println("----- Acontinuacion se le solicitara una serie de datos por favor ingresarlos ------");
        System.out.println("ingrese el tipo de motor que tiene la motocicleta");
        motocicleta.setTipoMotor(validador.validadorString());
        System.out.println("ingrese la potencia maxima que tiene el motor");
        motocicleta.setPotencia(validador.validarDouble());
        System.out.println("ingrese la velocidad maxima que tiene la moto");
        motocicleta.setvelocidadMaxima(validador.validarDouble());
        System.out.println("ingrese el color que tendran la motocicleta");
        motocicleta.setColor(validador.validadorString());
        // ahora tengo que solicitar los valores que tiene la moto por defecto pero esto solo lo hago utilizando polimorfismo en este programa 
        System.out.println("----- a continuacion se le solicitara datos importantes sobre la motocicleta -----");
        System.out.println("ingrese la marca de la motocicleta");
        motocicleta.setMarca(validador.validadorString());
        System.out.println("ingrese el tipo de suspension de la moto");
        motocicleta.setSuspension(validador.validadorString());
        System.out.println("ingrese el numero de pasajeros maximo de la motocicleta");
        motocicleta.setNumeropasajero(validador.validarEntero());
        System.out.println("ingrese el tipo de motocicleta que se manejara en la empresa");
        motocicleta.settipoMotocicleta(validador.validadorString());
        System.out.println("ingrese el peso maximo que puede tener la motocicleta");
        motocicleta.setpesoMaximo(validador.validarDouble());
        // pasamos la instancia de motocicleta a el arraylist 
        pasadorCaracteristica.add(motocicleta);
        return pasadorCaracteristica;
    }
    // creamos un metodo para manejar todo nuestro hash map 
    public HashMap<Integer,ArrayList<Motocicleta>> manejarHashmap(){
        System.out.println("----- a continuacion se le solicita un id por favor ingresar un nuevo cuales quiera ------");
        setId(validador.validarEntero());
        gestionMoto.put(r.nextInt(getId() * 101), pasadorCaracteristica);
        return gestionMoto;
    }
    // creamos un metodo para visualizar los valores 
    public void visualizarHashmap(){
        for (Map.Entry<Integer, ArrayList<Motocicleta>> entrada : gestionMoto.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
