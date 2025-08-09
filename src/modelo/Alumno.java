package modelo; 

// Clase que representa el modelo de un alumno
public class Alumno {

    // Atributos privados
    private String nombre;
    private int edad;
    private String carrera;
    private int cuatrimestre;
    private double promedio;

    // Métodos getter para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public double getPromedio() {
        return promedio;
    }

    // Constructor que inicializa los atributos del alumno
    public Alumno(String nombre, int edad, String carrera, int cuatrimestre, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.promedio = promedio;
    }
}
