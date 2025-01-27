package GestionVehicularEmpresarial.Servicios;
import java.util.*;
public class Servicio {
    static Scanner s = new Scanner(System.in);
    private String tipoMotor;
    private double Potencia;
    private double velocidadMaxima;
    private String color; 
    // creamos dos construcotes uno vacion y uno no 
    public Servicio(){
        // constructor vacio 
    }
    public Servicio(String tipoMotor,double Potencia,double velocidadMaxima,String color){
        this.tipoMotor = tipoMotor;
        this.Potencia = Potencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }
    // setters 
    public void setTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }
    public void  setPotencia(double Potencia){
        this.Potencia = Potencia;
    }
    public void setvelocidadMaxima(double velocidadMaxima){
        while (velocidadMaxima < 0) {
            System.out.print("\nla velocidad maxima no tiene que ser negativa\nIngrese la velocidad maxima: ");
            velocidadMaxima = s.nextDouble();
        }
          this.velocidadMaxima = velocidadMaxima;
    }
    public void setColor(String color){
      this.color = color;
    }
    // creamos los getters 
    public String getTipoMotor(){
         return this.tipoMotor;
    }
    public double  getPotencia(){
         return this.Potencia;
    }
    public double getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public String getColor(){
        return this.color;
    }
    // creamos los metodos de nuestra clase 
    public void Mostrarinformacion(){
        System.out.printf("\nel tipo de vehiculo es %s\n la potencia de sus vehiculos es %.2f\n la velocidad maxima de los vehiculos es %.2f\n el color de sus vehiculos es %s ",this.tipoMotor,this.Potencia,this.velocidadMaxima,this.color);
    }
    public void arrancar(){
        System.out.println("el vehiculo esta arrancando");
    }
    public void detener(){
        System.out.println("el vehiculo se esta deteniendo");
        System.out.println("el vehiculo se detuvo");
    }
}
