package SistemaTransporteProblemas.sistemaTranspoertePublico.utilidad;

public class  Vehiculo {
   private String marca; 
   private String modelo; 
   private int capacidad; 
   private String placa;
   // creamos 2 constructores 
   public Vehiculo(){
    // el primer constructo es vacio 
   }
   public Vehiculo(String marca, String modelo,int capacidad,String placa){
    this.marca = marca;
    this.modelo = modelo;
    this.capacidad = capacidad;
    this.placa = placa;
   }
   // creamos los setters 
   public void setMarca(String marca){
     this.marca = marca;
   }
   public void setModelo(String modelo){
    this.modelo = modelo;
   }
   public void setCapacidad(int capacidad){
    this.capacidad = capacidad;
   }
   public void setPlaca(String placa){
    this.placa = placa;
   }
   // creamos los getters 
   public String getMarca(){
    return this.marca;
   }
   public String getModelo(){
    return this.modelo;
   }
   public int getCapacidad(){
    return this.capacidad;
   }
   public String getPlaca(){
    return this.placa;
   }
   // creamos las acciones que tendra nuetra clase que son las siguientes 
   public void detener(double velocidad){
      if (velocidad <= 0){
        System.out.println("el vehiculo se detuvo");
      }else{
        System.out.println("el vehiculo se esta deteniendo");
      }
   }
   public void arrancar(String arranca){
    if (arranca.equalsIgnoreCase("arrancar")){
        System.out.println("el vehiculo esta arrancando");
    }else{
        System.out.println("el vehiculo no esta arrancando");
    }
   }
   // implementamos un metodo para mostrar la informacion 
   public void wathInfo(){
    System.out.println("la marca del vehiculo es: " + this.marca);
    System.out.println("el modelo de vehiculo es: " + this.modelo);
    System.out.println("la capacidad del vehiculo es: " + this.capacidad);
    System.out.println("la placa del vehiculo es: " + this.placa);
   }
}