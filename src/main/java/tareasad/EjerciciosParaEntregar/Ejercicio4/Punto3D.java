package tareasad.EjerciciosParaEntregar.Ejercicio4;

import java.util.Objects;

public class Punto3D extends Punto {
    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        if (otroPunto instanceof Punto3D) {
            Punto3D otroPunto3D = (Punto3D) otroPunto;
            int dx = getX() - otroPunto3D.getX();
            int dy = getY() - otroPunto3D.getY();
            int dz = z - otroPunto3D.getZ();
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        } else {
            return super.distancia(otroPunto);
        }
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Punto3D otroPunto3D = (Punto3D) obj;
        return z == otroPunto3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}
