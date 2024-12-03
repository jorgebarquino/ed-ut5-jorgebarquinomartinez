
public class ClaseCalendarioApp {
    public static void main(String[] args) {

        ClaseCalendario fecha1 = new ClaseCalendario(2023, 12, 31);
        ClaseCalendario fecha2 = new ClaseCalendario(2024, 2, 28);
        ClaseCalendario fecha3 = new ClaseCalendario(2000, 1, 1);

        fecha1.mostrar();
        fecha1.mostrar();

        fecha2.incrementarMes();
        fecha2.mostrar();

        fecha3.incrementarAnyo(2);
        fecha3.mostrar();

        boolean sonIguales = fecha1.iguales(fecha2);
        System.out.println("Las fechas son iguales: " + sonIguales);
    }
}

