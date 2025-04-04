package org.example.problema2;

public class AppExcursiones {

    public static void main(String[] args) {

        System.out.println("******* APP EXCURSIONES *******");

        Excursion terramitica = new Excursion("Terra Mitica", "Benidorm", 30.0);

        terramitica.insertarProfesor();

        System.out.println();

        terramitica.inscribirAsistente();
        System.out.println();
        terramitica.inscribirAsistente();
        System.out.println();
        terramitica.inscribirAsistente();
        System.out.println();
        terramitica.inscribirAsistente();
        System.out.println();

        terramitica.verAsistentes();
        System.out.println();

        terramitica.eliminarAsistentesPorEdad(16);
        System.out.println("Después de eliminar a los menores de 16 años: ");
        terramitica.verAsistentes();
        System.out.println();

        System.out.println("Importe a ingresar para la actividad " + terramitica.getNombre_actividad() + " en " + terramitica.getLocalidad() + ": " + terramitica.calcularImporteIngreso() + " €.");

    }
}
