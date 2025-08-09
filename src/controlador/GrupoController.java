package controlador;

import modelo.Alumno;

public class GrupoController {

    public double calcularPromedioFila(Alumno[] fila) {
        double suma = 0;
        for (Alumno a : fila) {
            suma += a.getPromedio();
        }
        return suma / fila.length;
    }

    public double calcularPromedioGrupal(Alumno[][] grupo) {
        double suma = 0;
        int total = 0;

        for (Alumno[] fila : grupo) {
            for (Alumno a : fila) {
                suma += a.getEdad();
                total++;
            }
        }

        return suma / total;
    }

    public int filaMasDestacada(Alumno[][] grupo) {
        double maxProm = 0;
        int filaDestacada = -1;

        for (int i = 0; i < grupo.length; i++) {
            double promFila = calcularPromedioFila(grupo[i]);

            if (promFila > maxProm) {
                maxProm = promFila;
                filaDestacada = i;
            }
        }

        return filaDestacada;
    }

    public Alumno alumnoMasDestacado(Alumno[][] grupo) {
        Alumno mejor = null;
        double maxProm = 0;

        for (Alumno[] fila : grupo) {
            for (Alumno a : fila) {
                if (a.getPromedio() > maxProm) {
                    maxProm = a.getPromedio();
                    mejor = a;
                }
            }
        }

        return mejor;
    }
}

    

