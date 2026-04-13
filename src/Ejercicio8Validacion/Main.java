package Ejercicio8Validacion;

public class Main {
    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta(500);
        int retiro = 800;

        System.out.println("SE realizo un retiro de 800 dolares");
        cuenta1.setSaldo(retiro);
        System.out.println("Saldo: "+ cuenta1.getSaldo());
    }
}
