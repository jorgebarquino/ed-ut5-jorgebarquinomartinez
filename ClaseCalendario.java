


public class ClaseCalendario {

    private int anyo;
    private int mes;
    private int dia;


    public ClaseCalendario(int anyo, int mes, int dia) {
        if (esFechaCorrecta(anyo, mes, dia)) {
            this.anyo = anyo;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

    public void incrementarDia() {
        dia++;
        if (dia > diasEnMes(anyo, mes)) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            anyo++;
        }
    }

    public void incrementarAnyo(int cantidad) {
        anyo += cantidad;
    }

    public void mostrar() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anyo);
    }

    public boolean iguales(ClaseCalendario otraFecha) {
        return this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    private boolean esFechaCorrecta(int anyo, int mes, int dia) {
        return mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnMes(anyo, mes);
    }

    private int diasEnMes(int anyo, int mes) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dias[mes - 1];
    }
}
