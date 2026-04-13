package Actividad4_cuentaBancaria;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();


        System.out.println("----- CUENTA CREADA -------");
        CuentaBancaria usuario1 = new CuentaBancaria(nombre);

        System.out.println("----- Informacion de usuario ----- ");

        usuario1.mostrarInformacion();
         int op = 0;

        do{
            System.out.println("Depositar: 1");
            System.out.println("Retirar: 2");
            System.out.println("Informacion: 3");
            System.out.println("Salir: 0");
            System.out.println("Seleccione una opcion: ");
            op = sc.nextInt();

            switch (op){
                case 1:

                    System.out.println("Ingrese el monto que desea depositar: ");
                    double deposito = sc.nextDouble();
                    if(deposito >= 0){
                        usuario1.depositar(deposito);
                    }else{
                        System.out.println("Ingrese un valor valido.");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el monto que desea retirar: ");
                    double retiro = sc.nextDouble();
                    if(retiro > 0 ){
                        if(retiro <= usuario1.getSaldoCuenta()) {
                            usuario1.retirar(retiro);
                        }else{
                            System.out.println("Fondos insuficientes");
                        }
                    }else{
                        System.out.println("Ingrese un valor valido.");
                    }
                    break;

                case 3:
                    usuario1.mostrarInformacion();
                    break;

                case 0:
                    break;
            }
        }while(op !=0);
            System.out.println("Saliendo de la cuenta.");





    }
}
