import java.util.Scanner;
/*Crea la clase CuentaCorriente (RA4), que almacena los datos: DNI y nombre del titular, así como
el saldo. Todos estos atributos serán privados.
Las operaciones típicas con una cuenta corriente son:
        • Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0. Esta
operación se realizará mediante un constructor parametrizado que recibirá 2 parámetros.
• Ingresar dinero: el método recibirá como parámetro la cantidad de dinero a ingresar.
• Sacar dinero: el método recibirá como parámetro la cantidad de dinero a sacar.
        Asimismo, el método devolverá mediante un booleano si ha sido posible llevar a cabo o
no la operación. No se podrá realizar la operación si no hay saldo suficiente en la cuenta
corriente.
• Mostrar información: muestra la información disponible de la cuenta corriente (nombre
                                                                                         del titular, DNI y saldo).
Todos los métodos anteriormente enunciados serán públicos.
Crea la clase CuentaCorrienteApp (RA2). Esta clase contendrá un único método main que
permitirá comprobar el funcionamiento de la clase CuentaCorriente.
        • Se crearán 2 objetos de tipo CuentaCorriente con nombres y del titular distintos.
        • Realiza un ingreso de cantidades distintas en cada cuenta.
• Posteriormente muestra la información de cada una de ellas.
• Por último, intenta extraer dinero de cada una de las cuentas. Una de estas extracciones
será exitosa y la otra no (porque no había suficiente saldo). Muestra un mensaje de éxito
o de fracaso correspondiente a cada extracción.*/

public class CuentaCorriente {

    private String dni;
    private String nombre;
    private double saldo;


    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0.0;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del titular: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo);
    }
}



