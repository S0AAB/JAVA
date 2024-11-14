
    public static void main(String[] args) {

        // Bucle FOR: Contar del 1 al 5 (forma básica)
        System.out.println("Bucle FOR básico:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número (for básico): " + i);
        }

        // Bucle FOR con decremento
        System.out.println("\nBucle FOR con decremento:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Número (for decremento): " + i);
        }

        // Bucle FOR anidado
        System.out.println("\nBucle FOR anidado:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Bucle WHILE: Contar del 1 al 5
        System.out.println("\nBucle WHILE:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Número (while): " + i);
            i++;
        }

        // Bucle WHILE infinito con condición de salida
        System.out.println("\nBucle WHILE infinito con condición de salida:");
        i = 1;
        while (true) {
            System.out.println("Número (while infinito): " + i);
            if (i == 5) {
                break;  // Romper el bucle si i llega a 5
            }
            i++;
        }

        // Bucle DO-WHILE: Contar del 1 al 5
        System.out.println("\nBucle DO-WHILE:");
        i = 1;
        do {
            System.out.println("Número (do-while): " + i);
            i++;
        } while (i <= 5);

        // Bucle DO-WHILE que se ejecuta al menos una vez (aunque la condición sea falsa)
        System.out.println("\nBucle DO-WHILE con condición falsa desde el principio:");
        i = 6; // Iniciamos con i=6, condición es i<=5 (falsa)
        do {
            System.out.println("Este mensaje aparece una vez a pesar de la condición (do-while): " + i);
        } while (i <= 5);

        // Bucle FOR-EACH: Recorrer elementos de un array
        System.out.println("\nBucle FOR-EACH en un array:");
        String[] nombres = {"Ana", "Luis", "Carlos", "Marta"};
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // Bucle FOR-EACH con lista
        System.out.println("\nBucle FOR-EACH en una lista:");
        java.util.List<Integer> numeros = java.util.Arrays.asList(10, 20, 30, 40, 50);
        for (int numero : numeros) {
            System.out.println("Número en lista: " + numero);
        }
    }

