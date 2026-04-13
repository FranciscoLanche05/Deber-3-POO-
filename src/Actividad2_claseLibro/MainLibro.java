package Actividad2_claseLibro;

public class MainLibro {
    public static void main(){
        System.out.println("------ LIBRERIA DIGITAL --------");
        LIbro libro1 = new LIbro("Alicia en el pais de las maravillas","Lewis Carroll",1865);
        LIbro libro2 = new LIbro("Coraline","Neli Galman",2002);

        libro1.mostrarDatos();
        libro2.mostrarDatos();
    }
}
