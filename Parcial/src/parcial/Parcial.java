
package parcial;
import java.util.Scanner;  

public class Parcial {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("Parcial", "Brayan", 2, 0);

        
        Scanner scanner = new Scanner(System.in);
        Libro libro2 = new Libro();

      
        System.out.println("Ingrese los datos para el segundo libro:");

        System.out.print("Titulo: ");
        libro2.setTitulo(scanner.nextLine());

        System.out.print("Autor: ");
        libro2.setAutor(scanner.nextLine());

        System.out.print("Numero de ejemplares: ");
        libro2.setNumeroEjemplares(scanner.nextInt());

        System.out.print("Numero de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(scanner.nextInt());

        
        System.out.println("\nDatos del libro 1:");
        System.out.println(libro1);

        System.out.println("\nDatos del libro 2:");
        System.out.println(libro2);

        
        System.out.println("\nSe realizara un prestamo para el libro 1");
        if (libro1.prestar()) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }

        System.out.println("\nDatos del libro 1 después del préstamo:");
        System.out.println(libro1);

       
        System.out.println("\nSe realizara una devolución para el libro 1...");
        if (libro1.devolver()) {
            System.out.println("Devolucion exitosa");
        } else {
            System.out.println("No hay libros prestados para devolver");
        }

        System.out.println("\nDatos del libro 1 después de la devolucion:");
        System.out.println(libro1);

        scanner.close();  
    }
}


