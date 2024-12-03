
/*Crea la clase SintonizadorFM (RA4) que contiene un único atributo privado que almacene la
frecuencia (en MHz).
        • Cuando se cree un nuevo objeto de tipo SintonizadorFM la frecuencia tendrá por defecto
el valor de 80 MHz.
• También se pueden crear objetos de tipo SintonizadorFM indicando la frecuencia inicial
del mismo. En este caso sólo podrá asignarse una frecuencia dentro del rango 80-
        108MHz. Si el valor pasado como parámetro es inferior a 80MHz el objeto tendrá una
frecuencia de 80MHz. Si es superior a 108MHz se le asignará 108MHz.
• Contendrá un método público llamado display que no recibirá ningún parámetro y
mostrará por pantalla la frecuencia sintonizada del objeto.
        • Contendrá un método público llamado down que no recibirá ningún parámetro y bajará la
frecuencia en 0.5 MHz. Posteriormente comprobará el rango de la frecuencia llamando al
método comprobarRango.
        • Contendrá un método público llamado up que no recibirá ningún parámetro y subirá la
frecuencia en 0.5 MHz. Posteriormente comprobará el rango de la frecuencia llamando al
método comprobarRango.
        • El método privado comprobarRango no recibe ningún parámetro y comprueba si la
frecuencia ha sobrepasado el intervalo válido (80-108MHz). Si la frecuencia es inferior a
80 MHz la ajusta al valor máximo (108MHz). En cambio, si la frecuencia es superior a
108MHz la ajusta al valor mínimo (80MHz).
Crea la clase SintonizadorFMApp (RA2). Esta clase contendrá un único método main que
permitirá comprobar el funcionamiento de la clase SintonizadorFM.
        • Se crearán 3 objetos de tipo SintonizadorFM, el primero con sus valores por defecto, el
segundo con 107MHz y el último con 200MHz.
• Baja 1MHz el primer sintonizador. Sube 2 MHz el segundo sintonizador.
        • Muestra por pantalla a qué frecuencia se encuentra cada uno de los sintonizadores. Si el
código es correcto las frecuencias de cada sintonizador han de ser:
o 1r sintonizador: 107.5 MHz
o 2º sintonizador: 80.5 MHz
o 3r sintonizador: 108.0 MHz
*/

public class SintonizadorFM {

    private double frecuencia;


    public SintonizadorFM() {
        this.frecuencia = 80.0;
    }


    public SintonizadorFM(double frecuenciaInicial) {
        if (frecuenciaInicial < 80.0) {
            this.frecuencia = 80.0;
        } else if (frecuenciaInicial > 108.0) {
            this.frecuencia = 108.0;
        } else {
            this.frecuencia = frecuenciaInicial;
        }
    }


    public void display() {
        System.out.println("Frecuencia sintonizada: " + this.frecuencia + " MHz");
    }


    public void down() {
        this.frecuencia -= 0.5;
        comprobarRango();
    }

    public void up() {
        this.frecuencia += 0.5;
        comprobarRango();
    }


    private void comprobarRango() {
        if (this.frecuencia < 80.0) {
            this.frecuencia = 108.0;
        } else if (this.frecuencia > 108.0) {
            this.frecuencia = 80.0;
        }
    }
}

