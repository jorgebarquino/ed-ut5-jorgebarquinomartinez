package practica5;

public class ClasePunto {
    private int x;
    private int y;

    public void Punto() {
        this.x = (int) (Math.random() * 11);
        this.y = (int) (Math.random() * 11);
    }

    public void muestra() {
        System.out.println("Punto: (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
