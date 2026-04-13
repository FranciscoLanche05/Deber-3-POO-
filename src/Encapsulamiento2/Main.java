package Encapsulamiento2;

public class Main {
    public static void main(String[] args){

        Personajes personaje1 = new Personajes("Kratos");

        System.out.println("Kratos Recibio un ataque de zeus -78 pv");
        int ataque = 78;
        personaje1.recibirDanio(ataque);
        personaje1.mostrarInformacion();


        System.out.println("Kratos encontro un cofre con puntos de vida +120 PV");
        int cofreVida = 120;
        personaje1.curacion(cofreVida);
        personaje1.mostrarInformacion();


        personaje1.mostrarInformacion();

    }
}
