package tareasad.EjerciciosClase.Persona2;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public static final char SEXO_HOMBRE = 'H';
    public static final char SEXO_MUJER = 'M';

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SEXO_HOMBRE;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = validarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = validarDNI(DNI);
        this.sexo = validarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            return -1; 
        } else if (imc >= 18.5 && imc < 25) {
            return 0; 
        } else {
            return 1;
        }
    }

    private String validarDNI(String dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numeroDNI = dni.substring(0, dni.length() - 1);
        int resto = Integer.parseInt(numeroDNI) % 23;
        char letraCalculada = letras.charAt(resto);
        char letraDNI = dni.charAt(dni.length() - 1);
        
        if (letraCalculada == letraDNI) {
            return dni;
        } else {
             return ""; 
        }
        }

    private char validarSexo(char sexo) {
        if (sexo == SEXO_HOMBRE || sexo == SEXO_MUJER) {
            return sexo;
        } else {
            return SEXO_HOMBRE; // Valor por defecto si el sexo no es válido
        }
    }

    private String generarDNI() {
        Random aleatorio = new Random();
        int numeroDNI = aleatorio.nextInt(99999999); 
        int resto = numeroDNI % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraDNI = letras.charAt(resto);
    
    return String.format("%08d", numeroDNI) + letraDNI;
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = validarDNI(DNI);
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = validarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }

}
