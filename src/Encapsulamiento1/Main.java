package Encapsulamiento1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Estudiantes estudiante1 = new Estudiantes("Julian Ramirez");

        System.out.println("Ingrese la nota final del estudiante " + estudiante1.getNombre());
        double nota = sc.nextDouble();
        estudiante1.setNotaFinal(nota);
        estudiante1.mostrarEstado();
    }
}
