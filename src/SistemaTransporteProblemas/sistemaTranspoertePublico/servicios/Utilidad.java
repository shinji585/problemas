package SistemaTransporteProblemas.sistemaTranspoertePublico.servicios;

import SistemaTransporteProblemas.sistemaTranspoertePublico.utilidad.Vehiculo;
import java.util.*;
public class Utilidad extends Vehiculo{
    static Scanner s = new Scanner(System.in);
    private double pasaje = 0;
    private String conductorName;
    // ahora implementamos la herencia con la clase super 
    public Utilidad(String marca,String modelo,int capacidad,String conductorName,String placa){
        super(marca, modelo, capacidad,placa);
        this.conductorName = conductorName;
    }
    public Utilidad(){
        // constructor vacio
    }
    // creamos los setter y getter para pasaje 
    public double getPasaje(){
        return this.pasaje;
    }
    public void setPasaje(double pasaje){
        this.pasaje = pasaje;
    }
    public void setconductorName(String conductorName){
       this.conductorName = conductorName;
    }
    public String getconductorName(){
        return this.conductorName;
    }
    // implementamos los metodos 
    public void cobrarPasaje(double dinero){
        while (dinero <= this.pasaje) {
            System.out.println("-----mi hermano por ese precio no lo puedo llevar-----");
            System.out.print("tire algo hay mas grande: ");
            dinero = s.nextDouble();
        }
        if (dinero > this.pasaje){
            System.out.println("----- cual lugar le gustaria ir -------\n");
        }
    
    }
    @Override
    public void wathInfo(){
    System.out.println("la marca del vehiculo es: " + getMarca());
    System.out.println("el modelo de vehiculo es: " + getModelo());
    System.out.println("la capacidad del vehiculo es: " + getCapacidad());
    System.out.println("la placa del vehiculo es: " + getPlaca());
    System.out.println("el nombre del conductor es: " + this.conductorName);
    System.out.println("\n");
    }
}
