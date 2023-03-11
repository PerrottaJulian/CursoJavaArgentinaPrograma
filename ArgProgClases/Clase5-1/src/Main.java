/*Implemente usted mismo el ejemplo visto en clase de “carrito de compras”: una clase
Producto (que pueda tener hasta 3 items), otra Item Carrito, otra Carrito y otra
Descuento, con 2 subclases.
 */
public class Main {
    public static void main(String[] args)
    {
        Carrito miCarrito = new Carrito();

        Producto leche = new Producto(
                "Serenisima",
                50.30,
                3.5);
        Producto yogur = new Producto(
                "Sancor",
                25,
                1.2);


        miCarrito.productos.add(leche);
        miCarrito.productos.add(yogur);

        System.out.println(miCarrito.PrecioTotal());

    }
}