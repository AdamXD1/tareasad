package tareasad.EjerciciosParaEntregar.Ejercicio3;

import java.util.Date;

public class Vehiculo {
        private String matricula;
        private Date fechaInicio;
        private Date fechaFin;
    
        public Vehiculo(String matricula, Date fechaInicio, Date fechaFin) {
            this.matricula = matricula;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
        }
    
        public String getMatricula() {
            return matricula;
        }
    
        public Date getFechaInicio() {
            return fechaInicio;
        }
    
        public Date getFechaFin() {
            return fechaFin;
        }
    
        public void setFechaFin(Date fechaFin) {
            this.fechaFin = fechaFin;
        }
    
        @Override
        public String toString() {
            return "Vehículo [Matrícula: " + matricula + ", Fecha inicio: " + fechaInicio + ", Fecha fin: " + fechaFin + "]";
        }
    }
