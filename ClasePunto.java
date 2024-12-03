
/*Escribe la clase Punto (RA4) que representa un punto en el plano (con una componente x y una
componente y), con los métodos:
        • Punto(double x, double y): construye un objeto con los datos pasados como parámetros.
• void desplazaX(double dx): incrementa la componente x en la cantidad dx.
        • void desplazaY(double dy): incrementa la componente y en la cantidad dy.
        • void desplaza(double dx, double dy): desplaza ambas componentes según las cantidades
dx (en el eje x) y dy (en el eje y).
        • double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea entre el
punto invocante y el punto otro.
        • void muestra(): muestra por consola la información relativa al punto.
Crea la clase PuntoApp (RA2). Esta clase contendrá un único método main que permitirá
comprobar el funcionamiento de la clase Punto. Escribe el código que consideres necesario para
probar el buen funcionamiento de cada uno los métodos de la clase Punto.*/
class Punto {

    private double x;
    private double y;


    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void desplazaX(double dx) {
        this.x += dx;
    }


    public void desplazaY(double dy) {
        this.y += dy;
    }


    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }


    public double distanciaEuclidea(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public void muestra() {
        System.out.println("Punto (" + this.x + ", " + this.y + ")");
    }
}
