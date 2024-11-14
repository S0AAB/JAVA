

    public static void main(String[] args) {

        // Ejemplo de if
        int age = 20;
        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        }

        // Ejemplo de if-else
        int score = 16;
        if (score >= 18) {
            System.out.println("Aprobado con buena nota.");
        } else {
            System.out.println("No aprobaste.");
        }

        // Ejemplo de if-else if-else
        int mark = 75;
        if (mark >= 90) {
            System.out.println("Excelente");
        } else if (mark >= 75) {
            System.out.println("Bien");
        } else if (mark >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Ejemplo de switch
        int dayOfWeek = 3;  // 1: Lunes, 2: Martes, etc.
        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        // Usando operadores lógicos
        boolean hasLicense = true;
        if (age >= 18 && hasLicense) {
            System.out.println("Puedes conducir.");
        } else {
            System.out.println("No puedes conducir.");
        }

        // Ejemplo con operador lógico OR (||)
        boolean isStudent = false;
        boolean hasDiscount = true;
        if (isStudent || hasDiscount) {
            System.out.println("Tienes un descuento.");
        } else {
            System.out.println("No tienes descuento.");
        }

        // Ejemplo con operador lógico NOT (!)
        boolean isWeekend = false;
        if (!isWeekend) {
            System.out.println("Es un día laborable.");
        } else {
            System.out.println("Es fin de semana.");
        }

        // Más ejemplos de condicionales con arrays

        // Condicional en arreglo
        int[] scores = {90, 80, 70};
        for (int scoreValue : scores) {
            if (scoreValue >= 85) {
                System.out.println("Nota alta: " + scoreValue);
            } else {
                System.out.println("Nota baja: " + scoreValue);
            }
        }

        // Condicional con arreglo de cadenas
        String[] hobbies = {"Reading", "Cycling", "Hiking"};
        for (String hobby : hobbies) {
            if (hobby.equals("Cycling")) {
                System.out.println("¡Te gusta montar bicicleta!");
            } else {
                System.out.println("Tu hobby es: " + hobby);
            }
        }

    }

