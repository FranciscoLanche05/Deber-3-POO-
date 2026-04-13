package Encapsulamiento1;

public class Estudiantes {

    private String nombre;
    private double notaFinal;

    //Constructor
    public Estudiantes(String nombre){
        this.nombre = nombre;
        this.notaFinal = 0;
    }

    //Metodo getter

    public double getNotaFinal(){return notaFinal;}

    public String getNombre(){return nombre;}

    public void setNotaFinal(double nuevaNota){
        if(nuevaNota >= 0 && notaFinal <=10){
            notaFinal = nuevaNota;
        }else{
            System.out.println("Nota no valida.");
        }
    }

    public void mostrarEstado(){
        System.out.println("------ DATOS DEL ALUMNO --=---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota actual: " + notaFinal );
        if(notaFinal>= 7){
            System.out.println("Aprobado Felicidades!!");
        } else {
            System.out.println("Reprobado");
        }
    }


}
