package Actividad1_Consulta;

public class MainConvencion {
    public static void main(String[] args){
        //Ejemplo de uso de convencion en java para clases, metodos, variables y paquetes

        ConvencionEnJava celular1 = new ConvencionEnJava("Poco X7 pro",450.00,20);

        System.out.println("EL precio del celular es: " + celular1.calcularPrecio());
    }
}
