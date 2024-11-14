import java.util.*;

    public static void main(String[] args) {

        // *********************
        // Arreglos (Arrays)
        // *********************

        // Arreglo de enteros
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Arreglo de enteros:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Arreglo de cadenas
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("\nArreglo de cadenas:");
        for (String name : names) {
            System.out.println(name);
        }

        // *********************
        // Listas (List)
        // *********************

        // Lista de enteros (ArrayList)
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("\nLista de enteros:");
        for (Integer num : numberList) {
            System.out.println(num);
        }

        // Lista de cadenas (ArrayList)
        List<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("David");

        System.out.println("\nLista de cadenas:");
        for (String name : nameList) {
            System.out.println(name);
        }

        // *********************
        // Conjuntos (Set)
        // *********************

        // Conjunto de enteros (HashSet)
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);
        numberSet.add(50);
        numberSet.add(20);  // Un valor duplicado

        System.out.println("\nConjunto de enteros (sin duplicados):");
        for (Integer num : numberSet) {
            System.out.println(num);  // Los duplicados no se muestran
        }

        // Conjunto de cadenas (HashSet)
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Alice");
        nameSet.add("Bob");
        nameSet.add("Charlie");
        nameSet.add("David");
        nameSet.add("Alice");  // Un valor duplicado

        System.out.println("\nConjunto de cadenas (sin duplicados):");
        for (String name : nameSet) {
            System.out.println(name);  // Los duplicados no se muestran
        }

        // *********************
        // Mapas (Map)
        // *********************

        // Mapa de enteros a cadenas (HashMap)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, "David");

        System.out.println("\nMapa de enteros a cadenas:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Mapa de cadenas a enteros (HashMap)
        Map<String, Integer> nameToAgeMap = new HashMap<>();
        nameToAgeMap.put("Alice", 25);
        nameToAgeMap.put("Bob", 30);
        nameToAgeMap.put("Charlie", 35);
        nameToAgeMap.put("David", 40);

        System.out.println("\nMapa de cadenas a enteros:");
        for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }


        // *********************
        //  Stack
        // *********************

        // Pila (Stack)
        Stack<String> stack = new Stack<>();
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Charlie");

        System.out.println("\nPila (Stack):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());  // Devuelve el último valor insertado
        }
    }

