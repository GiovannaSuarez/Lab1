class MutanteDetector {

    // Función para validar entrada de datos
    public static boolean validarADN(String[] adn) {
        boolean validation = true;
        if (adn.length == 6) {
            for (String fila : adn) {
                for (char base : fila.toCharArray()) {
                    if (base != 'A' && base != 'C' && base != 'G' && base != 'T') {
                        return false;
                    }
                }
            }
        } else {
            System.out.println("--- ERROR - las filas no tienen 6 caracteres ---");
            validation = false;
        }
        return validation;
    }

    // Función para saber si es mutante
    public static boolean esMutante(String[] adn) {
        int contador = 0;
        char[][] matrizADN = new char[6][6];

        for (int i = 0; i < 6; i++) {
            matrizADN[i] = adn[i].toCharArray();
        }

        // Resto de la lógica para determinar si es mutante...

        return contador >= 2;
    }
}