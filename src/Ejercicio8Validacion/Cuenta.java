package Ejercicio8Validacion;

public class Cuenta {

    private double saldo;


    public Cuenta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldoRetiro){
        if(saldoRetiro > saldo){
            System.out.println("ERROR EN LA TRANSACCION");
        }else{
            this.saldo = saldo;
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
