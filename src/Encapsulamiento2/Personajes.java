package Encapsulamiento2;

public class Personajes {

    private String nombre;
    private int puntosDeVida;

    public Personajes(String nombre){
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    public void recibirDanio(int danio){
        if(danio >= puntosDeVida){
            puntosDeVida = 0;
        } else if (danio > 0 && danio < puntosDeVida){
            puntosDeVida -= danio;

        }else{
            System.out.println("Sin danio alguno");
        }
    }

    public void curacion(int pocion){
        if(pocion + puntosDeVida >= 100){
            puntosDeVida = 100;
        }if(pocion + puntosDeVida < 100 && pocion + puntosDeVida > 0){
            puntosDeVida += pocion;
        }
    }
     public void mostrarInformacion(){
         System.out.println("------ INFORMACION DE PERSONAJE -----");
         System.out.println("Nombre; " + nombre);
         System.out.println("Puntos de vida: " + puntosDeVida);


     }

}
