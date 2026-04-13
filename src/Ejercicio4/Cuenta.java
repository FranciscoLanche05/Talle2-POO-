package Ejercicio4;

public class Cuenta {

    private double saldo;

    public Cuenta(){
        this.saldo= 450.50;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void mostrar(){
        System.out.println("Saldo:"+saldo);
    }

}
