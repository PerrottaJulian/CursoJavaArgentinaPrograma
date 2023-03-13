import java.util.ArrayList;
import java.util.Scanner;

/*Implemente usted mismo el ejemplo visto en clase de “carrito de compras”: una clase
Producto (que pueda tener hasta 3 items), otra Item Carrito, otra Carrito y otra
Descuento, con 2 subclases.
 */
public class Main {
    public static void main(String[] args) {

        Carrito miCarrito = new Carrito();

        Producto leche = new Producto(
                "leche Serenisima",
                50);
        Producto yogur = new Producto(
                "yogur Sancor",
                25);
        Producto galletitas = new Producto(
                "galletitas Surtidos",
                30.5);
        Producto fernet = new Producto(
                "fernet Branca",
                1500);
        Producto huevo = new Producto(
                "huevos La Hueveria",
                100);

        AgregarAlCarrito(miCarrito, leche);
        AgregarAlCarrito(miCarrito, yogur);
        AgregarAlCarrito(miCarrito, galletitas);
        AgregarAlCarrito(miCarrito, huevo);
        AgregarAlCarrito(miCarrito, fernet);

        System.out.println("Precio a pagar por el carrito: $" + miCarrito.PrecioTotal());

    }
    public static void AgregarAlCarrito(Carrito carrito, Producto producto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea llevar " + producto.Nombre() + "? (responder si/no)");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("si")){
            System.out.println("Cantidad?: ");
            int cantidad = scanner.nextInt();
            for (int i=0; i<cantidad; i++){
                carrito.productos.add(producto);}
        }
    }

}