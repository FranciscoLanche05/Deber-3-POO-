package Actividad3_claseProducto;

public class MainProducto {
    public static void main(String[] args){
        //Objeto 1:
        Producto producto1 = new Producto();
        producto1.nombreProducto = "Pantalon verde";
        producto1.precio = 30.99;
        producto1.cantidadProducto = 2;

        Producto producto2 = new Producto("Camisa a cuadros",25.50,4);

        producto1.mostrarDatos();
        producto2.mostrarDatos();

        /*
        Para el tercer objeto debido a que no se puede dos metodos constructores con parametros
        vacios no se puede craear con ese constructor

        Producto producto3 = new Producto();
         */
    }
}
