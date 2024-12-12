package components;

import model.Propietary;

import java.util.Scanner;

public class PropietaryReader {
    private final Scanner scanner;

    public PropietaryReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Propietary read() {
        System.out.println("Introduce tu NIF");
        String nif = scanner.nextLine();
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce tu apellidos");
        String surname = scanner.nextLine();
        return new Propietary(nif, name, surname);
    }
}
