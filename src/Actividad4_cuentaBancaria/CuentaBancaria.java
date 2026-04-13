package Actividad4_cuentaBancaria;

public class CuentaBancaria {

    //Atributos
    private String nombreTitular;
    private double saldoCuenta;

    public CuentaBancaria(String nombreTitular){
        this.nombreTitular = nombreTitular;
        this.saldoCuenta = 0;
    }

    public double getSaldoCuenta(){
        return saldoCuenta;
    }

    public void depositar(double monto){
        saldoCuenta += monto;

    }

    public void retirar(double retiro ){
        if(saldoCuenta >= retiro){
            saldoCuenta -= retiro;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }



    public void mostrarInformacion(){
        System.out.println("-------- CUENTA ---------");
        System.out.println("Nombre: " + nombreTitular);
        System.out.println("Saldo Actual; " + saldoCuenta);
        System.out.println("-----------------------------");
    }

}
