import java.util.ArrayList;

public class Carrito {

    public ArrayList<Producto> carrito = new ArrayList<Producto>();


    public double PrecioTotal() {
        double precio_total = 0.0;
        for (int i = 0; i < carrito.size(); i++){
            precio_total += carrito.get(i).Precio();
        }
        return precio_total;
    }



}
