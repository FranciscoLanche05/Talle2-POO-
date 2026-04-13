package EjercicioAvanzado;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio,int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = cantidad;
    }


    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    //SETTERS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precioFinal) {
        if(precioFinal <= 0){
            System.out.println("Error valor invalido");

        }else{
            this.precio = precioFinal;
        }
    }

    public void setStock(int stock) {
        if(stock < 0 ){
            System.out.println("Error valor invalido");
        }else{
            this.stock = stock;
        }
    }

    //METODOS NORMALES
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    public void calcularPrecioTotal(){
        double precioTotal = precio * stock;
        System.out.println("Valor total de: " + precioTotal);
    }


}
