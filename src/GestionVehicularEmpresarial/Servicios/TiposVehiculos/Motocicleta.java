package GestionVehicularEmpresarial.Servicios.TiposVehiculos;

import GestionVehicularEmpresarial.Servicios.Servicio;
import java.util.*;

public class Motocicleta extends Servicio {
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    private String marca;
    private String suspension;
    private int numeroPasajeros;
    private String tipoMotocicleta;
    private double pesoMaximo;

    // creamos los dos constructores
    public Motocicleta() {} // constructor vacio

    public Motocicleta(double pesoMaximo, String marca, String suspension, int numeroPasajeros, String tipoMotor, double Potencia, double velocidadMaxima, String color) {
        super(tipoMotor, Potencia, velocidadMaxima, color);
        this.marca = marca;
        this.suspension = suspension;
        this.numeroPasajeros = numeroPasajeros;
        this.pesoMaximo = pesoMaximo;
    }

    // creamos los getters y setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setNumeropasajero(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeropasajero() {
        return this.numeroPasajeros;
    }

    public void settipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String gettipoMotocicleta() {
        return this.tipoMotocicleta;
    }

    public void setpesoMaximo(double pesoMaximo) {
        while (pesoMaximo > 210) {
            System.out.println("El peso ingresado excede el límite máximo de carga permitido (120 kg).");
            System.out.print("Por favor, reduzca el peso de la motocicleta para evitar accidentes: ");
            pesoMaximo = s.nextDouble();
        }
        this.pesoMaximo = pesoMaximo;
    }

    public double getpesoMaximo() {
        return this.pesoMaximo;
    }

    // creamos los metodos de la motocicleta
    @Override
    public void arrancar() {
        double velocidadInicialRamdon = r.nextInt(numeroPasajeros);
        double velocidadArranque = (getVelocidadMaxima() - velocidadInicialRamdon) / 2;
        System.out.println("La motocicleta ha arrancado. Velocidad inicial: " + Math.round(velocidadArranque) + " km/h.");
    }

    public void detener() {
        double velocidadInicialRamdon = r.nextInt(numeroPasajeros);
        double velocidadArranque = (getVelocidadMaxima() - velocidadInicialRamdon) / 2;
        double velocidadReducida = getVelocidadMaxima() - velocidadArranque;
        System.out.println("La motocicleta se ha detenido. Velocidad final de frenado: " + Math.round(velocidadReducida) + " km/h.");
    }
    // metodo tostring sobre escrito
    @Override
    public String toString() {
        return "Motocicleta [Marca=" + marca + ", Suspensión=" + suspension + ", Número de Pasajeros=" + numeroPasajeros +
               ", Tipo de Motocicleta=" + tipoMotocicleta + ", Peso Máximo=" + pesoMaximo + " kg, " +
               "Motor=" + getTipoMotor() + ", Potencia=" + getPotencia() + " HP, Velocidad Máxima=" + getVelocidadMaxima() + " km/h, Color=" + getColor() + "]";
    }
}
