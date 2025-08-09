
package vista;

import controlador.GrupoController;
import java.util.Scanner;
import modelo.Alumno;


public class PrincipalVistaAlumno {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        GrupoController con = new GrupoController();
 
        System.out.print("Ingrese número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese número de alumnos por fila: ");
        int columnas = sc.nextInt();
        sc.nextLine(); // limpiar buffer
 
        Alumno[][] grupo = new Alumno[filas][columnas];
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("\nAlumno en fila " + (i + 1) + ", posición " + (j + 1));
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.print("Carrera: ");
                String carrera = sc.nextLine();
                System.out.print("Cuatrimestre: ");
                int cuatri = sc.nextInt();
                System.out.print("Promedio: ");
                double prom = sc.nextDouble();
                sc.nextLine();
 
                grupo[i][j] = new Alumno(nombre, edad, carrera, cuatri, prom);
            }
        }
 
        // Resultados
        for (int i = 0; i < filas; i++) {
            double promFila = con.calcularPromedioFila(grupo[i]);
            System.out.println("La fila " + (i + 1) + " tiene un promedio de: " + promFila);
        }
 
        double promGrupal = con.calcularPromedioGrupal(grupo);
        System.out.println("\nEl promedio de edad grupal es de: " + promGrupal);
 
        int filaDest = con.filaMasDestacada(grupo);
        System.out.println("La fila más destacada es la fila: " + (filaDest + 1) +
                " con un promedio de: " + con.calcularPromedioFila(grupo[filaDest]));
 
        Alumno mejorAlumno = con.alumnoMasDestacado(grupo);
        System.out.println("El alumno más destacado es: " + mejorAlumno.getNombre() +
                " con un promedio de: " + mejorAlumno.getPromedio());
 
        sc.close();
    }
    
}
