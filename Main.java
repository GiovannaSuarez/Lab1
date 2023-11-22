import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // MENÚ
            System.out.println("------------------");
            System.out.println("|   BIENVENIDO   |");
            System.out.println("------------------");
            System.out.println("| MENÚ PRINCIPAL |");
            System.out.println("(1) ANALIZAR ADN");
            System.out.println("(2) SALIR");
            System.out.println("------------------");

            int option = scanner.nextInt();

            if (option == 1) {
                String[] adn = new String[6];
                System.out.println("INGRESE LA SECUENCIA DE ADN");
                System.out.println("Recuerde: Ingresar fila por fila  -  ingresar únicamente letras A T C G");
                System.out.println("------------------");

                // Ingreso de filas:
                for (int i = 0; i < 6; i++) {
                    System.out.print("Ingrese la " + (i + 1) + "° fila de combinación de bases nitrogenadas : ");
                    adn[i] = scanner.next().toUpperCase();
                }

                // Validación de datos ingresados utilizando la clase MutanteDetector
                if (MutanteDetector.validarADN(adn)) {
                    System.out.println("--- Datos ingresados correctamente ---");

                    // Datos correctos, se llama a la función que analiza el ADN utilizando la clase MutanteDetector
                    if (MutanteDetector.esMutante(adn)) {
                        System.out.println("| FELICITACIONES - Hemos encontrado un mutante |");
                        break;
                    } else {
                        System.out.println("| LO SIENTO - Es un humano |");
                        break;
                    }
                } else {
                    // Se ingresaron letras distintas a: ACTG:
                    System.out.println("| ERROR | DATOS INGRESADOS INCORRECTAMENTE |");
                    System.out.println("---Intente nuevamente por favor---");
                    System.out.println();
                    continue;
                }

            } else if (option == 2) { // Salir del menú
                System.out.println("SALIENDO DEL PROGRAMA");
                break;
            } else {
                // Opción ingresada distinta a las opciones dadas
                System.out.println("| ERROR | OPCIÓN INGRESADA INCORRECTA |");
                System.out.println("Intente nuevamente por favor: ");
                System.out.println(" ");
                continue;
            }
        }

        scanner.close();
    }
}