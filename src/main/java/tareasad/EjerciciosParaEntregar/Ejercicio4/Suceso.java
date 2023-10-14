package tareasad.EjerciciosParaEntregar.Ejercicio4;

import java.util.Objects;

public class Suceso {
    private int tiempo;
    private String descripcion;

    public Suceso(int x, int y, int z, int tiempo, String descripcion) {
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getDescripcion() {
        return descripcion;
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
        Suceso otroSuceso = (Suceso) obj;
        return tiempo == otroSuceso.tiempo && Objects.equals(descripcion, otroSuceso.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tiempo, descripcion);
    }
}
