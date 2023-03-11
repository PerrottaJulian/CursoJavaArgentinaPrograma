import java.util.ArrayList;

public class Carrito {

    public ArrayList<Producto> productos = new ArrayList<Producto>();

    public double PrecioTotal() {
        double precio_total = 0.0;
        for (int i = 0; i < productos.size(); i++){
            precio_total += productos.get(i).Precio();
        }
        return precio_total;
    }



}
