package GestionVehicularEmpresarial.Servicios;
import java.util.*;
public class Servicio {
    static Scanner s = new Scanner(System.in);
    private String tipoMotor;
    private double Potencia;
    private double velocidadMaxima;
    private String color; 

    public Servicio(){
    }

    public Servicio(String tipoMotor, double Potencia, double velocidadMaxima, String color){
        this.tipoMotor = tipoMotor;
        this.Potencia = Potencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public void setTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }

    public void setPotencia(double Potencia){
        this.Potencia = Potencia;
    }

    public void setVelocidadMaxima(double velocidadMaxima){
        while (velocidadMaxima < 0) {
            System.out.print("\nLa velocidad máxima no puede ser negativa. Por favor, ingrese una velocidad válida: ");
            velocidadMaxima = s.nextDouble();
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getTipoMotor(){
        return this.tipoMotor;
    }

    public double getPotencia(){
        return this.Potencia;
    }

    public double getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public String getColor(){
        return this.color;
    }

    public void MostrarInformacion(){
        System.out.printf("\nTipo de motor: %s\nPotencia del vehículo: %.2f HP\nVelocidad máxima: %.2f km/h\nColor del vehículo: %s\n", this.tipoMotor, this.Potencia, this.velocidadMaxima, this.color);
    }

    public void arrancar(){
        System.out.println("El vehículo está arrancando...");
    }

    public void detener(){
        System.out.println("El vehículo se está deteniendo...");
        System.out.println("El vehículo se ha detenido completamente.");
    }
}
