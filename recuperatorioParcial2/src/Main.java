import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Tienda {
    private int ventas;
    private int devoluciones;
    private int totalVentas;

    public Tienda(int ventas, int devoluciones, int totalVentas) {
        this.ventas = ventas;
        this.devoluciones = devoluciones;
        this.totalVentas = totalVentas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(int devoluciones) {
        this.devoluciones = devoluciones;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Ventas: " + ventas + ", Devoluciones: " + devoluciones + ", Total de Ventas: " + totalVentas;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaGestionTiendas sistema = new SistemaGestionTiendas();

        while (true) {
            // Menú
            System.out.println("-------- Menú Principal --------");
            System.out.println("1. Agregar Tienda");
            System.out.println("2. Eliminar Tienda");
            System.out.println("3. Buscar Tienda");
            System.out.println("4. Listar Tiendas");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la tienda:");
                    String nombreTienda = scanner.nextLine();
                    System.out.println("Ingrese las ventas de la tienda:");
                    int ventas = scanner.nextInt();
                    System.out.println("Ingrese las devoluciones de la tienda:");
                    int devoluciones = scanner.nextInt();
                    System.out.println("Ingrese el total de ventas de la tienda:");
                    int totalVentas = scanner.nextInt();

                    Tienda nuevaTienda = new Tienda(ventas, devoluciones, totalVentas);
                    sistema.agregarTienda(nombreTienda, nuevaTienda);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la tienda a eliminar:");
                    String nombreEliminar = scanner.nextLine();
                    sistema.eliminarTienda(nombreEliminar);
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la tienda a buscar:");
                    String nombreBuscar = scanner.nextLine();
                    Tienda tiendaEncontrada = sistema.buscarPorNombre(nombreBuscar);
                    if (tiendaEncontrada != null) {
                        System.out.println("Tienda encontrada: " + tiendaEncontrada);
                    } else {
                        System.out.println("No se encontró una tienda con ese nombre.");
                    }
                    break;

                case 4:
                    sistema.listarTiendas();
                    break;

                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
