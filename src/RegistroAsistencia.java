import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroAsistencia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> asistentes = new HashSet<>();

        System.out.println("Registro de asistencia");
        System.out.println("Escribe el nombre de la persona (o 'fin' para terminar):");


        boolean continuar = true;


        while (continuar == true) {
            String nombre = scanner.nextLine().toLowerCase();

            if (nombre.equalsIgnoreCase("fin")){
                continuar = false;
            } else if (asistentes.add(nombre)) {
                System.out.println("Asistencia registrada: " + nombre);
            } else {
                System.out.println(nombre + " ya está registrado.");
            }

        }

        System.out.println("Lista de asistentes: ");
        for (String persona : asistentes) {
            System.out.println("- " + persona);
        }


        scanner.close();
    }
}
