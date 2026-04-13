package Actividad3_claseProducto;

public class Producto {

    String nombreProducto;
    double precio;
    int cantidadProducto;

    //Existen tre tipos de constructores

    //Constructor vacio
    public Producto(){}

    //constructor con parametros
    public Producto(String nombreProducto,double precio,int cantidadProducto){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }


    /*Constructor sin parametros con valores directos
    public Producto(){
        this.nombreProducto = "Gorra amarilla";
        this.precio = 20.50;
        this.cantidadProducto = 10;
    }
    */

    /*
    En este caso al momento de usar los dos constructores vacios hay que elegir uno ya que java no puede reconocer
    ambos a las ves y va a ocasionar conflictos al momento de compilar
     */

    public void mostrarDatos(){
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidadProducto);
    }
}
