package org.example.problema2;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;


public class Excursion {

    private String nombre_actividad;
    private String localidad;
    private double precio;
    private Collection<String> profesores;
    private Collection<Estudiante> listaAsistentes;

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
        this.profesores = new LinkedHashSet<>();
        this.listaAsistentes = new LinkedHashSet<>();
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void insertarProfesor(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del profesor/a para la excursión en " + localidad);
        String nombre = teclado.nextLine();
        profesores.add(nombre);
        System.out.println("Profesor añadido correctamente a la excursión a " + nombre_actividad);
    }

    public void inscribirAsistente(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Creando estudiante...");
        System.out.println("Inserta los apelidos: ");
        String apellidos = teclado.nextLine();
        System.out.println("Inserta el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Inserta el curso: ");
        String curso = teclado.nextLine();
        System.out.println("Inserta su edad: ");
        int edad = teclado.nextInt();

        listaAsistentes.add(new Estudiante(apellidos, nombre, curso, edad));

        System.out.println("Añadido correctamente el estudiante " + nombre + " " + apellidos + " del curso " + curso);
    }

    public static double total = 0;

    public double calcularImporteIngreso(){

        double entrada = 30.0;

        for (Estudiante asistente : listaAsistentes){
            total += entrada;
        }

        return total;
    }
    public static int contador = 0;

    public void verAsistentes(){

        System.out.println("Lista de inscritos para la actividad de " + nombre_actividad);

        for (Estudiante asistente : listaAsistentes){

            System.out.println("[" + ++contador + "]. " + asistente.getCurso() + " - " + asistente.getApellidos() + ", " + asistente.getNombre() + " (" + asistente.getEdad() + " años).");

        }

    }

    public void eliminarAsistentesPorEdad(int edad){

        for (Estudiante asistente : listaAsistentes) {
            if (asistente.getEdad() < edad){
                listaAsistentes.remove(asistente);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Excursion excursion = (Excursion) o;
        return Double.compare(precio, excursion.precio) == 0 && Objects.equals(nombre_actividad, excursion.nombre_actividad) && Objects.equals(localidad, excursion.localidad) && Objects.equals(profesores, excursion.profesores) && Objects.equals(listaAsistentes, excursion.listaAsistentes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_actividad, localidad, precio, profesores, listaAsistentes);
    }


    @Override
    public String toString() {
        return "Excursion{" +
                "nombre_actividad='" + nombre_actividad + '\'' +
                ", localidad='" + localidad + '\'' +
                ", precio=" + precio +
                ", profesores=" + profesores +
                ", listaAsistentes=" + listaAsistentes +
                '}';
    }
}
