package Actividad2_claseLibro;

public class LIbro {
    //Atributos
    String titulo;
    String autor;
    int anioPublicacion;

    public LIbro(String titulo,String autor,int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;

    }

    public void mostrarDatos(){
        System.out.println("------ DATOS DEL LIBRO -----");
        System.out.println("----------------------------");
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor del libro; " + autor);
        System.out.println("Anio de publicacion: " + anioPublicacion);
        System.out.println("_____________________________");
    }

}
