class CuentaCorrienteApp {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Javier lopez");
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Marta Saez");

        cuenta1.ingresarDinero(500.0);
        cuenta2.ingresarDinero(300.0);

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();

        if (cuenta1.sacarDinero(200.0)) {
            System.out.println("Extracción exitosa de la cuenta de Javier lopez.");
        } else {
            System.out.println("Extracción fallida de la cuenta de Javier lopez .");
        }

        if (cuenta2.sacarDinero(400.0)) {
            System.out.println("Extracción exitosa de la cuenta de Marta Saez.");
        } else {
            System.out.println("Extracción fallida de la cuenta de Marta Saez.");
        }

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}
