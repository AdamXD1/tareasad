package tareasad.EjerciciosParaEntregar.Ejercicio4;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto otroPunto) {
        int dx = this.x - otroPunto.x;
        int dy = this.y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Punto otroPunto = (Punto) obj;
        return x == otroPunto.x && y == otroPunto.y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}


