package Actividad1_Consulta;

public class ConvencionEnJava {
    /*
    la convencion en java permite que la escritura del codigo tenga un orden
    y que sea legible para cualquier usuario, estos son estandares de escritura
    que funcionan de manera correcta para el tipeo de codigo.
     */

    //Tienda de celulares

    //para las constantes se usa mayusculas
    public static final double IVA = 0.15;

    // para los atributos se usa camelCase
    String nombreCelular;
    public double precioCelular;
    private int stockDisponible;


    //Para los metodos igual usamos camelCase

    public ConvencionEnJava(String nombreCelular, double precioCelular,int stockDisponible){
        this.nombreCelular = nombreCelular;
        this.precioCelular = precioCelular;
        this.stockDisponible = stockDisponible;

    }

    public double calcularPrecio(){
        double totalPrecio = precioCelular + (precioCelular * IVA);
        return totalPrecio;
    }

    //para getters y setters el estandar es:
    public void setStockDisponible(int stockDisponible){

        if (stockDisponible >= 0){
            this.stockDisponible = stockDisponible;
        }else{
            System.out.println("Valor no valido.");
        }
    }

}
