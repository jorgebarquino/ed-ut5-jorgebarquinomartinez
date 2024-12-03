
class PuntoApp {
    public static void main(String[] args) {

        Punto punto1 = new Punto(3.0, 4.0);
        Punto punto2 = new Punto(0.0, 0.0);


        punto1.desplazaX(2.0);

        punto2.desplazaY(5.0);

        punto1.desplaza(1.0, 1.0);

        punto1.muestra();
        punto2.muestra();


        double distancia = punto1.distanciaEuclidea(punto2);
        System.out.println("Distancia euclídea entre punto1 y punto2: " + distancia);
    }
}
