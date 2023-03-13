public class Producto {
    public Producto (String nombre_marca, double precio_u){
        this.nombre_marca = nombre_marca;
        this.precio_u = precio_u;
    }
    private String nombre_marca;
    private double precio_u;
    public String Nombre(){
        return nombre_marca;
    }
    public double Precio(){return precio_u;}
}
