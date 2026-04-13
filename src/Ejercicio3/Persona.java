package Ejercicio3;

public class Persona {
    /*

    Con los atributos en publico no hay encapsulamiento

    public class Persona {
        public String nombre;
    }
     */

    //Atributos con private para encapsulamiento

    private String nombre;

    public Persona() {
        this.nombre = "Angui";

    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void mostrar(){
        System.out.println("Nombre:"+ nombre);
    }
}
