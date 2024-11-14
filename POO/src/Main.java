// Clase base: Animal
class Animal {
    // Atributo de la clase Animal
    String nombre;

    // Constructor de la clase Animal
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método de la clase base
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Sobrecarga de método hacerSonido
    void hacerSonido(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("El animal hace un sonido.");
        }
    }

    // Método para mostrar el nombre del animal
    void mostrarNombre() {
        System.out.println("El nombre del animal es: " + this.nombre);
    }
}

// Clase derivada que sobrescribe el método de la clase base
class Perro extends Animal {
    // Constructor de la clase Perro
    public Perro(String nombre) {
        super(nombre); // Llamada al constructor de la clase base
    }

    // Sobrescribe el método hacerSonido de la clase Animal
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    // Sobrecarga de método hacerSonido en la clase Perro
    void hacerSonido(int veces, String sonido) {
        for (int i = 0; i < veces; i++) {
            System.out.println("El perro " + sonido + ".");
        }
    }
}

// Clase derivada que sobrescribe el método de la clase base
class Gato extends Animal {
    // Constructor de la clase Gato
    public Gato(String nombre) {
        super(nombre); // Llamada al constructor de la clase base
    }

    // Sobrescribe el método hacerSonido de la clase Animal
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de tipo Animal
        Animal animal = new Animal("Animal Genérico");
        animal.mostrarNombre(); // Salida: El nombre del animal es: Animal Genérico
        animal.hacerSonido();  // Salida: El animal hace un sonido.

        // Sobrecarga de método en la clase Animal
        animal.hacerSonido(3); // Salida: El animal hace un sonido. (3 veces)

        // Creación de un objeto de tipo Perro
        Perro perro = new Perro("Rex");
        perro.mostrarNombre(); // Salida: El nombre del animal es: Rex
        perro.hacerSonido(); // Salida: El perro ladra.

        // Sobrecarga de método en la clase Perro
        perro.hacerSonido(2, "ladra"); // Salida: El perro ladra. (2 veces)

        // Creación de un objeto de tipo Gato
        Gato gato = new Gato("Miau");
        gato.mostrarNombre(); // Salida: El nombre del animal es: Miau
        gato.hacerSonido();  // Salida: El gato maúlla.

        // Polimorfismo: Usando la referencia de tipo Animal para un objeto de tipo Perro
        Animal miPerro = new Perro("Firulais");
        miPerro.mostrarNombre(); // Salida: El nombre del animal es: Firulais
        miPerro.hacerSonido();  // Salida: El perro ladra.

        // Polimorfismo: Usando la referencia de tipo Animal para un objeto de tipo Gato
        Animal miGato = new Gato("Tommy");
        miGato.mostrarNombre(); // Salida: El nombre del animal es: Tommy
        miGato.hacerSonido();  // Salida: El gato maúlla.
    }
}
