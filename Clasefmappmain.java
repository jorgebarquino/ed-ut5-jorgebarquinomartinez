public class Clasefmappmain {
    public static void main(String[] args) {
        SintonizadorFM sintonizador1 = new SintonizadorFM();
        SintonizadorFM sintonizador2 = new SintonizadorFM(107.0);
        SintonizadorFM sintonizador3 = new SintonizadorFM(200.0);

        sintonizador1.down();
        sintonizador2.down();

        sintonizador2.up();
        sintonizador2.up();

        sintonizador1.display();
        sintonizador2.display();
        sintonizador3.display();
        }
    }

