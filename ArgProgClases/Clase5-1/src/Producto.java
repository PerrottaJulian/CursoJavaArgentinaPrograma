public class Producto {
    public Producto (String marca, double precio, double pesokg){
        this.marca = marca;
        this.precio = precio;
        this.pesokg = pesokg;
    }

    private String marca;
    private double precio;
    private double pesokg;

    public String Marca(){
        return marca;
    }
    public double Precio(){
        return precio;
    }
    public double Peso(){
        return pesokg;
    }
}
