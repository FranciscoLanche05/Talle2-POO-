package Ejercicio7SET;



public class Main {
    public static void main(String[] args){
        String nuevoNombre = "Angui";

        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1.getNombre());

        System.out.println("cambio de nombre ");
        estudiante1.setNombre(nuevoNombre);
        System.out.println(estudiante1.getNombre());

    }
}
