package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su numero de identificacion: ");
    String identificacion = sc.nextLine();

    int opcion = 0;
        while (opcion != 5) {
        System.out.println("\nIngrese una opcion");
        System.out.println("1) Ver informacion de saldo");
        System.out.println("2) Transferencia");
        System.out.println("3) Retiros");
        System.out.println("4) Depositos");
        System.out.println("5) Salida");
        opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            System.out.println("Ingrese una opcion");
            System.out.println("1) Cuenta Corriente");
            System.out.println("2) Cuenta de ahorros");
            int opcion2 = sc.nextInt();
            sc.nextLine();

            if (opcion2 == 1) {
                CuentaCorriente saldo1 = new CuentaCorriente(500, identificacion, nombre);
                saldo1.mostrarInformacion();
            } else if (opcion2 == 2) {
                CuentaAhorro saldo1 = new CuentaAhorro(1000, nombre, identificacion);
                saldo1.mostrarInformacion();
            }
        } else if (opcion == 2) {
            // Submenu for transferring funds
            System.out.println("Ingrese una opcion");
            System.out.println("1) Cuenta Corriente");
            System.out.println("2) Cuenta de ahorros");
            int opcion2 = sc.nextInt();
            sc.nextLine();
            if (opcion2 == 1) {
                System.out.println("Ingresar el monto a transferir: ");
                double montoTransferir = sc.nextDouble();
                sc.nextLine();
                CuentaCorriente saldo1 = new CuentaCorriente(500, identificacion, nombre);
                saldo1.setSaldo(saldo1.getSaldo() - montoTransferir);
                saldo1.mostrarInformacion();
            } else if (opcion2 == 2) {
                System.out.println("Ingresar el monto a transferir: ");
                double montoTransferir = sc.nextDouble();
                sc.nextLine();
                CuentaAhorro saldo1 = new CuentaAhorro(1000, nombre, identificacion);
                saldo1.setSaldo(saldo1.getSaldo() - montoTransferir);
                saldo1.mostrarInformacion();
            }
        } else if (opcion == 3) {
            System.out.println("Ingrese una opcion");
            System.out.println("1) Cuenta Corriente");
            System.out.println("2) Cuenta de ahorros");
            int opcion2 = sc.nextInt();
            sc.nextLine();

            if (opcion2 == 1) {
                System.out.println("Ingresar el monto a retirar: ");
                double montoRetirar = sc.nextDouble();
                sc.nextLine();
                CuentaCorriente saldo1 = new CuentaCorriente(500, identificacion, nombre);
                if (saldo1.getSaldo() >= montoRetirar) {
                    saldo1.setSaldo(saldo1.getSaldo() - montoRetirar);
                    System.out.println("Retiro exitoso");
                } else {
                    System.out.println("Saldo insuficiente para el retiro");
                }
                saldo1.mostrarInformacion();
            } else if (opcion2 == 2) {
                System.out.println("Ingresar el monto a retirar: ");
                double montoRetirar = sc.nextDouble();
                sc.nextLine();
                CuentaAhorro saldo1 = new CuentaAhorro(1000, nombre, identificacion);
                if (saldo1.getSaldo() >= montoRetirar) {
                    saldo1.setSaldo(saldo1.getSaldo() - montoRetirar);
                    System.out.println("Retiro exitoso");
                } else {
                    System.out.println("Saldo insuficiente para el retiro");
                }
                saldo1.mostrarInformacion();
            }
        } else if (opcion == 4) {
            System.out.println("Ingrese una opcion");
            System.out.println("1) Cuenta Corriente");
            System.out.println("2) Cuenta de ahorros");
            int opcion2 = sc.nextInt();
            sc.nextLine();
            if (opcion2 == 1) {
                System.out.println("Ingresar el monto a depositar: ");
                double montoDepositar = sc.nextDouble();
                sc.nextLine();
                CuentaCorriente saldo1 = new CuentaCorriente(500, identificacion, nombre);
                saldo1.setSaldo(saldo1.getSaldo() + montoDepositar);
                saldo1.mostrarInformacion();
            } else if (opcion2 == 2) {
                System.out.println("Ingresar el monto a depositar: ");
                double montoDepositar = sc.nextDouble();
                sc.nextLine();
                CuentaAhorro saldo1 = new CuentaAhorro(1000, nombre, identificacion);
                saldo1.setSaldo(saldo1.getSaldo() + montoDepositar);
                saldo1.mostrarInformacion();
            }
        } else if (opcion == 5) {
            System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
        } else {
            System.out.println("Opción no válida, por favor ingrese una opción correcta.");
        }
    }

}
}