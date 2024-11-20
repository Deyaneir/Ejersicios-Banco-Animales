package Banco;

public class CuentaBancaria {
        private double saldo;
        private String numeroCuenta;
        private String cliente;
        public CuentaBancaria(double saldo, String numeroCuenta, String cliente){
            this.saldo = saldo;
            this.numeroCuenta = numeroCuenta;
            this.cliente = cliente;
        }
        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public String getCliente() {
            return cliente;
        }


        public void mostrarInformacion() {
            System.out.println("Su numero de cuenta es: " + getNumeroCuenta());
            System.out.println("Su saldo actual es: " + getSaldo());
        }
    }

    class Cliente {
        private String nombre;
        private String identificacion;

        public Cliente(String nombre, String identificacion){
            this.nombre = nombre;
            this.identificacion = identificacion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getIdentificacion() {
            return identificacion;
        }
        public void mostrarInformacion() {
            System.out.println("Nombre del cliente: " + getNombre());
            System.out.println("Identificación: " + getIdentificacion());
        }
    }

    class CuentaCorriente extends CuentaBancaria {
        double retiro;
        public CuentaCorriente(double saldo, String numeroCuenta, String cliente) {
            super(saldo, numeroCuenta, cliente);
            this.retiro=retiro;
        }

        public double calcularMonto(double saldo) {
            double retiro = 0;
            return (saldo * 0.2) - retiro;
        }
@Override
public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Tipo de cuenta: Cuenta corriente");
    System.out.println("Su monto es: "+ calcularMonto(getSaldo()));
}


    }

    class CuentaAhorro extends CuentaBancaria {
        public CuentaAhorro(double saldo, String numeroCuenta, String cliente) {
            super(saldo, numeroCuenta, cliente);
        }
@Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Tipo de cuenta: Cuenta de ahorro");
        }

        public void retirar(double monto) {
            double saldo = getSaldo();
            if (saldo >= monto) {
                setSaldo(saldo - monto);
                System.out.println("Se retiró " + monto + ". Saldo restante: " + getSaldo());
            } else {
                System.out.println("Saldo insuficiente para el retiro.");
            }
        }
    }
