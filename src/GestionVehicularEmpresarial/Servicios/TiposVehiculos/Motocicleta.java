package GestionVehicularEmpresarial.Servicios.TiposVehiculos;


import GestionVehicularEmpresarial.Servicios.Servicio;
import java.util.*;
public class Motocicleta extends Servicio{
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
     private String marca; 
     private String suspension; 
     private int numeroPasajeros;
     private String tipoMotocicleta;
     private double pesoMaximo;
     // creamos los dos constructores 
     public Motocicleta(){} // constructor vacio 
     public Motocicleta(double pesoMaximo,String marca,String suspension,int numeroPasajeros,String tipoMotor,double Potencia,double velocidadMaxima,String color){
            super(tipoMotor, Potencia, velocidadMaxima, color);
            this.marca = marca;
            this.suspension = suspension;
            this.numeroPasajeros = numeroPasajeros;
            this.pesoMaximo = pesoMaximo;
     }
     // creamos los getters y setters
     public void setMarca(String marca){
        this.marca = marca;
     }
     public String getMarca(){
        return this.marca;
     }
     public void setSuspension(String suspension){
        this.suspension = suspension;
     }
     public String getSuspension(){
        return this.suspension;
     }
     public void setNumeropasajero(int numeroPasajeros){
        this.numeroPasajeros = numeroPasajeros;
     }
     public int getNumeropasajero(){
        return this.numeroPasajeros;
     }
     public void settipoMotocicleta(String tipoMotocicleta){
        this.tipoMotocicleta = tipoMotocicleta;
     }
     public String gettipoMotocicleta(){
        return this.tipoMotocicleta;
     }
     public void setpesoMaximo(double pesoMaximo){
        while (pesoMaximo > 120){
            System.out.print("la cantidad de peso sobre la motocicleta supera lo que puede cargar\nPor favor baje peso de la motocicleta o esto podra causar un accidente: ");
            pesoMaximo = s.nextDouble();
        } 
        this.pesoMaximo = pesoMaximo;
     }
     public double getpesoMaximo(){
        return this.pesoMaximo;
     }
     // creamos los metodos de la motodocileta 
     @Override
     public void arrancar(){
        double velocidadInicialRamdon = r.nextInt(numeroPasajeros);
        double velocidadArranque = (getVelocidadMaxima() - velocidadInicialRamdon)/2;
        System.out.println("la velocidad con la que arranca la motocicleta es: " + Math.round(velocidadArranque));
     }
     public void detener(){
        double velocidadInicialRamdon = r.nextInt(numeroPasajeros);
        double velocidadArranque = (getVelocidadMaxima() - velocidadInicialRamdon)/2;
        double velocidadReducidad = getVelocidadMaxima() - velocidadArranque;
        System.out.println("la velocidad con la que la motocicleta se detiene es: " + Math.round(velocidadReducidad));
     }
}


